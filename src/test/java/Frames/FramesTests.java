package Frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FramesTests extends BaseTests {
    @Test
    public void testFrames(){
        var nestedFramesPage = homePage.clickFrames().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT",
                "the text is incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM",
                "the text is incorrect");
    }
}
