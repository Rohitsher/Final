package Background;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class LoadDriver {
    public static WebDriver driver;
    public static File file;
    public static FileInputStream fileinput;
    public static Properties prop;
    public static ExtentSparkReporter reporter;
    public static ExtentReports extent = new ExtentReports();


    public static void launch(String reportname) {
        reporter = new ExtentSparkReporter("./Reports/" + reportname + ".html");
        extent.attachReporter(reporter);
        ExtentTest logger1 = extent.createTest("Browser Test");
        logger1.log(Status.INFO, "Open the Application");

        try {

            String filelocation = System.getProperty("user.dir") + "\\ApplicationProperty\\config.properties";//Properties file Location
            file = new File(filelocation);
            fileinput = new FileInputStream(file);
            prop = new Properties();
            prop.load(fileinput);

            String browser = prop.getProperty("browserChoice");//Reading the value from properties file
            System.out.println(browser);
            if (browser.equalsIgnoreCase("chrome")) {//if the value in the properties file is chrome then chrome driver will open
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {//if the value in the properties file is firefox then firefox driver will open
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("Edge")) {//if the value in the properties file is Edge then Edge driver will open
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();

            } else {
                System.out.println("Invalid data...");
            }
            logger1.log(Status.PASS, "Browser opened");
        } catch (Exception e) {
            System.out.println("Browser Input");
            System.out.println(e);
            logger1.log(Status.FAIL, "Browser Failed to open");
        }
        extent.flush();
    }
}

