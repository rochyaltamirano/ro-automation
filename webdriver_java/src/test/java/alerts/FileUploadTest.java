package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTests {

    @Test
    public void testFileUpload() throws InterruptedException {
        var uploadPage = homePage.clickFileUpload();
        Thread.sleep(3000);
        uploadPage.uploadFile("/Users/rocioaltamirano/IdeaProjects/webdriver_java/resources/chromedriver");

        Assert.assertEquals(uploadPage.getUploadedFiles(), "chromedriver", "Uploaded...");

    }
}
