package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class CrossDriver {
    private CrossDriver(){}

    static private WebDriver driver;

    public static WebDriver getDriver(String browser){
        browser=browser==null ? ConfigReader.getProperty("browser"):browser;

        if(driver==null){
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;

                case "edge":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class);
                    driver=new SafariDriver();
                    break;
                case "opera":
                    OperaDriverManager.operadriver().setup();
                    driver=new OperaDriver();
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
            }
        }

        return driver;
    }

    public static void closeDriver(){
        if(driver!=null) {
            driver.close();
            driver=null;
        }
    }

    public static void quitDriver(){
        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }
}
