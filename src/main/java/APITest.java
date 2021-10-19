import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class APITest {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);
    Actions actions = new Actions(driver);
    Robot rb = new Robot();

    public APITest() throws AWTException {
    }

    public static void main(String[] args) throws InterruptedException, AWTException {
        APITest apiTest= new APITest();
        System.out.println(apiTest.getAPISign("/ver1/accounts/31048153/active_trading_entities"));
    }

    String getAPISign(String apiCall) throws InterruptedException {
        driver.navigate().to("https://www.onlinegdb.com/online_bash_shell#");

        String text = "";
        String myString = String.format("echo -n %s | openssl dgst -sha256 -hmac 4cedb99bd708a95167e08ff8942bfed209c22a5369d2b35df9cbfb7c18bf422da74fcde7b99e27e722f6acb8856f7ce585ab880e5b2aae7006d2c91f1a30b077ce7a1782cef0023a082f0bb62100bab664b749d8ea5f860c87cdcc08ec0f61fc533c57b1",apiCall);
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        driver.findElement(By.className("ace_content")).click();


        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_A);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_A);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(By.id("control-btn-run")).click();
        Thread.sleep(2500);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"bottom-component\"]/button[3]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"genericModal\"]/div/div/div[3]/button")).click();

        Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
        DataFlavor flavor = DataFlavor.stringFlavor;
        if (clipboard.isDataFlavorAvailable(flavor)) {
            try {
                text = (String) clipboard1.getData(flavor);
                text = text.substring(9, text.length());
            } catch (UnsupportedFlavorException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        driver.close();
        return text;
    }
}