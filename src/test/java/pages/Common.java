package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Common {

    //metodas atidaryti kazkoki url (skliausteliuose nuoroda)
    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    //metodas gauti elementa pagal id. tipas WebElement, nes gausim puslapio elementa
    public static WebElement getElement(By locator) { // locator - byxpath(id)
        return Driver.getDriver().findElement(locator);

    }

    //metodas paspausti ant mygtuko, locator - id mygtuko
    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    //metodas ivesti i laukeli uzrasa. locator - laukelio id, keys - tai ka norim ivest
    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    //metodas gauti uzrasa is elemento puslapyje
    public static String getText(By locator) {
        return getElement(locator).getText();
    }
}
