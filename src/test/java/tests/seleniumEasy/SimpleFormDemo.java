package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;
import utilities.Driver;

public class SimpleFormDemo extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.seleniumEasy.SimpleFormDemo.open();
        pages.seleniumEasy.SimpleFormDemo.closeAd();
    }

    @Test
    public void testInputFieldSeleniumEasy() {

        String expectedFullName = "Martynas";

        pages.seleniumEasy.SimpleFormDemo.enterMessage(expectedFullName);
        pages.seleniumEasy.SimpleFormDemo.clickShowMessageButton();
        String textMessage = pages.seleniumEasy.SimpleFormDemo.readMessage();

        Assert.assertEquals(textMessage, expectedFullName);
    }

    @Test
    public void testTwoInputFieldsSeleniumEasy() {
        int input1 = 5;
        int input2 = 7;
        int inputSum = 12;

        pages.seleniumEasy.SimpleFormDemo.enterValueA(Integer.toString(input1));
        pages.seleniumEasy.SimpleFormDemo.enterValueB(Integer.toString(input2));
        pages.seleniumEasy.SimpleFormDemo.clickGetTotalButton();
        String textTotal = pages.seleniumEasy.SimpleFormDemo.readTotal();

        Assert.assertEquals(textTotal, Integer.toString(inputSum));
    }
}
