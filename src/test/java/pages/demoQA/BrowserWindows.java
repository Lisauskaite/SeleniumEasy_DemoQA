package pages.demoQA;

import pages.Common;
import pages.Locators;

import java.util.Set;

public class BrowserWindows {
    public static void open() {
        Common.openUrl("https://demoqa.com/browser-windows");
    }

    public static String readParentTabHeading() {
        return Common.getElementText(Locators.DemoQA.BrowserWindows.headingParentTab);
    }

    public static void clickNewTab() {
        Common.clickElement(Locators.DemoQA.BrowserWindows.buttonNewTab);
    }

    public static String readNewTabHeading() {
        return Common.getElementText(Locators.DemoQA.BrowserWindows.headingNewTab);
    }

    public static void switchToWindowByHandle(String tab) {
        Common.switchToWindowByHandle(tab);
    }

    public static String getCurrentWindowHandle() {
        return Common.getCurrentWindowHandle();
    }

    public static void closeWindowByHandle(String tab) {
        Common.closeWindowByHandle(tab);
    }

    public static Integer getWindowsCount() {
        return Common.getCurrentWindowsHandles().size();
    }

    public static void switchToNewWindowFromParentWindowByHandle(String currentTab) {
        Set<String> handles = Common.getCurrentWindowsHandles();
        for (String handle : handles) {
            if (!handle.equals(currentTab)) {
                Common.switchToWindowByHandle(handle);
            }
        }
    }
}
