package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SelectDropdownList extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.seleniumEasy.SelectDropdownList.open();
    }

    @Test
    public void selectDayOfWeek() {
        String expectedDay = "Wednesday";

        pages.seleniumEasy.SelectDropdownList.selectDayFromDropdown(expectedDay);
        String message = pages.seleniumEasy.SelectDropdownList.readMessage();

        Assert.assertTrue(message.contains(expectedDay));
    }
}