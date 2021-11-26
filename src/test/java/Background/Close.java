package Background;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Close extends LoadDriver {
    public static void closingTheBrowser() {
        extent.attachReporter(reporter);
        ExtentTest logger4 = extent.createTest("Browser Test");
        logger4.log(Status.INFO, "Close the Application");
        try {

            driver.close();//Close the Driver
            logger4.log(Status.PASS, "Browser Closed");
        } catch (Exception e) {
            logger4.log(Status.FAIL, "Browser Failed to close");
        }
        extent.flush();
    }


}
