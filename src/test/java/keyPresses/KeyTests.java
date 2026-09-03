package keyPresses;

import Page.KeyPressesPage;
import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.Key;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KeyTests extends BaseTests {
    @Test
    public void testBackSpace(){
        var keyPressesPage = homePage.clickKeyPresses();
        //keyPressesPage.setText(Keys.chord(Keys.SHIFT + "a"));
        //KeyPressesPage.setText(Keys.SHIFFT+"a");
        //assertEquals(keyPressesPage.getText(),"you entered: A");
        keyPressesPage.setText("a" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getText(),"You entered: BACK_SPACE");
    }
}
