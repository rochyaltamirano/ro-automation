package javascript;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class JavaScriptTest extends BaseTests {

    @Test
    public void testSceollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollParagraph(5);
    }

    @Test
    public void testAddMultipleAttributeToDropdown(){
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.addMultipleAttribute();

        var optionsSelect = List.of("Option 1", "Option 2");
        optionsSelect.forEach(dropDownPage::selectFromDropDown);

        var selectedOptions = dropDownPage.getSelectedOptions();
        Assert.assertTrue(selectedOptions.containsAll(optionsSelect), "All options were not selected");
        Assert.assertEquals(selectedOptions.size(), optionsSelect.size(), "Number of selected items");
    }
}
