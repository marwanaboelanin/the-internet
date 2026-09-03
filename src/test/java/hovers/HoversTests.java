package hovers;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversTests extends BaseTests {
    @Test
    public void testHovers (){
        var hoverpage = homePage.clickHovers();
        var figureCaption = hoverpage.hoverOverFigure(1);
        assertTrue(figureCaption.isCaptionDisplayed(),"the caption is not correct");
        assertEquals(figureCaption.getName(),"name: user1","the name is not correct");
        assertEquals(figureCaption.getLinkText(),"View profile","the link is not correct");
        assertTrue(figureCaption.getLink().endsWith("/users/1"),"the link is not correct");
    }
}
