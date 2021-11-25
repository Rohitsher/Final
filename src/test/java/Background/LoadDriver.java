package Background;

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
    public static Actions act;
    public static WebDriverWait wait;
    public static File file;
    public static FileInputStream fileinput;
    public static Properties prop;


    public static void launch() {
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
            act = new Actions(driver);
        } catch (Exception e) {
            System.out.println("Browser Input");
            System.out.println(e);
        }
    }
}

