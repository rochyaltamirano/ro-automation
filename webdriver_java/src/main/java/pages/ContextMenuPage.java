package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By contextMenu = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickDerecho (){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(contextMenu)).build().perform();
    }

    public String validarTextoModal(){
       return  driver.switchTo().alert().getText();
    }

    public void botonAceptar(){
        driver.switchTo().alert().accept();
    }
}
