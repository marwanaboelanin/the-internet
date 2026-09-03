package dropDown;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {

    @Test
    public void testDropDown(){
        String option = "Option 1";
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"the size is incorrect");
      //  assertEquals(selectedOptions.size(),3,"the size is incorrect");
        //dy kda hy7slha failure fa hakhud screenshot
        assertTrue(selectedOptions.contains(option),"the option is not correct");
    }
}
