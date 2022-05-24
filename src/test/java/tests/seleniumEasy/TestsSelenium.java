package tests.seleniumEasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsSelenium {

    @Test
    public void Demo() {

        String expectedFullName = "Martynas";
        WebDriverManager.chromedriver().setup();        //susisetupinam chromo driveri   WebDriverManager.[driverio pavadinimas]driver().setup();
        WebDriver driver = new ChromeDriver();          // susikuriam driverio objekta   WebDriver [naujas objektas] = new [driverio pavadinimas]Driver();

        driver.get("https://demoqa.com/text-box");      //atidarom puslapi    driver.get("https://[pilna puslapio nuoroda]");

        //sukuriam objekta ir irasom jo id              //WebElement [naujas objektas] = driver.findElement(By.xpath("//*[@id='[elemento id]']"));
        WebElement inputFullName = driver.findElement(By.xpath("//*[@id='userName']"));
        inputFullName.sendKeys(expectedFullName);           // idedam tekta i ta elementa kuri issikvietem  [objektas sukurtas elementui].sendKeys(("tekstas kuri norim irasyti"));

        // cia tas pats elemento iskvietimas tik kitais metodais, bet mes naudosim xpath
        //        driver.findElement(By.id("userName"));
        //driver.findElement(By.cssSelector("#userName"));

        // issikvieciam submit mygtuko elementa ir paspausdziam ji
//        WebElement buttonSubmit = driver.findElement(By.xpath("//*[@id='submit']"));
//        buttonSubmit.click();


        String textFullName = inputFullName.getText(); // pasiemam ivesta teksta ir sukuriam objekta
        Assert.assertEquals(textFullName, "Martynas"); // palyginam ka ivedem su tuo kas tyri buti
        //neveikia, reikia pataisyti


//        driver.quit();                                  // uzdarom puslapi
    }
}
