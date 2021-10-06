import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TesseractClass {
    Tesseract tesseract = new Tesseract();




    public String analyseText(String refactoredImageLink) throws TesseractException, IOException {
        File file = new File(refactoredImageLink);
        BufferedImage imageToSearch = ImageIO.read(file);
        System.out.println(tesseract.doOCR(imageToSearch));



        return "";
    }



}
