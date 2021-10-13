import net.sourceforge.tess4j.TesseractException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StartClass {


    void mainMethod(String currencyType, String timeFrame, Boolean isSignalRisky) throws IOException, TesseractException{
        ArrayList<Double> dataList = new ArrayList<Double>();
        DataScannerClass dataScannerClass = new DataScannerClass();
        PhotoEditorClass photoEditorClass = new PhotoEditorClass();
        TesseractClass tesseractClass = new TesseractClass();
        FileSystemClass fileSystemClass = new FileSystemClass();
        ExcelClass excelClass = new ExcelClass();

        dataScannerClass.startWebDriver();
        fileSystemClass.createNewDirectory();

        dataList.add(tesseractClass.analyseText(fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(41,98,255),"TP4")));
        dataList.add(tesseractClass.analyseText(fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(41,98,255),"TP3")));
        dataList.add(tesseractClass.analyseText(fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(41,98,255),"TP2")));
        dataList.add(tesseractClass.analyseText(fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(41,98,255),"TP1")));
        dataList.add(tesseractClass.analyseText(fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(76,175,80),"AVG")));
        dataList.add(tesseractClass.analyseText(fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(244,67,54), "SL")));

        System.out.println(dataList);
        Collections.reverse(dataList);
        System.out.println(dataList);

        excelClass.excelWriter(dataList);
    }




    public static void main(String[] args) throws IOException, TesseractException {
        ArrayList<Double> dataList = new ArrayList<Double>();
        DataScannerClass dataScannerClass = new DataScannerClass();
        PhotoEditorClass photoEditorClass = new PhotoEditorClass();
        TesseractClass tesseractClass = new TesseractClass();
        FileSystemClass fileSystemClass = new FileSystemClass();
        ExcelClass excelClass = new ExcelClass();

        dataScannerClass.startWebDriver();
        fileSystemClass.createNewDirectory();

        dataList.add(tesseractClass.analyseText(fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(41,98,255),"TP4")));
        dataList.add(tesseractClass.analyseText(fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(41,98,255),"TP3")));
        dataList.add(tesseractClass.analyseText(fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(41,98,255),"TP2")));
        dataList.add(tesseractClass.analyseText(fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(41,98,255),"TP1")));
        dataList.add(tesseractClass.analyseText(fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(76,175,80),"AVG")));
        dataList.add(tesseractClass.analyseText(fileSystemClass.writeRefactoredPhoto(photoEditorClass.editPhoto(244,67,54), "SL")));

        System.out.println(dataList);
        Collections.reverse(dataList);
        System.out.println(dataList);

        excelClass.excelWriter(dataList);


//        tesseractClass.analyseText("C:\\Users\\USER\\Desktop\\photoshop\\6 Oct 2021 16;09;22 GMT crypto Name\\AVG.png");
//        photoEditorClass.getColor(1,215,"C:\\Users\\USER\\Desktop\\photoshop\\6 Oct 2021 15;09;32 GMT crypto Name\\Screenshot_1.png");

    }
}
