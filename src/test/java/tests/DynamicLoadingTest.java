package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ChoicesPage;
import pages.DynamicElement;
import pages.WelcomePage;

public class DynamicLoadingTest extends BaseTest {
    private WelcomePage welcomePage;
    private ChoicesPage choicesPage;
    private DynamicElement dynamicElement;

    @BeforeClass
    public void beforeClass() {
        welcomePage = new WelcomePage(driver);
        choicesPage = new ChoicesPage(driver);
        dynamicElement = new DynamicElement(driver);
    }

    @Test
    public void testDynamicLoading() {
        navigateBackToDefaultPage();
        welcomePage.clickDynamicLoadingBtn();
        choicesPage.clickExample2();
        dynamicElement.clickStartBtn();
        dynamicElement.waitUntilHelloWorldAppears();
        Assert.assertTrue(dynamicElement.isHelloWorldAppears());
    }
}
