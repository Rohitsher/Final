package Background;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;

public class AssertFun extends LoadDriver {
    public static void Assert(String value) {
        extent.attachReporter(reporter);
        ExtentTest logger3 = extent.createTest("Browser Test");
        logger3.log(Status.INFO, "Open the Application");

        try {
            String FoundTitle = driver.getTitle();//got the Title of web page
            Assert.assertEquals(FoundTitle, value);//Comparing the values
            logger3.log(Status.PASS, "Assert Passed");
        } catch (AssertionError e) {
            System.out.println("Error in the Check the URL");
            logger3.log(Status.FAIL, "Assert Failed");
        }
        extent.flush();
    }
}