package base;
import Page.HomePage;
import Utilis.WindowManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class BaseTests {
    private By inputsLocator = By.linkText("Inputs");
    protected WebDriver driver;
    protected HomePage homePage;
   @BeforeClass
    public void setUp(){
       //WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
        driver = new ChromeDriver();
        //driver= new ChromeDriver(getWindowManager());
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //driver.get("https://the-internet.herokuapp.com/");
       //homePage = new HomePage(driver);
        goHome();
        //WebElement inputLocator;
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //bystna shwaya 3ubal ma el login msln tzhr 3shan lw at2khrt
        //driver.findElement(By.linkText("Inputs")).click();
        //driver.findElement(inputsLocator).click();
        //List<WebElement> Links = driver.findElements(By.tagName("a"));
        //System.out.println(Links.size());
        //System.out.println(driver.getTitle());
        //driver.manage().window().fullscreen();
        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(430,932));
        //driver.close(); //close the tap only
        //driver.quit(); terminate the chrome at all
    }
    @BeforeMethod //abl kul test 3ndy arg3 ll homepage w b3den adkhul tany w kml b2a fltest eltanya whkza
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
        //driver.manage().addCookie(cookie);
    }

    @AfterClass
    public void tearDown(){
       //driver.quit();
    }

    @AfterMethod
    public void takeScreenShot(){
        var camera = (TakesScreenshot)driver;
        File screenShoot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenShoot.toPath(), new File("resources/screenshots/test.png").toPath());
        }catch (IOException e){
            throw new RuntimeException(e);
        }
//        System.out.println("ScreenShot taken at path: " + screenShoot.getAbsolutePath());
    }

   // in @AfterMethod
    //public void recordFailure(ITestResult result) {
        //if (ITestResult.FAILURE == result.getStatus()) {
            //var camera = (TakesScreenshot) driver;
            //File screenShoot = camera.getScreenshotAs(OutputType.FILE);
            //try {
             //   Files.move(screenShoot.toPath(), new File("resources/screenshots/" +result.getName() + ".png").toPath());
           // } catch (IOException e) {
         //       throw new RuntimeException(e);
   //     }
 //   }
    //}

// in  @AfterMethod
     //private ChromeOptions getChromeOptions(){
      // ChromeOptions options = new ChromeOptions();
    //   options.addArguments("--headless=new"); //bgebha mn google
  //     return options;
//}

    //private void setCookie(){
       // Cookie cookie = new Cookie("Route","123");
      //  driver.manage().addCookie(cookie);
    //}


    public static void main(String[] args){
        BaseTests baseTests = new BaseTests();
        baseTests.setUp();
    }
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}
