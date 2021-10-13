import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelClass {
            Cell cell;

        File excelFile = new File("C:\\Users\\USER\\Desktop\\photoshop\\excel file\\data.xlsx");

        FileInputStream fis = new FileInputStream(excelFile);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        FileOutputStream fos = new FileOutputStream(excelFile);
        XSSFSheet sheet = workbook.getSheetAt(0);


        Row row = sheet.createRow(sheet.getLastRowNum()+1);


    public ExcelClass() throws IOException {
    }



    public void excelWriter(ArrayList<Double> arr) throws IOException {
        int i = 0;
        for (Double d:arr) {
            cell = row.createCell(i);
            cell.setCellValue(d);
            i++;
        }

        workbook.write(fos);
        workbook.close();
        fos.flush();
        fos.close();
        fis.close();
    }

}
