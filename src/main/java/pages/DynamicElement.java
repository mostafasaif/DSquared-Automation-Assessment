package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicElement {
    WebDriver driver;
    private final By startBtn = By.xpath("//button[text()='Start']");//button[text()='Start']

    private final By helloWorldWord = By.xpath("//h4[normalize-space()='Hello World!']");

    public DynamicElement(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartBtn(){
        driver.findElement(startBtn).click();
    }
    public void waitUntilHelloWorldAppears() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait with a timeout of 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(helloWorldWord)); // Wait for the element to be visible
    }
    public boolean isHelloWorldAppears(){
        return (driver.findElement(helloWorldWord).isDisplayed());
    }

}
