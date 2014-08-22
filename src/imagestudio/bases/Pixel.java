/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imagestudio.bases;

import imagestudio.debug.Debug;

/**
 * @author renanmfd
 */
public class Pixel {
    
    private static final String WARNING_PIXEL_ARRAYSIZE = 
                "Wrong array size passed to Pixel class.";
    
    private int red;
    private int green;
    private int blue;
    
    private int alpha;

    // Constructors
    
    public Pixel() {
        resetPixels();
    }
    
    public Pixel( int[] rgb ){
        if( rgb.length != 4 ){
            resetPixels();
            Debug.print( WARNING_PIXEL_ARRAYSIZE );
        }
        else{
            red = rgb[0];
            green = rgb[1];
            blue = rgb[2];
            alpha = rgb[3];
        }
    }
    
    public Pixel( int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = 255;
    }
    
    public Pixel( int red, int green, int blue, int alpha) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }
    
    public Pixel( float red, float green, float blue, float alpha) {
        this.red = (int) (255*red);
        this.green = (int) (255*green);
        this.blue = (int) (255*blue);
        this.alpha = (int) (255*alpha);
    }
    
    private void resetPixels(){
        red = 0;
        green = 0;
        blue = 0;
        alpha = 255;
    }
    
    // Getters and Setters
    
    public int[] getRGB(){
        return new int[]{ red, green, blue}; 
    }
    public void setRGB( int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue; 
    }
    
    public int[] getRGBa(){
        return new int[]{ red, green, blue, alpha}; 
    }
    public void setRGBa( int red, int green, int blue, int alpha){
        this.red = red;
        this.green = green;
        this.blue = blue; 
    }

    public int getRed() {
        return red;
    }
    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }
    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }
    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getAlpha() {
        return alpha;
    }
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    
    public float getAlphaFloat() {
        return (float) (alpha/255);
    }
    public void setAlphaFloat(float alpha) {
        this.alpha = (int) (255*alpha);
    }
    
}
