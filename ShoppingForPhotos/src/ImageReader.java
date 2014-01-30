/*
   Image file reader
   William Ames
   Fall 2009
   
   The general procedure for using this class is:

     Call the static getImage method, passing in the name of the file that contains
     the image.  Types gif, jpg, or png will work.  getImage returns a two dimensional
     array, each element of which contains a Color, suitable for passing to
     graphics.setColor().  You can use the .length field of the resulting array to
     determine the number of rows, and the .length field of the first element
     of the array (array[0].length) to determine the number of columns.  It is guaranteed
     that all rows are the same length (not "ragged").
*/

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.imageio.stream.*;

// Read image from a file, into 2D array of Color
public class ImageReader
{
    public static Color[][] getImage(String fileName) {
    	BufferedImage picture = null;
    	try {
			picture = ImageIO.read(new FileImageInputStream(new File(fileName)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
        return reformatPixels(picture);
    }

    private static Color[][] reformatPixels(BufferedImage picture) {
        int height = picture.getHeight(null);
        int width  = picture.getWidth(null);
        if (height <= 0 || width <= 0) {
            System.out.println("Error reading file.");
            System.exit(1);
        }
        Color[][] array = new Color[height][width];
        for (int row=0; row<height; ++row)
            for (int col=0; col<width; ++col) {
                int pixel = picture.getRGB(col,row); // image uses x then y
                array[row][col] = new Color(pixel);
            }
        return array;
    }
}