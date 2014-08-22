/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imagestudio;

import java.io.File;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author renanmfd
 */
public class ImageStudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("images/img0.png");
        
    }
    
    public int getObject(Object obj) {
    for (Field field : obj.getClass().getDeclaredFields()) {
        try {
            //field.setAccessible(true); // if you want to modify private fields
            System.out.println(field.getName()
                    + " - " + field.getType()
                    + " - " + field.get(obj));
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(ImageStudio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ImageStudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
}
