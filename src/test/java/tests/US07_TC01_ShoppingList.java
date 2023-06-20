package tests;

import org.testng.annotations.Test;
import pages.Page;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US07_TC01_ShoppingList extends TestBaseRapor {
    Page page=new Page();
    @Test
    public void test01()
    {
        extentTest=extentReports.createTest("US07_TC01_Create a shopping list.",
                "User can see that there is a create a shopping list link  enable  in amazon page.");
        page.goToHomePage();
        page.signInMenuClick();
        page.signIn();
        page.createAList();
        extentTest.pass("User saw that there is a create a shopping list link  enable  in amazon page.");
    }


}
