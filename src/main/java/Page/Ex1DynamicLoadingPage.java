package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;

public class Ex1DynamicLoadingPage {
    private WebDriver driver ;
    private By startButton = By.cssSelector("#start button");
    private By resultText = By.cssSelector("#finish h4");
    private By loadingBar = By.id("loading");
    public Ex1DynamicLoadingPage(WebDriver driver){
        this.driver = driver ;
    }
    public void clickStartButton(){
        driver.findElement(startButton).click();
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
        .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf((driver.findElement(loadingBar))));
      //  try {
        //    Thread.sleep(10000);
        //} catch (InterruptedException e) {
           // throw new RuntimeException(e);
        //}
    }
    public String getText(){
        return driver.findElement(resultText).getText();
    }


}
