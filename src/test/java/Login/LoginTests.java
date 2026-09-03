package Login;

import Page.LoginPage;
import Page.SecureAreaPage;
import base.BaseTests;
import org.testng.annotations.Test;
import  static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginpage = homePage.clickFromAuthentication();
        loginpage.setUsernameFiled("tomsmith");
        loginpage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginpage.clickLoginButton();
        assertEquals(secureAreaPage.getText(),"You logged into a secure area!\n" +
                        "×","the message is incorrect");
       // el message msh mktoba s7 feha spaces
    }
}
