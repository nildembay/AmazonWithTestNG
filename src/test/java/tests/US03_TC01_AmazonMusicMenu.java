package tests;

import org.testng.annotations.Test;
import pages.Page;
import utilities.TestBaseRapor;

public class US03_TC01_AmazonMusicMenu  extends TestBaseRapor {
    Page page=new Page();
    @Test
    public void test01()  {
        extentTest=extentReports.createTest("US03_TC01_Verify the number of menus under each category",
                "User can verify the number of menus under Amazon Music menu ");
        page.goToHomePage();
        page.amazonMusicMenu();
        extentTest.pass("User  saw there are two sub-menus as Stream Music and Buy Music under 'Amazon Music'  menu ");

    }


}
