package tests.demoQA;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class BrowserWindows extends BaseTest {

    @BeforeMethod
    public void open() {
        pages.demoQA.BrowserWindows.open();
    }

    @Test
    public void buttonEnabledAfter() {
        // Heading values from parent and new tab for asserting
        String expectedParentTabHeading = "Browser Windows";
        String expectedNewTabHeading = "This is a sample page";

        // Save handle of the parent tab (window)
        String parentWindowHandle = pages.demoQA.BrowserWindows.getCurrentWindowHandle();

        // Click button to open new tab (window) and assert 2 tabs (windows) are present
        pages.demoQA.BrowserWindows.clickNewTab();
        Integer windowsCount = pages.demoQA.BrowserWindows.getWindowsCount();
        Assert.assertEquals(windowsCount, 2);

        // Switch to new tab (window) and assert heading against test data
        pages.demoQA.BrowserWindows.switchToNewWindowFromParentWindowByHandle(parentWindowHandle);
        String newWindowHandle = pages.demoQA.BrowserWindows.getCurrentWindowHandle();
        String actualNewTabHeading = pages.demoQA.BrowserWindows.readNewTabHeading();
        Assert.assertEquals(actualNewTabHeading, expectedNewTabHeading);

        // Switch to parent tab (window) and assert heading against test data
        pages.demoQA.BrowserWindows.switchToWindowByHandle(parentWindowHandle);
        String actualParentTabHeading = pages.demoQA.BrowserWindows.readParentTabHeading();
        Assert.assertEquals(actualParentTabHeading, expectedParentTabHeading);

        // Close new tab and assert 1 tab (window) is present
        pages.demoQA.BrowserWindows.closeWindowByHandle(newWindowHandle);
        pages.demoQA.BrowserWindows.switchToWindowByHandle(parentWindowHandle);
        windowsCount = pages.demoQA.BrowserWindows.getWindowsCount();
        Assert.assertEquals(windowsCount, 1);
    }
}
