package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class SelectDropdownList {
    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }

    public static void selectDayFromDropdown(String day) {
        Common.selectOptionByValue(Locators.SeleniumEasy.SelectDropdownList.selectDayOfWeek, day);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.SelectDropdownList.fieldDayOfWeek);
    }
}