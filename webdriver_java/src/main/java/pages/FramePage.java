package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {

    private WebDriver driver;
    private By link = By.linkText("Nested Frames");

    public FramePage(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFrames(){
        driver.findElement(link).click();
        return new NestedFramesPage(driver);

    }
}
