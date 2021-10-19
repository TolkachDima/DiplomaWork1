import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TelegramClass {
    public static void main(String[] args) throws IOException {
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

                int i = 13;
                String s = "";
                String prevString = "";
                while (true) {

                    try {
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format("//*[@id=\"message%s\"]", i))));
                        try {
                            s = driver.findElement(By.xpath(String.format("//*[@id=\"message%s\"]/div[3]/div/div[1]/p", i))).getText();
                        } catch (Exception e){
                            System.out.println("Strange message");
                        }

                        prevString = prevString.trim();
                        s = s.trim();
                        if (!s.equals(prevString)) {
                            System.out.println();
                            if (s.contains("РИСКОВЫЙ СИГНАЛ")) {
                                if (s.contains("5M")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "5M", true);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "5M", true);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "5M", true);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "5M", true);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "5M", true);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "5M", true);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "5M", true);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "5M", true);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "5M", true);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "5M", true);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "5M", true);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "5M", true);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "5M", true);

                                    }
                                } else if
                                (s.contains("10М")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "10М", true);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "10М", true);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "10М", true);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "10М", true);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "10М", true);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "10М", true);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "10М", true);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "10М", true);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "10М", true);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "10М", true);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "10М", true);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "10М", true);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "10М", true);

                                    }
                                } else if
                                (s.contains("15М")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "15М", true);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "15М", true);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "15М", true);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "15М", true);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "15М", true);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "15М", true);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "15М", true);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "15М", true);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "15М", true);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "15М", true);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "15М", true);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "15М", true);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "15М", true);

                                    }
                                } else if
                                (s.contains("30М")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "30М", true);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "30М", true);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "30М", true);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "30М", true);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "30М", true);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "30М", true);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "30М", true);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "30М", true);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "30М", true);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "30М", true);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "30М", true);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "30М", true);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "30М", true);

                                    }
                                } else if
                                (s.contains("45М")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "45М", true);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "45М", true);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "45М", true);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "45М", true);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "45М", true);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "45М", true);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "45М", true);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "45М", true);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "45М", true);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "45М", true);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "45М", true);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "45М", true);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "45М", true);

                                    }
                                } else if
                                (s.contains("1Ч")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "1Ч", true);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "1Ч", true);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "1Ч", true);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "1Ч", true);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "1Ч", true);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "1Ч", true);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "1Ч", true);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "1Ч", true);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "1Ч", true);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "1Ч", true);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "1Ч", true);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "1Ч", true);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "1Ч", true);

                                    }
                                }
                                else if (s.contains("4Ч")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "4Ч", true);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "4Ч", true);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "4Ч", true);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "4Ч", true);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "4Ч", true);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "4Ч", true);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "4Ч", true);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "4Ч", true);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "4Ч", true);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "4Ч", true);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "4Ч", true);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "4Ч", true);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "4Ч", true);

                                    }
                                }
                            } else if(!s.contains("РИСКОВЫЙ СИГНАЛ")){
                                if (s.contains("5M")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "5M", false);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "5M", false);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "5M", false);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "5M", false);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "5M", false);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "5M", false);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "5M", false);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "5M", false);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "5M", false);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "5M", false);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "5M", false);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "5M", false);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "5M", false);

                                    }
                                } else if (s.contains("10М")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "10М", false);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "10М", false);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "10М", false);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "10М", false);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "10М", false);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "10М", false);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "10М", false);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "10М", false);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "10М", false);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "10М", false);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "10М", false);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "10М", false);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "10М", false);

                                    }
                                }
                                else if (s.contains("15М")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "15М", false);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "15М", false);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "15М", false);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "15М", false);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "15М", false);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "15М", false);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "15М", false);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "15М", false);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "15М", false);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "15М", false);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "15М", false);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "15М", false);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "15М", false);

                                    }
                                } else if (s.contains("30М")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "30М", false);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "30М", false);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "30М", false);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "30М", false);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "30М", false);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "30М", false);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "30М", false);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "30М", false);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "30М", false);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "30М", false);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "30М", false);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "30М", false);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "30М", false);

                                    }
                                }
                                else if (s.contains("45М")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "45М", false);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "45М", false);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "45М", false);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "45М", false);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "45М", false);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "45М", false);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "45М", false);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "45М", false);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "45М", false);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "45М", false);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "45М", false);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "45М", false);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "45М", false);

                                    }
                                }
                                else if (s.contains("1Ч")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "1Ч", false);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "1Ч", false);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "1Ч", false);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "1Ч", false);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "1Ч", false);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "1Ч", false);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "1Ч", false);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "1Ч", false);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "1Ч", false);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "1Ч", false);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "1Ч", false);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "1Ч", false);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "1Ч", false);

                                    }
                                }
                                else if (s.contains("4Ч")) {
                                    if (s.contains("BTCUSDTPERP")) {
                                        startClass.mainMethod("BTCUSDTPERP", "4Ч", false);
                                    } else if (s.contains("TRXUSDTPERP")) {
                                        startClass.mainMethod("TRXUSDTPERP", "4Ч", false);

                                    } else if (s.contains("ADAUSDTPERP")) {
                                        startClass.mainMethod("ADAUSDTPERP", "4Ч", false);

                                    } else if (s.contains("XTZUSDTPERP")) {
                                        startClass.mainMethod("XTZUSDTPERP", "4Ч", false);

                                    } else if (s.contains("XLMUSDTPERP")) {
                                        startClass.mainMethod("XLMUSDTPERP", "4Ч", false);

                                    } else if (s.contains("ETHUSDTPERP")) {
                                        startClass.mainMethod("ETHUSDTPERP", "4Ч", false);

                                    } else if (s.contains("EOSUSDTPERP")) {
                                        startClass.mainMethod("EOSUSDTPERP", "4Ч", false);

                                    } else if (s.contains("XMRUSDTPERP")) {
                                        startClass.mainMethod("XMRUSDTPERP", "4Ч", false);

                                    } else if (s.contains("BCHUSDTPERP")) {
                                        startClass.mainMethod("BCHUSDTPERP", "4Ч", false);

                                    } else if (s.contains("LTCUSDTPERP")) {
                                        startClass.mainMethod("LTCUSDTPERP", "4Ч", false);

                                    } else if (s.contains("BNBUSDTPERP")) {
                                        startClass.mainMethod("BNBUSDTPERP", "4Ч", false);

                                    } else if (s.contains("DASHUSDTPERP")) {
                                        startClass.mainMethod("DASHUSDTPERP", "4Ч", false);

                                    } else if (s.contains("IOTAUSDTPERP")) {
                                        startClass.mainMethod("IOTAUSDTPERP", "4Ч", false);

                                    }
                                }

                            }else {
                                System.out.println("Something new (In future it will send notification to Telegram");
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
