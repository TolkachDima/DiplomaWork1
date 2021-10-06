import java.util.Date;

public class ClassForTestingSomeStuff {
    public static void main(String[] args) {
        Date date = new Date();
        String dateSTR= date.toGMTString();
        int fileNum = 1;
        String directoryPathname = String.format("C:\\Users\\USER\\Desktop\\photoshop\\%s crypto Name", dateSTR);
        String photoPathname = String.format("%s\\%s.png", directoryPathname,fileNum);
        System.out.println(photoPathname);
    }
}
