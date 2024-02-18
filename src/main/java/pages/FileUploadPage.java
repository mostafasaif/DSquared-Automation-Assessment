package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private final WebDriver driver;
    private final By chooseFileBtn = By.id("file-upload");
    private final By submitBtn = By.id("file-submit");
    private final By uploadSuccess = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        driver.findElement(chooseFileBtn).sendKeys(filePath);
        driver.findElement(submitBtn).click();
    }

    public boolean isUploadSucceeded() {
        return driver.findElement(uploadSuccess).isDisplayed();
    }
}
