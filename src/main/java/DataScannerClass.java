import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class DataScannerClass {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver,30);
    Actions actions = new Actions(driver);
    public DataScannerClass(){


        driver.navigate().to("https://www.tradingview.com/chart/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("buttonWrap-2WfzAPA-")).click();
        driver.findElement(By.className("labelRow-2IihgTnv")).click();
        driver.findElement(By.xpath("//*[text()='Email']")).click();
        driver.findElement(By.name("username")).sendKeys("tolkach.dima64@gmail.com");
        driver.findElement(By.name("password")).sendKeys("3Dtolkach4s");
        driver.findElement(By.className("tv-button__loader")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("close-icon-3unB1Yrw")));
        driver.findElement(By.className("close-icon-3unB1Yrw")).click();


    }


    public void startWebDriver(String currencyType, String timeFrame) throws IOException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Select saved Chart layout
        Action clickDot = actions.sendKeys(".").build();
        clickDot.perform();
        driver.findElement(By.className("itemRow-1SBAfF8E")).click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.close();
        driver.switchTo().window(tabs2.get(1));

        //Search currency

        driver.findElement(By.id("header-toolbar-symbol-search")).click();
        driver.findElement(By.xpath("//*[@id=\"overlap-manager-root\"]/div/div/div[2]/div/div[2]/div[1]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"overlap-manager-root\"]/div/div/div[2]/div/div[2]/div[1]/input")).sendKeys(currencyType);
        driver.findElement(By.className("exchange-1LtT-c03")).click();
        driver.findElement(By.className("input-3n5_2-hI")).sendKeys("Binance");
        driver.findElement(By.xpath("//*[@id=\"overlap-manager-root\"]/div/div/div[2]/div/div[3]/div[2]/div[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"overlap-manager-root\"]/div/div/div[2]/div/div[4]/div/div/div[2]/div[1]")).click();


        //Select timeframe
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("header-toolbar-intervals")).click();
        switch (timeFrame){
            case "5М": driver.findElement(By.xpath("//*[@id=\"overlap-manager-root\"]/div/span/div[1]/div/div/div/div[10]/div")).click();
                break;

            case "15М":  driver.findElement(By.xpath("//*[@id=\"overlap-manager-root\"]/div/span/div[1]/div/div/div/div[11]/div")).click();
                break;

            case "30М": driver.findElement(By.xpath("//*[@id=\"overlap-manager-root\"]/div/span/div[1]/div/div/div/div[12]/div")).click();
                break;

            case "45М": driver.findElement(By.xpath("//*[@id=\"overlap-manager-root\"]/div/span/div[1]/div/div/div/div[13]/div")).click();
                break;

            case "1Ч":  driver.findElement(By.xpath("//*[@id=\"overlap-manager-root\"]/div/span/div[1]/div/div/div/div[16]/div")).click();
                break;

            case "4Ч":  driver.findElement(By.xpath("//*[@id=\"overlap-manager-root\"]/div/span/div[1]/div/div/div/div[19]/div")).click();
                break;
        }


        WebElement element = driver.findElement(By.className("price-axis"));
        Screenshot screenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,element);
        ImageIO.write(screenshot.getImage(), "png", new File("C:\\Users\\USER\\Desktop\\photoshop\\ElementScreenshot.png"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
}
