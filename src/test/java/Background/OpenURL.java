package Background;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class OpenURL extends LoadDriver {

    public static void openurl(){
        try{
            String filelocation = System.getProperty("user.dir") + "\\ApplicationProperty\\config.properties";//Location of propertiesfile
            file = new File(filelocation);
            fileinput = new FileInputStream(file);
            prop = new Properties();
            prop.load(fileinput);


            String URL = prop.getProperty("url");//Gets the Data through properties file
            driver.get(URL);//loading the URL
            driver.manage().window().maximize();//Maximize the URL
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        }
        catch (Exception e){
            System.out.println("Error in loading the Url");
        }
    }
}
