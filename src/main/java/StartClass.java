import net.sourceforge.tess4j.TesseractException;

import java.io.IOException;

public class StartClass {

    public static void main(String[] args) throws IOException, TesseractException {
        DataScannerClass dataScannerClass = new DataScannerClass();
        PhotoEditorClass photoEditorClass = new PhotoEditorClass();
        TesseractClass tesseractClass = new TesseractClass();
        FileSystemClass fileSystemClass = new FileSystemClass();
        dataScannerClass.startWebDriver();
        fileSystemClass.createNewDirectory();
        fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(41,98,255),"TP4");
        fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(41,98,255),"TP3");
        fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(41,98,255),"TP2");
        fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(41,98,255),"TP1");
        fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(76,175,80),"AVG");
        fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(244,67,54), "SL");


        //photoEditorClass.getColor(1,270);
        //tesseractClass.analyseText();
    }
}
