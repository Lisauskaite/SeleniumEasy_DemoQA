package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class RadioButtonsDemo {
    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    public static void clickRadioButtonByGender(String gender) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.inputByGender(gender));
    }

    public static void clickGetCheckedValue() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.buttonGetCheckedValue);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.RadioButtonsDemo.fieldCheckedValue);
    }

    public static void clickRadioButtonGroupByGender(String gender) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.inputByGenderGroup(gender));
    }

    public static void clickRadioButtonGroupByAgeGroup(String ageGroup) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.inputByAgeGroup(ageGroup));
    }

    public static void clickGetValues() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.buttonGetValues);
    }

    public static String readGroupMessage() {
        return Common.getElementText(Locators.SeleniumEasy.RadioButtonsDemo.fieldValue);
    }
}
