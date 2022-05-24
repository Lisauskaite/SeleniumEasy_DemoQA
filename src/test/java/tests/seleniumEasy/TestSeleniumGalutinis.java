package tests.seleniumEasy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.seleniumEasy.SimpleFormDemo;
import utilities.Driver;

public class TestSeleniumGalutinis {

    @BeforeMethod    //tai ka darys prie kiekvieno testo paleidima, situ atveju atidarys narsykle ir puslapi
    public void setup() {

      Driver.setDriver();   //atidaro narsykle
      SimpleFormDemo.open();  // ijungia puslapi
      SimpleFormDemo.clodeAdd();  // uzdaro reklama
    }

    @Test
    public void testInputFieldSeleniumEasy() {

        String expectedFullName = "Martynas";

        SimpleFormDemo.enterMessage(expectedFullName);
        SimpleFormDemo.clickShowMessageButton();
        String textMessage = SimpleFormDemo.readMessage();
        Assert.assertEquals(textMessage, expectedFullName);
    }
    @Test
    public void testInputFieldSelenium() {

        int inputA = 8;
        int inputB = 64;
        int expectedResult = 72;

        SimpleFormDemo.enterValueA(Integer.toString(inputA));
        SimpleFormDemo.enterValueB(Integer.toString(inputB));
        SimpleFormDemo.clickGetTotal();
        String textMessage = SimpleFormDemo.readTotal();
        Assert.assertEquals(textMessage, String.valueOf(expectedResult));
    }

    @AfterMethod       // tai daryt po kiekvieno testo, uzdarys narsykle
    public void teardown() {
        Driver.closeDriver();
    }
}

