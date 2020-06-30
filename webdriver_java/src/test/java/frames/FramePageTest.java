package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramePageTest extends BaseTests {

    @Test
    public void testFrameText() {
        var nestedFramesPage = homePage.clickFrames().clickNestedFrames();
        Assert.assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        Assert.assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
    }
}
