package Login;

import Background.LoadDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Second_window extends LoadDriver {
   static Actions actions = new Actions(driver);

    public static void move_to_next_window() {
        try {

            Set<String> handler = driver.getWindowHandles();//To get the handler of parent and child window
            Iterator<String> it = handler.iterator();//To move to next handler
            String Parent_window_id = it.next();
            String Child_window_id = it.next();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.switchTo().window(Child_window_id);//Switch to child browser
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("Unable to move to child window" );
        }
    }

    public static void passData(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
        actions.moveToElement(element);//Move to paticular element
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String email = "rman.com";
        element.sendKeys(email);//Send the data
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
