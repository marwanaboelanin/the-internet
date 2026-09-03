package JavaScriptExecuter;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptExecuterTest extends BaseTests {
    @Test
    public void testScrollToElement(){
        var largeAndDeepDownPage = homePage.clickLargeAndDeepDown();
        largeAndDeepDownPage.scrollToTable();
    }
    @Test
    public void testScrollToParagraph(){
        var infinteScrollPage = homePage.clickInfiniteScroll();
        infinteScrollPage.ScrollToParagraph(5);
    }
}
