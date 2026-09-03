package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputsFiled = By.id("target");
    private By resultMessage = By.id("result");
    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }
    public void setText(String text){
        driver.findElement(inputsFiled).sendKeys(text);
    }
    public String getText(){
        return driver.findElement(resultMessage).getText();
    }
}
