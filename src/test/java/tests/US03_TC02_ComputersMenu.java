package tests;

import org.testng.annotations.Test;
import pages.Page;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US03_TC02_ComputersMenu extends TestBaseRapor {
    Page page=new Page();
    @Test
    public void test01()  {
        extentTest=extentReports.createTest("US03_TC01_Verify the number of menus under each category",
                "User can verify the number of menus under Computers title.");
        page.goToHomePage();
        page.amazonComputersMenu();
        extentTest.pass("User saw that there are fifteen sub-titles under 'Computers' title");

    }
}
