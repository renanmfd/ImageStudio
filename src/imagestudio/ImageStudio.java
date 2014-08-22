/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imagestudio;

import imagestudio.bases.Image;

/**
 * @author renanmfd
 */
public class ImageStudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Image loadImage = ImageLoad.loadImageImg("images/img1.png");
    }
}
