package promhs;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

/**
 *
 * @author 20103295 Ni Putu Eka Sepiantini
 */
public class loadIMG {
    
    public static BufferedImage loadImage(String ref){
        BufferedImage bimg = null;
        try{
            bimg = ImageIO.read(new File(ref));
            
        }catch(Exception e){}
        return bimg;
    }
}
