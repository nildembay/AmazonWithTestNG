package tests;

import org.testng.annotations.Test;
import pages.Page;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US04_TC01_SearchProduct extends TestBaseRapor {
    Page page=new Page();
    @Test
    public void test01() {
        extentTest=extentReports.createTest("US04_TC01_Searching a product and verify the all listed products contain searching keyword",
                "User can search a product and verify the all listed products contain searched keyword.");

        page.goToHomePage();
        page.searchProduct();
        extentTest.pass("User  searched a product and verified the all listed products contain searched keyword.");
     }


}
