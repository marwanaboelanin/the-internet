package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By paragraph = By.className("jscroll-added");
    public InfiniteScrollPage (WebDriver driver){
        this.driver = driver;
    }
    public void ScrollToParagraph(int index){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        while (getNoOfParagraph()<index){
            js.executeScript(script);
        }
    }
    //public void setAttribute(){
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //String script = "arguments[0].setAttribute(arguments[1].arguments[2])";
      // js.executeScript(script , "element" , "attribute","value");
    //}

    public int getNoOfParagraph(){
        return driver.findElements(paragraph).size();
    }

}
