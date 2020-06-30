package hover;

import base.BaseTests;
import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTest extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHoversPage();
        var caption = hoversPage.hoverOverFigure(1);

        Assert.assertTrue(caption.isCaptionDisplayed(),"Caption not  displayed!");
        Assert.assertEquals(caption.getTitle(), "name: user1","Caption title incorrect!");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect!");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect!");
    }
}
