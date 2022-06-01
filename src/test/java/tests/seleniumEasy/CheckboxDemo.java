package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Locators;
import tests.BaseTest;

public class CheckboxDemo extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.seleniumEasy.CheckboxDemo.open();
    }

    @Test
    public void singleCheckbox() {
        String expectedMessage = "Success - Check box is checked";

        pages.seleniumEasy.CheckboxDemo.clickSingleCheckbox();
        String actualMessage = pages.seleniumEasy.CheckboxDemo.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void multipleCheckboxStatus() {
        String buttonChecked = "Uncheck All";
        String buttonUnchecked = "Check All";

        // 1. Paspaudžiam mygtuką 'Check all'
        pages.Common.clickElement(Locators.SeleniumEasy.CheckboxDemo.buttonMultipleCheckbox);

        // 2. Patikrinam mygtuko tekstą (turėtų būti 'Uncheck all')
        String actualButtonText = pages.seleniumEasy.CheckboxDemo.getMultipleCheckboxButtonText();
        Assert.assertEquals(actualButtonText, buttonChecked);

        // 3. Patikrinam, kad visi checkbox'ai yra pažymėti
        Boolean status = pages.seleniumEasy.CheckboxDemo.checkIfAllCheckboxesAreSelected();
        Assert.assertEquals(status, true);

        // 4. Paspaudžiam mygtuką 'Uncheck all'
        pages.Common.clickElement(Locators.SeleniumEasy.CheckboxDemo.buttonMultipleCheckbox);

        // 5. Patikrinam mygtuko tekstą (turėtų būti 'Check all')
        actualButtonText = pages.seleniumEasy.CheckboxDemo.getMultipleCheckboxButtonText();
        Assert.assertEquals(actualButtonText, buttonUnchecked);

        // 6. Patrikrinam, kad visi checkbox'ai yra nužymėti
        status = pages.seleniumEasy.CheckboxDemo.checkIfAllCheckboxesAreSelected();
        Assert.assertEquals(status, false);
    }
}