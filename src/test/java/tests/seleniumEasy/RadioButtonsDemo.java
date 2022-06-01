package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RadioButtonsDemo extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.seleniumEasy.RadioButtonsDemo.open();
    }

    @DataProvider(name = "radioButtonGender")
    public Object[][] radioButtonGenderFunction() {
        return new Object[][]{{"Male"},
                {"Female"}};
    }

    @Test(dataProvider = "radioButtonGender")
    public void radioButtonGender(String gender) {
        pages.seleniumEasy.RadioButtonsDemo.clickRadioButtonByGender(gender);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        String message = pages.seleniumEasy.RadioButtonsDemo.readMessage();
        Assert.assertTrue(message.contains(gender));
    }

    @DataProvider(name = "radioButtonGroup", parallel = true)
    public Object[][] radioButtonGroupFunction() {
        return new Object[][]{{"Male", "0 - 5"},
                {"Male", "5 - 15"},
                {"Male", "15 - 50"},
                {"Female", "0 - 5"},
                {"Female", "5 - 15"},
                {"Female", "15 - 50"}};
    }

    @Test(dataProvider = "radioButtonGroup", threadPoolSize = 6)
    public void radioButtonGroup(String gender, String ageGroup) {

        pages.seleniumEasy.RadioButtonsDemo.clickRadioButtonGroupByGender(gender);
        pages.seleniumEasy.RadioButtonsDemo.clickRadioButtonGroupByAgeGroup(ageGroup);
        pages.seleniumEasy.RadioButtonsDemo.clickGetValues();
        String message = pages.seleniumEasy.RadioButtonsDemo.readGroupMessage();

        Assert.assertTrue(message.contains(gender));
        Assert.assertTrue(message.contains(ageGroup));
    }
}
