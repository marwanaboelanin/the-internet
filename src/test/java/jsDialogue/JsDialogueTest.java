package jsDialogue;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JsDialogueTest extends BaseTests {
    @Test
    public void testAlerts() {
        var javaScriptAlertsPage = homePage.clickJavaScript();
        javaScriptAlertsPage.triggerAlert();
        javaScriptAlertsPage.alert_clickToAccept();
        assertEquals(javaScriptAlertsPage.getResultText(), "You successfully clicked an alert", "the text is incorrect");
    }
    @Test
        public void testConfirm(){
        var javaScriptAlertsPage = homePage.clickJavaScript();
        javaScriptAlertsPage.triggerConfirm();
        String text = javaScriptAlertsPage.alert_getText();
        javaScriptAlertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm","The text is incorrect");
        }
        @Test
    public void testPrompt(){
        String text = "Route";
        var javaScriptAlertsPage = homePage.clickJavaScript();
        javaScriptAlertsPage.triggerprompt();
        javaScriptAlertsPage.alert_setText(text);
        javaScriptAlertsPage.alert_clickToAccept();
        assertEquals(javaScriptAlertsPage.getResultText(),"You entered: "+text);
    }
    }

