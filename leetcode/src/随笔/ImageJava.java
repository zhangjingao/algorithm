package 随笔;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author zjg
 * <p> 2018/12/27 14:46 </p>
 */
public class ImageJava {

    public static void main(String[] args) {
        int height = 500;
        int width = 500;
        BufferedImage image = null;
        File file = null;

        try {
            file = new File("C:\\Users\\zjg\\Pictures\\order.png");
            image = new BufferedImage(width, height, BufferedImage.OPAQUE);
            image = ImageIO.read(file);
            System.out.println("读取图片： "+image);

        } catch (Exception e) {

        }

        File terget = new File("C:\\Users\\zjg\\Pictures\\target.png");
        try {
            ImageIO.write(image, "png",terget);
            System.out.println("write success");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
