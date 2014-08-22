/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imagestudio;

import imagestudio.bases.Image;
import imagestudio.debug.Debug;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * @author renanmfd
 */
public class ImageLoad {
    
    /**
     * @param filepath String containing the path of the image file to be opened.
     * 
     * @return An object of the class Image, containing the image data. Return
     * null if the image doesn't exist or cannot be uploaded.
     */
    public static BufferedImage loadImage( String filepath ){
        BufferedImage output = null;
        try {
            File f = new File( filepath );
            if( !f.exists() ) return null;
            output = ImageIO.read( f );
        } catch (IOException ex) {
            Debug.printError( ex.getMessage() );
            return null;
        } catch (Exception e){
            Debug.printError( e.getMessage() );
            return null;
        }
        return output;
    }
    
    /**
     * @param filepath String containing the path of the image file to be opened.
     * 
     * @return An object of the class Image, containing the image data.
     */
    public static Image loadImageImg( String filepath ){
        Image output = new Image();
        BufferedImage img = loadImage( filepath );
        Raster raster = img.getData();
        String out = "";
        int height = raster.getHeight();
        int width= raster.getWidth();
        for ( int i=width-2 ; i<width ; i++ ){
            for ( int j=0 ; j<height ; j++ ){
                int []pixel = new int[4];
                raster.getPixel(i, j, pixel);
                for( int p : pixel ){
                    out += p+" ";
                }
                out += "\n";
            }
            System.out.println("Line "+i+" of "+height);
        }
        System.out.println("----------------------------");
        System.out.println( out );
        return output;
    }
}
