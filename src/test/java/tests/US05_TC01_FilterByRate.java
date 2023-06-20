package tests;

import org.testng.annotations.Test;
import pages.Page;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US05_TC01_FilterByRate extends TestBaseRapor {

    @Test
    public void test01() {
        Page page=new Page();
        extentTest=extentReports.createTest("US05_TC01_Filter the searching product by rate, verify that the listed products are suitible for the filter",
                "User can filter the searched product by rate and verify that the listed products are suitible for the filter.");

        page.goToHomePage();
        page.searchProduct();
        page.filterByRate();
        extentTest.pass("User  filtered the searched product by rate and verified that the listed products are suitible for the filter.");

    }


}
