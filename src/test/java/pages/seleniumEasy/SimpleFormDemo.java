package pages.seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import utilities.Driver;

import java.time.Duration;

public class SimpleFormDemo {

    //metodas atidaryti konkretu puslapi
    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    //metodas uzdaryti reklama
    public static void clodeAdd() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='at-cv-lightbox-close']")));
        Common.clickElement(By.xpath("//*[@id='at-cv-lightbox-close']"));
    }

    //metodas irasyti teksta i laukeli
    public static void enterMessage(String message) {
        By locator = By.xpath("//*[@id='user-message']");   // locatorius
        Common.sendKeysToElement(locator, message);
    }

    public static void clickShowMessageButton() {
        By locator = By.xpath("//*[@id='get-input']//button");
        Common.clickElement(locator);
    }
    public static String readMessage() {
        By locator = By.xpath("//*[@id='display']");
        Common.getElement(locator);
        return readMessage();
    }
    public static void enterValueA(String value) {
        By locator = By.xpath("//*[@id='sum1']");
        Common.sendKeysToElement(locator, value);
    }
    public static void enterValueB(String value) {
        By locator = By.xpath("//*[@id='sum2']");
        Common.sendKeysToElement(locator, value);
    }
    public static void clickGetTotal() {
        By locator = By.xpath("//*[@id='gettotal']//button");
        Common.clickElement(locator);
    }
    public static String readTotal() {
        By locator = By.xpath("//*[@id='displayvalue']");
        Common.getElement(locator);
        return readTotal();
    }
    }
