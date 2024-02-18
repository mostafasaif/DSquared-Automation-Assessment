package tests;

import data.ExcelReader;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import pages.WelcomePage;

import java.io.IOException;

public class FileUploadTest extends BaseTest {
    WelcomePage welcomePage;
    String path;
    FileUploadPage fileUpload;
    @BeforeClass
    public void BeforeTest(){
        welcomePage = new WelcomePage(driver);
        fileUpload = new FileUploadPage(driver);
    }

    @Test(dataProvider = "RegistrationData")
    public void welcomeTest(String path) throws InterruptedException {
        System.out.println("This is the path" + path);
        welcomePage.clickFileUpload();
        fileUpload.uploadFile(path);
        //this sleep just to see the success of the process
        Thread.sleep(5200);
        Assert.assertEquals(true,fileUpload.isUploadSucceeded());
    }

    @DataProvider(name = "RegistrationData")
    public Object[][] data() throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/test/java/data/regData.xlsx";
        ExcelReader er = new ExcelReader(filePath);
        return er.getExcelData(1);
    }

}
