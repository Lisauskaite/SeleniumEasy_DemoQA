package tests.demoQA;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Buttons extends BaseTest {

    @BeforeMethod
    public void open() {
//        Alternative way of reaching Buttons page from Home page
//        pages.demoQA.Home.open();
//        pages.demoQA.Home.clickElementsPage();
//        pages.demoQA.Elements.clickButtonsPage();

        pages.demoQA.Buttons.open();
    }

    @Test
    public void doubleClick() {
        String expectedMessage = "You have done a double click";

        pages.demoQA.Buttons.performDoubleClick();
        String actualMessage = pages.demoQA.Buttons.readMessageDoubleClick();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void rightClick() {
        String expectedMessage = "You have done a right click";

        pages.demoQA.Buttons.performRightClick();
        String actualMessage = pages.demoQA.Buttons.readMessageRightClick();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
