import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class PhotoEditorClass {

    FileSystemClass fileSystemClass = new FileSystemClass();

//    public BufferedImage editPhoto(int r, int g, int b, String fileNum) {
//
//        try {
//            BufferedImage imageToSearch = ImageIO.read(fileSystemClass.file);
//
//            int width = imageToSearch.getWidth();
//            int height = imageToSearch.getHeight();
//
//            Color colorToFind = new Color(r, g, b);
//            int[] pixelCoordinates = colorSearch(colorToFind, imageToSearch);
//
//            BufferedImage image = ImageIO.read(fileSystemClass.file);
//            BufferedImage refactoredImage = ImageIO.read(fileSystemClass.file);
//
//
//            image = image.getSubimage(pixelCoordinates[0], pixelCoordinates[1], 115, 35);
//
//
//            File directoryPathFile = new File(fileSystemClass.directoryPathname);
//            File photoPathFile = new File(fileSystemClass.photoPathname);
//            directoryPathFile.mkdir();
//            ImageIO.write(image, "png", photoPathFile);
//
//            Graphics2D g2d = refactoredImage.createGraphics();
//            g2d.setColor(Color.BLACK);
//            g2d.fillRect(pixelCoordinates[0], pixelCoordinates[1], width, 35);
//            g2d.dispose();
//
//            ImageIO.write(refactoredImage, "png", fileSystemClass.file);
//            return refactoredImage;
//            System.out.println("Found pixel at (" + pixelCoordinates[0] + "," + pixelCoordinates[1] + ")."); //display coordinates
//        } catch (IOException e) {
//            System.out.println(e.toString());
//        }
//
//    }



    public BufferedImage editPhoto(int r, int g, int b) throws IOException{

            BufferedImage imageToSearch = ImageIO.read(fileSystemClass.file);
            BufferedImage image = ImageIO.read(fileSystemClass.file);
            BufferedImage refactoredImage = ImageIO.read(fileSystemClass.file);
            Color colorToFind = new Color(r, g, b);
            File directoryPathFile = new File(fileSystemClass.directoryPathname);
            File photoPathFile = new File(fileSystemClass.photoPathname);
            directoryPathFile.mkdir();

            int width = imageToSearch.getWidth();
            int height = imageToSearch.getHeight();

            int[] pixelCoordinates = colorSearch(colorToFind, imageToSearch);
            image = image.getSubimage(pixelCoordinates[0], pixelCoordinates[1], 115, 35);
            ImageIO.write(refactoredImage, "png", photoPathFile);

            Graphics2D g2d = refactoredImage.createGraphics();
            g2d.setColor(Color.BLACK);
            g2d.fillRect(pixelCoordinates[0], pixelCoordinates[1], width, 35);
            g2d.dispose();

            System.out.println("Found pixel at (" + pixelCoordinates[0] + "," + pixelCoordinates[1] + ")."); //display coordinates

            return image;
    }

    private static int[] colorSearch(Color c, BufferedImage pic) {
        int cVal = c.getRGB();

        int x1 = 0;
        int y1 = 0;
        int x2 = pic.getWidth();
        int y2 = pic.getHeight();

        int[] XArray = new int[x2 - x1 + 1];
        int iterator = 0;
        while (iterator < x2) {
            XArray[iterator] = x1 + iterator;
            iterator++;
        }
        int[] YArray = new int[y2 - y1 + 1];
        iterator = 0;
        while (iterator < y2) {
            YArray[iterator] = y1 + iterator;
            iterator++;
        }

        for (int yVal : YArray) {
            for (int xVal : XArray) {
                int color = pic.getRGB(xVal, yVal); //get the color of pixel at coords (xVal, yVal)
                if (color == cVal) { //if the color is equal to the one we inputted to the function
                    int[] cPos = {xVal, yVal}; //store the coordinates
                    return cPos; //return the coordinates
                }
            }
        }

        int[] returnVal = {-1, -1};
        return returnVal;
    }

    public void getColor(int x, int y) throws IOException {
        File file = new File(fileSystemClass.filePath);
        BufferedImage image = ImageIO.read(file);

        Color p = new Color(image.getRGB(x, y));
        int c = p.getRGB();

        System.out.println(c);

        int r = p.getRed();
        int g = p.getGreen();
        int b = p.getBlue();

        System.out.println("R " + r + " G " + g + " B " + b);

    }
}
