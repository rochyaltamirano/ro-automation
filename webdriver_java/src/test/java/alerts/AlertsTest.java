package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTests {

    @Test
    public void testAcceptAlert() throws InterruptedException {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();

        Assert.assertEquals(alertPage.getResult(), "You successfuly clicked an alert");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();

        String text = alertPage.alert_getText();
        alertPage.alert_clickToDissmiss();
        Assert.assertEquals(text, "I am a JS Confirm", "Alert text incorrect!");
    }

    @Test
    public void testSetInputAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();

        String text = "TAU rocks!";
        alertPage.alert_setInput(text);
        alertPage.alert_clickToAccept();

        Assert.assertEquals(alertPage.getResult(), "You entered: " + text, "Results text incorrect!");
    }
}
