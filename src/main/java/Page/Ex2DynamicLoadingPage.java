package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Ex2DynamicLoadingPage {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By LoadedText = By.id("finish");
    public Ex2DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(LoadedText));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(LoadedText)));

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LoadedText)));
    }
    public String getLoadedText(){
        return driver.findElement(LoadedText).getText();
    }
}
