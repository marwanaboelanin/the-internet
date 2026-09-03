package fileUpload;

import Page.FileUploadPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        String fileName = "sss.txt";
        String absolutefilePath ="C:\\Users\\LAPTOP\\IdeaProjects\\SeleniumWebDriverOffline\\resources\\"+fileName;
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile(absolutefilePath);
        assertEquals(fileUploadPage.getUploadedFileName() ,fileName,"the file name is incorrect");
    }
}
