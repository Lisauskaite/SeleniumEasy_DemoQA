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

public class TestSelenium3 {

    @Test
    public void testInputFieldSelenium() {

        int inputA = 8;
        int inputB = 64;
        int expectedResult = 72;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='at-cv-lightbox-win']")));
        WebElement buttonCloseAdd= driver.findElement(By.xpath("//*[@id='at-cv-lightbox-close']"));
        buttonCloseAdd.click();

        WebElement firstInputField = driver.findElement(By.xpath("//*[@id='sum1']"));
        firstInputField.sendKeys(String.valueOf(inputA));

        WebElement secondInputField = driver.findElement(By.xpath("//*[@id='sum2']"));
        secondInputField.sendKeys(String.valueOf(inputB));

        WebElement buttonGetTotal = driver.findElement(By.xpath("//*[@id='gettotal']//button"));
        buttonGetTotal.click();

        WebElement sumMessage = driver.findElement(By.xpath("//*[@id='displayvalue']"));
        String textMessage = sumMessage.getText();
        Assert.assertEquals(textMessage, String.valueOf(expectedResult));
    }
}

