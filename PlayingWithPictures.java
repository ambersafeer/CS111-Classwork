import java.awt.Color; // imports the abstract data type color so that we can use it in this program

import StdOut;

public class PlayingWithPictures {

    // converts the argument object c of type color into gray
    public static Color convertToGray (Color c){

        // readin the red green and blue components of the Color object
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();

        // compute luminance
        double lum = 0.299 * r + 0.587 * g + 0.114 * b;
        int roundedLum = (int)Math.round(lum); // rounding to int

        // create a new Color object with all components of the same value
        Color grayC = new Color(roundedLum, roundedLum, roundedLum);
        return grayC;
    }

    public static void main (String[] args){

        // reference to an object of type Picture
        // the object has a 2d array of pixels (each pixel is a Color object)
        Picture picHank = new Picture("hank.jpg");

        // invoking the show() method on the object pointed by picHank
        

        int height = picHank.height(); // number of rows of pixels
        int width = picHank.width(); // number of columns of pixels

        StdOut.println("The number of pixels in the picture is " + width + " by " + height);

        //Picture picAC = new Picture("animalcrossing.jpg");
        //picAC.show();
        //StdOut.println("The number of pixels in the picture is " + picAC.width() + " by " + picAC.height());

        for ( int column = 0; column < width; column++){
            for (int row = 0; row < height; row++){

                Color origPixelColor = picHank.get(column, row); // retrieve the color of pixel col,row

                Color grayPixelColor = convertToGray(origPixelColor);
                
                picHank.set(column, row, grayPixelColor); // replaces the original pixel with the new grayed out pixel object


            }
        }
        picHank.show();

    }
}
