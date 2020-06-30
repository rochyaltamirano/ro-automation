package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By email = By.name("email");
    private By retrieveButton = By.cssSelector("#form_submit");

    public ForgotPasswordPage (WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String emailArecuperar){
        driver.findElement(email).sendKeys(emailArecuperar);
    }

    public EmailSentPage clickRetrievePassword(){
        driver.findElement(retrieveButton).click();
        return new EmailSentPage (driver);
    }


}
