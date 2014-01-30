/**
 *  Gather stock prices from the Web
 *  @author William Ames, Spring 09
 */

import java.io.*;
import java.nio.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;

public class Stock
{
        private float price = -1.f;  // -1 means not checked yet; 0 means error
        private String symbol;
        private long timeOfQuote;

        private static boolean debug=false;
        private static boolean first = true;
        private static List<WebStockServerManager> serverList;

        static
        {
            String number = "(\\d+\\.\\d*)";

            String yahooPattern = "Last Trade:</th><td[^>]*?><big><b>" +
                                  "<span[^>]*?>"
                                + number;
            WebStockServerManager yahoo = new WebStockServerManager("Yahoo",
                                      "http://finance.yahoo.com/q?s=",
                                      "",  // no suffix needed
                                      yahooPattern);

            String pcquotePattern = "Last:</div><div class=\"data\">"
                                  + number;
            WebStockServerManager pcquote = new WebStockServerManager("PCQuote",
                                      "http://www.pcquote.com/stocks/index.php?symbols=",
                                      "&x=0&y=0",  // suffix
                                      pcquotePattern);
/*
  // looks different after hours ??

            String cnnScans[]     = {"<td class=quoteprice>"};
            String cnnPattern     = "??"
                                  + number;
            WebStockServerManager cnn = new WebStockServerManager("CNN",
                                        "http://money.cnn.com/quote/quote.html?shownav=true&symb=",
                                        "",
                                        cnnPattern);
*/
/*
            String marketcenterPattern = "<td id=\"quote_last\" class=\"subheader\">\\s*&nbsp;"
                                       + number;
            WebStockServerManager marketcenter        = new WebStockServerManager("Marketcenter",
                                          "http://www.marketcenter.com/stocks/overview.action?sym=",
                                          "",
                                          marketcenterPattern);
*/
            String quotemediaPattern = "Last Price.*?<div class=\\\\\"qm_maintext\\\\\">"
                                     + number;
            WebStockServerManager quotemedia        = new WebStockServerManager("Quotemedia",
                                              "http://app.quotemedia.com/quotetools/quoteModule.go?toolWidth=500&action=showDetailedQuote&symbol=",
                                              "&targetsym=on",
                                              quotemediaPattern);

            serverList = new LinkedList<WebStockServerManager>();
            serverList.add(yahoo);
            serverList.add(pcquote);
            //serverList.add(cnn); // busted
            //serverList.add(marketcenter); // too complicated
            serverList.add(quotemedia);
        }

        public Stock()
        {
            this("CSCO"); // default symbol is Cisco
        }

        /**
         * Constructor.  Initialize a new stock
         * @param initialSymbol  the symbol of the publicly traded stock
         */
        public Stock(String initialSymbol)
        {
            setSymbol(initialSymbol);
            timeOfQuote = 0;
        }

        /**
         * Enable/Disable debugging of the Stock class itself.
         * Intended for use by authors of the Stock class only.
         * @param worried true to turn debugging on, false to turn it off.  Initially false.
         */
        public static void setDebug(boolean worried)
        {
            debug = worried;
            WebStockServerManager.setDebug(worried);
        }

        /**
         * @return the current stock symbol
         */
        public String getSymbol()
        {
                return symbol;
        }

        /**
         * Change the symbol that this stock refers to
         * @param newSymbol the new stock symbol
         */
        public void setSymbol(String newSymbol)
        {
                symbol = newSymbol;
                price = -1.f;  // force lookup next time price is enquired
        }

        /**
         * Gets the current price.
         * If about 30 seconds have elapsed since the last price inquiry
         * for this stock, the Web is queried for the latest price.
         *
         * If less than 30 seconds have passed, then the previous price is returned.
         * This is intended to keep network traffic low, especially for programs
         * like stock tickers that inquire the current price often.
         * @return the current stock price
         */
        public float getPrice()
        {
            if ( (price < 0) || (System.currentTimeMillis()-timeOfQuote >= 30000) )
            {
                int firstServer = (int)(Math.random()*serverList.size()); // random first server
                for (int i=0; i<serverList.size(); ++i) {
                    WebStockServerManager s = serverList.get((firstServer+i)%serverList.size());
                    price = s.getPrice(symbol);
                    if (price > 0) // success
                        break;
                }
              timeOfQuote = System.currentTimeMillis(); // update the time, whether succeeded or not
            }
            return price;
        }

        /**
         * For debugging and monitoring purposes.  Reports how many attempts and
         * successes there were for each of the web sites used to obtain
         * the stock prices.
         * Results are printed to System.out, not returned.
         */
        public static void reportSuccesses()
        {
            for (WebStockServerManager s: serverList)
            {
                s.showSuccesses();
            }
        }

        // for testing only !!
        public static void main(String[] args)
        {
            Stock[] stockList = new Stock[10];
            //Stock.setDebug(true);
            System.out.println("Attempting to open " +
                               stockList.length + " stocks");
            for (int i=0; i<stockList.length; ++i)
            {
                System.out.print(".");
                stockList[i] = new Stock();
                stockList[i].getPrice();
            }
            System.out.println();
            for (Stock s:stockList) {
                System.out.println(s.getSymbol() + ": " + s.getPrice());
            }
            Stock.reportSuccesses();
        }
}

// helper class, used by Stock class above
class WebStockServerManager
{
    private String serverName;
    private String urlPrefix;
    private String urlSuffix;
    private Pattern pattern;
    private int attempts=0, successes=0;
    private static boolean debug=false;

    public WebStockServerManager(String name, String prefix, String suffix, String pat)
    {
        serverName = name;
        urlPrefix  = prefix;
        urlSuffix  = suffix;
        pattern    = Pattern.compile(pat);

        attempts   = 0;
        successes  = 0;
    }

    public static void setDebug(boolean worried)
    {
        debug = worried;
    }

    public float getPrice(String symbol)
    {
        ++attempts;
        float price = 0.f;
        try {
            String url = urlPrefix + (symbol.toLowerCase()) + urlSuffix;
            if (debug) System.out.println("Opening " + url);

            URL page = new URL(url);
            InputStreamReader is = new
                InputStreamReader(page.openStream());  // pages are up to about 60KB

            char[] content = new char[200000];
            int totalRead = 0;
            while (true) {
                int length = is.read(content, totalRead, content.length-totalRead);
                if (length == -1)
                    break;
                totalRead += length;
                if (totalRead == content.length)
                    break;
                if (debug) System.out.println("Read from server: " + length + " chars"
                            + ", totalRead: " + totalRead);
            }

            char[] shortContent = new char[totalRead];
            System.arraycopy(content, 0, shortContent, 0, totalRead);
            content = null; // let garbage collector have it

            CharBuffer cb = CharBuffer.wrap(shortContent);

            Matcher matcher = pattern.matcher(cb);

            String priceString = "0";
            if (matcher.find()) {
                if(debug) System.out.println("Found group 0: "+matcher.group(0));
                if(debug) System.out.println("Found group 1: "+matcher.group(1));
                //if(debug) System.out.println("Found group 2: "+matcher.group(2));
                priceString = matcher.group(1);
                if(debug) System.out.println("Found: " + priceString);
            }
            price = Float.parseFloat(priceString);
            if (price > 0)
                ++successes;
            is.close();
            return price;
        }
        catch (MalformedURLException urle) {
            if (debug) System.out.println("Malformed URL Exception: " + urle);
            price = 0.f;
        } catch (IOException ioe) {
            if (debug) System.out.println("IOException: " + ioe);
            price = 0.f;
        }
        return price;
    }

     public void showSuccesses()
    {
        System.out.println(serverName + " attempts: " + attempts + "  successes: " + successes);
    }
}