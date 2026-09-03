package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver ;
    public HomePage (WebDriver driver){

        this.driver = driver ;
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFromAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public HoverPage clickHovers (){
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    public JavaScriptAlertPage clickJavaScript(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public EntryAdPage clickEntryAd(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
  }
  public FramesPage clickFrames(){
        clickLink("Frames");
        return new FramesPage(driver);
  }
  public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
  }
  public LargeAndDeepDownPage clickLargeAndDeepDown(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDownPage(driver);
  }
  public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
  }
  public MultipleWindow clickMultipleWindow(){
        clickLink("Multiple Windows");
        return new MultipleWindow(driver);
  }
 }
