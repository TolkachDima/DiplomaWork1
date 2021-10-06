import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileSystemClass {
    public static int fileNum = 0;
    public String filePath = "C:\\Users\\USER\\Desktop\\photoshop\\ElementScreenshot.png";
    public File file = new File(filePath);
    public Date date = new Date();
    public String dateSTR = date.toGMTString().replace(':',';');
    public String directoryPathname = String.format("C:\\Users\\USER\\Desktop\\photoshop\\%s crypto Name", dateSTR);
    public String photoPathname = String.format("%s\\%s.png", directoryPathname, fileNum);
    public File directoryPathFile = new File(directoryPathname);
    public File photoPathFile = new File(photoPathname);

    void createNewDirectory() {
        System.out.println(directoryPathname);
        directoryPathFile.mkdir();
    }

    void writeRefactoredPhoto(BufferedImage refactoredImage, String fileName) throws IOException {
        String methodPhotoPathname = String.format("%s\\%s.png", directoryPathname, fileName);
        File methodPhotoPathFile = new File(methodPhotoPathname);
        ImageIO.write(refactoredImage, "png", methodPhotoPathFile);
    }

}
