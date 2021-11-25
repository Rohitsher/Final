package Login;

import Background.LoadDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Clickon extends LoadDriver {
    public static void moveToLogin() {//move to login pop up button
        try{
            Actions action=new Actions(driver);
            WebElement element=driver.findElement
                    (By.xpath("/html/body/header/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[1]/div"));

            action.moveToElement(element).perform();//Here we move to The login button
            System.out.println("Moved to Login button");
        }

        catch (Exception e){
            System.out.println("Unable to move to Login button");
        }
    }


    public static void clickit(){//Click on the login button
        try{
            WebElement element=driver.findElement
                    (By.xpath("/html/body/div[21]/div/div/div/div/div[3]/div[2]"));
            Thread.sleep(5000);

            element.click();//Clicking on to the button
            System.out.println("Successfullyu clicked on login");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        catch (Exception e){
            System.out.println("Failed to click on Login");
        }

    }
}
