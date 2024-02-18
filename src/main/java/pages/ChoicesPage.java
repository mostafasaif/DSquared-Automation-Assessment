package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChoicesPage {
    WebDriver driver;

    private final By example2Btn = By.xpath("//a[@href='/dynamic_loading/2']");

    public ChoicesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickExample2(){
        driver.findElement(example2Btn).click();
    }
}
