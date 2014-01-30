// William Ames, Fall 2010
// Read stars.xml file, put into a list

import javax.xml.parsers.*; 
import org.xml.sax.*;  
import java.io.*;
import java.util.*;
import org.w3c.dom.*;

public class ReadXMLStars
{
    private Document document;
 
    public void readFile(String fileName, List<Star> stars)
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
        	   DocumentBuilder builder = factory.newDocumentBuilder();
        	   document = builder.parse(new File(fileName));
        	   Element docElement = document.getDocumentElement();

               	NodeList starNodes = docElement.getElementsByTagName("star");
               	for (int i=0; i<starNodes.getLength(); ++i) {
               		Element starE    = (Element)(starNodes.item(i));
               		Element point    = (Element)starE.getElementsByTagName("point").item(0);
               		Element velocity = (Element)starE.getElementsByTagName("velocity").item(0);
               		Element color    = (Element)starE.getElementsByTagName("color").item(0);
               		float x = Float.parseFloat(point.getAttribute("x"));
               		float y = Float.parseFloat(point.getAttribute("y"));
               		float dx = Float.parseFloat(velocity.getAttribute("dx"));
               		float dy = Float.parseFloat(velocity.getAttribute("dy"));
               		float red   = Float.parseFloat(color.getAttribute("red"));
               		float green = Float.parseFloat(color.getAttribute("green"));
               		float blue  = Float.parseFloat(color.getAttribute("blue"));
                 /* System.out.println(" x=" + x +
 				                       " y=" + y +
				                       " dx=" + dx +
				                       " dy=" + dy +
				                       " red=" + red +
				                       " green=" + green +
				                       " blue=" + blue); */

               		
               		// The next two lines assume you have a Star class,
               		// and some kind of List for the star collection.
               		// You may alter the next two lines if necessary.
               	    Star star = new Star(x,y,dx,dy,red,green,blue);
               	    stars.add(star);
               	}
        } catch (SAXException sxe) {
           System.out.println("Error: " + sxe);
           System.exit(1);
        } catch (ParserConfigurationException pce) {
            System.out.println("Error: " + pce);
            System.exit(1);
        } catch (IOException ioe) {
            System.out.println("Error: " + ioe);
            System.exit(1);
        }
    }
}