package crossTests;

import org.testng.annotations.Test;
import pages.CrossPage;
import pages.Page;
import utilities.Driver;
import utilities.TestBaseCross;

public class US03_TC01_AmazonMusicMenu  extends TestBaseCross {
    CrossPage crossPage=new CrossPage();
    @Test
    public void test01()  {
        CrossPage.goToHomePage();
        CrossPage.amazonMusicMenu();
    }


}
