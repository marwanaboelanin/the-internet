package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver ;
    private By exampleLink1 = By.partialLinkText("Example 1");
    private By exampleLink2 = By.partialLinkText("Example 2");
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver ;
    }
    public Ex1DynamicLoadingPage clickExample1(){
        driver.findElement(exampleLink1).click();
        return new Ex1DynamicLoadingPage(driver);
    }
    public Ex1DynamicLoadingPage clickExample2(){
        driver.findElement(exampleLink2).click();
        return new Ex1DynamicLoadingPage(driver);
    }

}
