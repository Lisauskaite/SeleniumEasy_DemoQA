package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.util.UUID;

public class TestListener implements ITestListener {


    private void takeScreenshot() {
        try {
            TakesScreenshot takesScreenshot = ((TakesScreenshot) Driver.getDriver());  // susikuriam driver tipo scheenshot veiksma
            File screenshotRaw = takesScreenshot.getScreenshotAs(OutputType.FILE);  // padarom screenshota failu
            String directory = "./screenshots";  // sukurs direktorija pagrindiniam projecto faile
            File screenshotFile = new File(directory + "/screenshot-" + UUID.randomUUID() + ".png");
            // sukuriam pilna direktorija paciam screenshotui, susikurs tuscias failas
            FileUtils.copyFile(screenshotRaw, screenshotFile);
            //sujungiam screenshoto informacija su tusciu sukurtu png failu
        } catch (Exception ex) {
            System.out.println("Exeption while taking a screenshot");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }
}
