import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CompareImageTest {

    @Test
    public void testForImage() throws IOException {
        BufferedImage image1 = ImageIO.read(new File("C:\\ImageToCompare\\download1.jpg"));
        BufferedImage image2 = ImageIO.read(new File("C:\\ImageToCompare\\download2.jpg"));
        int widthImage1 = image1.getWidth();
        int widthImage2 = image2.getWidth();
        int heightImage1 = image1.getHeight();
        int heightImage2 = image2.getHeight();
        if((widthImage1!=widthImage2) || heightImage1!=heightImage2){
            System.out.println("Both images have differrent dimentions");
        } else{
            long difference = 0;
            for(int a=0; a<heightImage1; a++){
                for(int i = 0; i<widthImage1; i++){
                    int pixelImage1 = image1.getRGB(i, a);
                    Color colorImage1 = new Color(pixelImage1, true);
                    int redImageColor1 = colorImage1.getRed();
                    int greenImageColor1 = colorImage1.getGreen();
                    int blueImageColor1 = colorImage1.getBlue();
                    int pixelImage2 = image2.getRGB(i, a);
                    Color colorImage2 = new Color(pixelImage2, true);
                    int redImageColor2 = colorImage2.getRed();
                    int greenImageColor2 = colorImage2.getGreen();
                    int blueImageColor2 = colorImage2.getBlue();
                    long sumOfRGB = Math.abs(redImageColor1-redImageColor2) + Math.abs(greenImageColor1-greenImageColor2)+
                            Math.abs(blueImageColor1-blueImageColor2);
                    difference = difference+sumOfRGB;
                }
            }
            double average = difference/(widthImage1*heightImage1*3);
            double percentage = (average/255)*100;
            if(percentage == 0.0){
                System.out.println("The images are the same");
            } else
            System.out.println("The difference between images is: " + percentage);
        }
    }

    @Test
    public void ImageTestWithHas(){

    }
}
