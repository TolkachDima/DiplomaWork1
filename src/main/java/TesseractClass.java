import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TesseractClass {
    Tesseract tesseract = new Tesseract();


    public Double analyseText(String refactoredImageLink) throws TesseractException, IOException {
        tesseract.setTessVariable("user_defined_dpi", "300");
        tesseract.setTessVariable("tessedit_char_whitelist", "0123456789.");

        File file = new File(refactoredImageLink);
        BufferedImage imageToSearch = ImageIO.read(file);
        System.out.println(tesseract.doOCR(imageToSearch));

        Double d = Double.parseDouble(tesseract.doOCR(imageToSearch));

        return d;
    }



}
