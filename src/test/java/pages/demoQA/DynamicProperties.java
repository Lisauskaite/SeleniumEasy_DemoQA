package pages.demoQA;

import pages.Common;
import pages.Locators;

public class DynamicProperties {
    public static void open() {
        Common.openUrl("https://demoqa.com/dynamic-properties");
    }

    public static void clickButtonEnabledAfter() {
        Common.waitForElementToBeClickable(Locators.DemoQA.DynamicProperties.buttonEnableAfter);
        Common.clickElement(Locators.DemoQA.DynamicProperties.buttonEnableAfter);
    }

    public static void clickButtonWhichChangesColorAfter() {
        String attributeName = "class";
        String attributeValue = "text-danger";
        Common.waitForElementAttributeToContain(Locators.DemoQA.DynamicProperties.buttonChangeColorAfter, attributeName, attributeValue);
        Common.clickElement(Locators.DemoQA.DynamicProperties.buttonChangeColorAfter);
    }
}
