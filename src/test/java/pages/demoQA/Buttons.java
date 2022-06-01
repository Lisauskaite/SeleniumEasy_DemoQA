package pages.demoQA;

import pages.Common;
import pages.Locators;

public class Buttons {
    public static void open() {
        Common.openUrl("https://demoqa.com/buttons");
    }

    public static void performDoubleClick() {
        Common.doubleClick(Locators.DemoQA.Buttons.buttonDoubleClick);
    }

    public static String readMessageDoubleClick() {
        return Common.getElementText(Locators.DemoQA.Buttons.fieldDoubleClick);
    }

    public static void performRightClick() {
        Common.rightClick(Locators.DemoQA.Buttons.buttonRightClick);
    }

    public static String readMessageRightClick() {
        return Common.getElementText(Locators.DemoQA.Buttons.fieldRightClick);
    }
}
