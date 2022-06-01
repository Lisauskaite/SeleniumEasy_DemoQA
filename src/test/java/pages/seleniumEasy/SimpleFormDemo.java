package pages.seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import pages.Locators;
import utilities.Driver;

import java.time.Duration;

public class SimpleFormDemo {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void closeAd() {
        Common.waitForElementToBeVisible(Locators.SeleniumEasy.SimpleFormDemo.frameAd);
        Common.clickElement(Locators.SeleniumEasy.SimpleFormDemo.buttonCloseAd);
    }

    public static void enterMessage(String message) {
        Common.sendKeysToElement(Locators.SeleniumEasy.SimpleFormDemo.inputMessage, message);
    }

    public static void clickShowMessageButton() {
        Common.clickElement(Locators.SeleniumEasy.SimpleFormDemo.buttonShowMessage);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.SimpleFormDemo.fieldMessage);
    }

    public static void enterValueA(String value) {
        Common.sendKeysToElement(Locators.SeleniumEasy.SimpleFormDemo.inputValueA, value);
    }

    public static void enterValueB(String value) {
        Common.sendKeysToElement(Locators.SeleniumEasy.SimpleFormDemo.inputValueB, value);
    }

    public static void clickGetTotalButton() {
        Common.clickElement(Locators.SeleniumEasy.SimpleFormDemo.buttonGetTotal);
    }

    public static String readTotal() {
        return Common.getElementText(Locators.SeleniumEasy.SimpleFormDemo.fieldTotal);
    }
}