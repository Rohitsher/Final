package Login;

import Background.LoadDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Clicknext extends LoadDriver {
    public static void click_next(){//Clicking on next button
        try {
            Actions actions = new Actions(driver);
            WebElement next_click = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[1]"));
            actions.moveToElement(next_click).perform();
            Thread.sleep(5000);

            actions.click().perform();//Clicking on next button
            System.out.println("clicking next passed");
        }
        catch (Exception e){
            System.out.println("Error in clicking next\n"+e);
        }
    }
    public static void tryagain(){//Tryagain Interface
        Actions actions = new Actions(driver);
        try {
/*After clicking to the next button We will move tryagain So this function will send the values again and click them*/
            Thread.sleep(5000);
            WebElement element = driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/div[1]"));
            actions.moveToElement(element).perform();//moving to try again button
            Thread.sleep(5000);
            actions.click().perform();//Clicking on the try again button
            System.out.println("Clicked Try again button\n");
        }
        catch (Exception e){
            System.out.println("Error in clicking Try again button\n"+e);

        }
        try {
            Thread.sleep(5000);
            Second_window.passData();//Passes the data again
            click_next();//Click again

        }catch (Exception e){
            System.out.println("Error in Entering the email\n"+e);
        }

    }
}
