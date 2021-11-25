package Background;
import org.testng.Assert;

public class AssertFun extends LoadDriver {
    public static void Assert(String value) {
        try {
            String FoundTitle = driver.getTitle();//got the Title of web page
            Assert.assertEquals(FoundTitle, value);//Comparing the values

        } catch (AssertionError e) {
            System.out.println("Error in the Check the URL");
        }
    }
}