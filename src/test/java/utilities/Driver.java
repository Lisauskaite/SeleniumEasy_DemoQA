package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    //iskvieciam webriveri
    private static WebDriver driver;

    //priskiriam driver chrome driverio savybes
    public static void setDriver (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    //iskviesti driveri/ atidaryti puslapi
    public static WebDriver getDriver(){
        return driver;
    }
    //uzdaryti driver
    public static void closeDriver (){
        driver.quit();
    }
}
