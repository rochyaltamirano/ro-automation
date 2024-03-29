package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;
    private By message = By.id("content");

    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    public String getMessageOk(){
        return driver.findElement(message).getText();
    }
}
