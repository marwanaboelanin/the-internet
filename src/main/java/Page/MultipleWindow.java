package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindow {
    private WebDriver driver ;
    private By clickLink = By.linkText("Click Here");
    public MultipleWindow(WebDriver driver){
        this.driver = driver ;
    }
    public NewWindowPage clickLink(){
        driver.findElement(clickLink).click();
        return new NewWindowPage(driver);
    }
}
