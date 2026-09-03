package entryAd;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ModelTests extends BaseTests {
    @Test
    public void testModels() {
        var entryAdPage = homePage.clickEntryAd();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(entryAdPage.getText(), "Entry Ad", "The model was not close");
    }
}