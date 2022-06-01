package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

import java.util.List;

public class CheckboxDemo {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public static void clickSingleCheckbox() {
        Common.clickElement(Locators.SeleniumEasy.CheckboxDemo.inputSingleCheckbox);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.CheckboxDemo.fieldSingleCheckbox);
    }

    public static String getMultipleCheckboxButtonText() {
        return Common.getElementAttributeValue(Locators.SeleniumEasy.CheckboxDemo.buttonMultipleCheckbox, "value");
    }

    public static Boolean checkIfAllCheckboxesAreSelected() {
        // Pasiimam elementų pažymėjimo reikšmių sarašą
        List<Boolean> statusList = Common.getSelectedStatusForCheckboxesByLocator(Locators.SeleniumEasy.CheckboxDemo.inputMultipleCheckbox);

        // Tikrinam visas reikšmes
        for (Boolean status : statusList) {

            // Jeigu bent viena reikšmė yra false, gražinam false
            if (!status) {
                return false;
            }
        }

        // Jeigu patikrinus visas reikšmes nei viena nebuvo false, tada gražinam true
        return true;
    }
}
