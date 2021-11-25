package CommonFunctions;

import Background.LoadDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataToDisplay extends LoadDriver {
    public static void dataHandler(WebElement element,String method,String tag,String data_to_fetch){
        try {
            List<WebElement> list = element.findElements(By.tagName(tag));
            for (WebElement webElement : list) {//This for loop will fetch the Upcoming Bike and click them
                String searchText = webElement.getText();
                if (searchText.equalsIgnoreCase(data_to_fetch)) {
                    webElement.click();
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("Error in the "+method);
        }
    }

    public static void ScrollToView(WebElement element,String method){
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        }
        catch (Exception e){
            System.out.println("Error in moving the "+method+" into view");
        }
    }

}
