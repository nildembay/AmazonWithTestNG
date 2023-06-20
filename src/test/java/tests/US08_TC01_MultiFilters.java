package tests;

import org.testng.annotations.Test;
import pages.Page;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US08_TC01_MultiFilters extends TestBaseRapor {
    Page page=new Page();
    @Test
    public void test01() {
        extentTest=extentReports.createTest("US08_TC01_Verify multiple filters related to the searched product are working at the same time.",
                "User can verify multiple filters related to the searched product are working at the same time.");
       page.goToHomePage();
       page.multiFilters();
        extentTest.pass("User  verified multiple filters related to the searched product are working at the same time.");
    }
}
