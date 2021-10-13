import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TelegramClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Actions actions = new Actions(driver);
        StartClass startClass = new StartClass();

        driver.navigate().to("https://web.telegram.org/z/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            wait.withTimeout(1, TimeUnit.MINUTES);
            try {

                driver.findElement(By.xpath("//*[@id=\"column-left\"]/div/div/div[1]/div[1]/div[2]/div[2]/div[9]/span")).click();
                System.out.println("Setting z version");
            } catch (Exception e) {
                System.out.println("We are on the Z version");
            }

            try {
                driver.findElement(By.xpath("//*[@id=\"LeftColumn-main\"]/div[2]/div/div/div/div/div/div/div[1]/div")).click();

                int i = 7;
                String s = "";
                String prevString = "";
                while (true) {

                    try {
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format("//*[@id=\"message%s\"]", i))));
                        s = driver.findElement(By.xpath(String.format("//*[@id=\"message%s\"]/div[3]/div/div[1]/p", i))).getText();

                        prevString = prevString.trim();
                        s = s.trim();
                        if (s.equals(prevString)) {

                            if (s.contains("РИСКОВЫЙ СИГНАЛ")) {
                                if (s.contains("5M")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "5M", true);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "5M", true);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "5M", true);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "5M", true);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "5M", true);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "5M", true);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "5M", true);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "5M", true);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "5M", true);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "5M", true);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "5M", true);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "5M", true);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "5M", true);

                                    }
                                } else if (s.contains("10М")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "10М", true);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "10М", true);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "10М", true);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "10М", true);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "10М", true);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "10М", true);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "10М", true);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "10М", true);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "10М", true);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "10М", true);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "10М", true);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "10М", true);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "10М", true);

                                    }
                                } else if (s.contains("15М")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "15М", true);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "15М", true);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "15М", true);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "15М", true);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "15М", true);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "15М", true);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "15М", true);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "15М", true);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "15М", true);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "15М", true);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "15М", true);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "15М", true);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "15М", true);

                                    }
                                } else if (s.contains("30М")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "30М", true);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "30М", true);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "30М", true);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "30М", true);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "30М", true);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "30М", true);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "30М", true);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "30М", true);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "30М", true);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "30М", true);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "30М", true);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "30М", true);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "30М", true);

                                    }
                                } else if (s.contains("45М")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "45М", true);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "45М", true);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "45М", true);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "45М", true);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "45М", true);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "45М", true);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "45М", true);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "45М", true);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "45М", true);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "45М", true);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "45М", true);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "45М", true);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "45М", true);

                                    }
                                } else if (s.contains("1Ч")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "1Ч", true);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "1Ч", true);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "1Ч", true);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "1Ч", true);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "1Ч", true);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "1Ч", true);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "1Ч", true);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "1Ч", true);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "1Ч", true);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "1Ч", true);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "1Ч", true);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "1Ч", true);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "1Ч", true);

                                    }
                                } else if (s.contains("4Ч")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "4Ч", true);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "4Ч", true);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "4Ч", true);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "4Ч", true);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "4Ч", true);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "4Ч", true);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "4Ч", true);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "4Ч", true);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "4Ч", true);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "4Ч", true);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "4Ч", true);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "4Ч", true);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "4Ч", true);

                                    }
                                }
                            } else {
                                if (s.contains("5M")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "5M", false);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "5M", false);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "5M", false);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "5M", false);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "5M", false);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "5M", false);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "5M", false);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "5M", false);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "5M", false);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "5M", false);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "5M", false);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "5M", false);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "5M", false);

                                    }
                                } else if (s.contains("10М")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "10М", false);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "10М", false);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "10М", false);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "10М", false);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "10М", false);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "10М", false);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "10М", false);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "10М", false);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "10М", false);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "10М", false);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "10М", false);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "10М", false);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "10М", false);

                                    }
                                } else if (s.contains("15М")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "15М", false);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "15М", false);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "15М", false);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "15М", false);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "15М", false);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "15М", false);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "15М", false);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "15М", false);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "15М", false);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "15М", false);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "15М", false);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "15М", false);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "15М", false);

                                    }
                                } else if (s.contains("30М")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "30М", false);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "30М", false);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "30М", false);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "30М", false);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "30М", false);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "30М", false);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "30М", false);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "30М", false);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "30М", false);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "30М", false);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "30М", false);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "30М", false);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "30М", false);

                                    }
                                } else if (s.contains("45М")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "45М", false);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "45М", false);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "45М", false);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "45М", false);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "45М", false);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "45М", false);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "45М", false);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "45М", false);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "45М", false);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "45М", false);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "45М", false);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "45М", false);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "45М", false);

                                    }
                                } else if (s.contains("1Ч")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "1Ч", false);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "1Ч", false);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "1Ч", false);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "1Ч", false);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "1Ч", false);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "1Ч", false);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "1Ч", false);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "1Ч", false);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "1Ч", false);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "1Ч", false);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "1Ч", false);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "1Ч", false);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "1Ч", false);

                                    }
                                } else if (s.contains("4Ч")) {
                                    if (s.contains("BTCUSDTPREP")) {
                                        startClass.mainMethod("BTCUSDTPREP", "4Ч", false);
                                    } else if (s.contains("TRXUSDTPREP")) {
                                        startClass.mainMethod("TRXUSDTPREP", "4Ч", false);

                                    } else if (s.contains("ADAUSDTPREP")) {
                                        startClass.mainMethod("ADAUSDTPREP", "4Ч", false);

                                    } else if (s.contains("XTZUSDTPREP")) {
                                        startClass.mainMethod("XTZUSDTPREP", "4Ч", false);

                                    } else if (s.contains("XLMUSDTPREP")) {
                                        startClass.mainMethod("XLMUSDTPREP", "4Ч", false);

                                    } else if (s.contains("ETHUSDTPREP")) {
                                        startClass.mainMethod("ETHUSDTPREP", "4Ч", false);

                                    } else if (s.contains("EOSUSDTPREP")) {
                                        startClass.mainMethod("EOSUSDTPREP", "4Ч", false);

                                    } else if (s.contains("XMRUSDTPREP")) {
                                        startClass.mainMethod("XMRUSDTPREP", "4Ч", false);

                                    } else if (s.contains("BCHUSDTPREP")) {
                                        startClass.mainMethod("BCHUSDTPREP", "4Ч", false);

                                    } else if (s.contains("LTCUSDTPREP")) {
                                        startClass.mainMethod("LTCUSDTPREP", "4Ч", false);

                                    } else if (s.contains("BNBUSDTPREP")) {
                                        startClass.mainMethod("BNBUSDTPREP", "4Ч", false);

                                    } else if (s.contains("DASHUSDTPREP")) {
                                        startClass.mainMethod("DASHUSDTPREP", "4Ч", false);

                                    } else if (s.contains("IOTAUSDTPREP")) {
                                        startClass.mainMethod("IOTAUSDTPREP", "4Ч", false);

                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("We don't see newer message");
                        i--;
                        i--;
                    }
                    prevString = s;
                    i++;
                }
            } catch (Exception e) {
                System.out.println("We cannot find element by class");
            }


        } catch (Exception e) {
            System.out.println("it isn't first scenario");

        }
    }
}
