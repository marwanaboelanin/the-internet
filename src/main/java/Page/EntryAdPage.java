package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver ;
    private By closeElementLocator = By.xpath("//p[text()='Close']");
    private By entryAdLocator = By.xpath("//h3[text()='Entry Ad']");
    public EntryAdPage(WebDriver driver){
        this.driver = driver ;
    }
    public void closeModel(){
        driver.findElement(closeElementLocator).click();
    }
    public String getText(){
        return driver.findElement(entryAdLocator).getText();
    }
}
