package tests.demoQA;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class DynamicProperties extends BaseTest {

    @BeforeMethod
    public void open() {
        pages.demoQA.DynamicProperties.open();
    }

    @Test
    public void buttonEnabledAfter() {
        pages.demoQA.DynamicProperties.clickButtonEnabledAfter();
    }

    @Test
    public void buttonChangeColorAfter() {
        pages.demoQA.DynamicProperties.clickButtonWhichChangesColorAfter();
    }
}
