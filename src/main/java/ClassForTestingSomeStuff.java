import java.io.Console;
import java.util.Date;

public class ClassForTestingSomeStuff {
    public static void main(String[] args) {
//        Date date = new Date();
//        String dateSTR= date.toGMTString();
//        int fileNum = 1;
//        String directoryPathname = String.format("C:\\Users\\USER\\Desktop\\photoshop\\%s crypto Name", dateSTR);
//        String photoPathname = String.format("%s\\%s.png", directoryPathname,fileNum);
//        System.out.println(photoPathname);
        int i = 1;
        //System.out.println(String.format("//*[@id=\"message%s\"]/div[3]/div/div[1]/p", i));

        String s1 = "РИСКОВЫЙ СИГНАЛ ПРОДАЖА 4Ч ТФ - DASHUSDTPERP;BINANCE;Цена = 182.28\n" +
                "1\n" +
                "edited 16:53\n";

        String s = "ПРОДАЖА 4Ч ТФ - DASHUSDTPERP;BINANCE;Цена = 182.28\n" +
                "1\n" +
                "edited 16:53\n";
        System.out.println(s1.substring(0,8));
//        Console
    }
}
