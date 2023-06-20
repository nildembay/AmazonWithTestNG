package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.CrossDriver;
import utilities.Driver;
import utilities.TestBaseCross;

public class CrossPage extends TestBaseCross {
    static String browser;
    private static WebDriver driver=CrossDriver.getDriver(browser);

    static By allMenusButton=By.id("nav-hamburger-menu");
    static By amazonComputersLink=By.linkText("Computers");
    static By computersTitleText=By.xpath("//*[text()='computers']");
    static By amazonMusicMenuLink=By.linkText("Amazon Music");
    static By streamMusicText=By.xpath("(//*[@class='hmenu-item hmenu-title '])[5]");



    public static void goToHomePage(){

        driver.get(ConfigReader.getProperty("url"));
        driver.navigate().refresh();
    }

    public static void amazonComputersMenu() {
        driver.findElement(allMenusButton).click();
        driver.findElement(amazonComputersLink).click();
        waitFor(2);
        Assert.assertTrue(driver.findElement(computersTitleText).isDisplayed());
    }

    public static void amazonMusicMenu() {
        driver.findElement(allMenusButton).click();
        driver.findElement(amazonMusicMenuLink).click();
        waitFor(2);
        Assert.assertTrue(driver.findElement(streamMusicText).isDisplayed());
    }



    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
