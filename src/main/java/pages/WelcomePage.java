package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    private WebDriver driver;
    private final By fileUpload = By.xpath("//a[@href='/upload']");
    private final By dynamicLoadingBtn = By.xpath("//a[normalize-space()='Dynamic Loading']");

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFileUpload(){
        driver.findElement(fileUpload).click();
    }
    public void clickDynamicLoadingBtn(){
        driver.findElement(dynamicLoadingBtn).click();
    }
}
