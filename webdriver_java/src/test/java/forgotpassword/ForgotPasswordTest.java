package forgotpassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTests {
    private String emailARecuperar= "rocioA@lala.com";

    @Test
    public void testRecuperoPass (){
        ForgotPasswordPage recupero = homePage.clickForgotPassword();
        recupero.setEmail(emailARecuperar);

        EmailSentPage email = recupero.clickRetrievePassword();
        Assert.assertTrue(email.getMessageOk()
                .contains("Your e-mail's been sent!"),
                "Text is incorrect");
    }
}
