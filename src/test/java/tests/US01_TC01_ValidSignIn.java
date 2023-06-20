package tests;

import org.testng.annotations.Test;
import pages.Page;
import utilities.TestBaseRapor;

public class US01_TC01_ValidSignIn extends TestBaseRapor {

    Page page=new Page();

    @Test
    public void valid_Sign_In()  {
         extentTest=extentReports.createTest("Valid Sign In",
              "User can login with a valid username and password");
        page.goToHomePage();
        page.signInMenuClick();
        page.signIn();
        page.signOut();
        extentTest.pass("User  logged in with a valid username and password");


    }

}
