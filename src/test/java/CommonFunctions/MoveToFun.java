package CommonFunctions;

import Background.LoadDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToFun extends LoadDriver {
    static Actions actions=new Actions(driver);

    public static void moveto(WebElement element,String method){//This function will take 2 aruments
            try{
                actions.moveToElement(element).perform();//Moving to Newbike location
            }
            catch (Exception e){
                System.out.println("Failed to move "+method);
                System.out.println(e);
            }
    }

    public static void Clickfunction(WebElement element,String method){
        try{
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
        catch (Exception e){
            System.out.println("Error in clicking "+method);
        }
    }
}
