package tests.seleniumEasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium2 {

    @Test
    public void testInputFieldSeleniumEasy() {

        String expectedFullName = "Martynas";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        //padarom kad palauktu
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //laukia kol reklama bus matoma
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='at-cv-lightbox-win']")));
        //surandam mygtuka kad isjungt reklama
        WebElement buttonCloseAdd= driver.findElement(By.xpath("//*[@id='at-cv-lightbox-close']"));
        //paspaudziam elementa
        buttonCloseAdd.click();
        //surandam ivedimo laukeli
        WebElement singleInputField = driver.findElement(By.xpath("//*[@id='user-message']"));
        //ivedam i laukeli teksta
        singleInputField.sendKeys(expectedFullName);
        //surandam [show message] mygtuka
        WebElement buttonShowMessage = driver.findElement(By.xpath("//*[@id='get-input']//button"));
        //paspaudziam mygtuka
        buttonShowMessage.click();
        //nuskaitom teksta, nes mum atsiranda elementas puslapyje su tuo tekstu
        WebElement elementMessage = driver.findElement(By.xpath("//*[@id='display']"));
        //sukuriam kintamaji tam tekstui
        String textMessage = elementMessage.getText();
        //lyginam tekstus
        Assert.assertEquals(textMessage, expectedFullName);
    }
}