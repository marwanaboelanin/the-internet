package Navigation;

import Page.NewWindowPage;
import Utilis.WindowManager;
import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NavigateTest extends BaseTests {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goToUrl("https://www.google.com/"); //https pf google
    }
    @Test
    public void testSwitchTab(){
        var  NewWindowPage = homePage.clickMultipleWindow().clickLink();
        getWindowManager().switchToTab("New Window");
        assertEquals(NewWindowPage.getText(),"New Window","you area in the wrong tab");
    }
}
