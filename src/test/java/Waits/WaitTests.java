package Waits;
import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WaitTests extends BaseTests {
    @Test
    public void testWait(){
        var ex1DynamicLoadingPage = homePage.clickDynamicLoading().clickExample1();
        ex1DynamicLoadingPage.clickStartButton();
        assertEquals(ex1DynamicLoadingPage.getText(),"Hello World!","the text is incorrect");
    }

    @Test
    public void testWait2(){
        var ex2DynamicLoadingPage = homePage.clickDynamicLoading().clickExample2();
        ex2DynamicLoadingPage.clickStartButton();
        assertEquals(ex2DynamicLoadingPage.getText(),"Hello World!","the text is incorrect");
    }
}
