import java.util.Date;

public class FilesGenerator {
    public static String directoryPath;
    public static String photoPath;
    public static String dataFilePath;
    Date date = new Date();

void generator() {

    directoryPath = "C:\\Users\\USER\\Desktop\\photoshop\\" + date.toGMTString() + " crypto variable Name";
//    photoPath =  directoryPath + PhotoEditorClass.fileNum + ".png";

}
}
