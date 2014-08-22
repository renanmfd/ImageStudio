/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imagestudio.debug;

/**
 * @author renanmfd
 */
public class Debug {
    
    /**
     * Single interface to print all the errors and debug strings throughout the 
     * program.
     * 
     * @param debugText Text to be printed.
     */
    public static void print( String debugText ){
        System.out.println( "-> "+debugText );
    }
    
    /**
     * Single interface to print all the errors strings throughout the 
     * program.
     * 
     * @param errorText Text of the error to be printed.
     */
    public static void printError( String errorText ){
        System.err.println( "x "+errorText );
    }

}
