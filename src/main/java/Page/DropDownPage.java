package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownPage {
    private WebDriver driver;
    private By dropDown = By.id("dropdown");
    public DropDownPage(WebDriver driver){
        this.driver = driver ;
    }

       private Select findDropDownElement(){
         return new Select(driver.findElement(dropDown));
    }

    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
        //Select dropDownElement = new Select(driver.findElement(dropDown));
        //dropDownElement.selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        List<WebElement> optionsElements = findDropDownElement().getAllSelectedOptions();
        List<String> optionsText = new ArrayList<>();
        for(WebElement element: optionsElements){
            optionsText.add(element.getText());
        }
        return optionsText;
    }
    //public void selcetfromDropDown(String option){
//Select dropDownElement = new Select(driver.findElement(dropDown));
//  dropDownElement.selectByVisibleText(option);
//}
}
