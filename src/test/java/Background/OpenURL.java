package Background;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.util.concurrent.TimeUnit;

public class OpenURL extends LoadDriver {

    public static void openurl() {
        extent.attachReporter(reporter);
        ExtentTest logger2 = extent.createTest("Browser Test");
        logger2.log(Status.INFO, "Open the URL");
        try {
            String URL = prop.getProperty("url");//Gets the Data through properties file
            driver.get(URL);//loading the URL
            driver.manage().window().maximize();//Maximize the URL
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            logger2.log(Status.PASS, "URL opened");
        } catch (Exception e) {
            System.out.println("Error in loading the Url");
            logger2.log(Status.FAIL, "URL Failed to open");
        }
        extent.flush();
    }
}
