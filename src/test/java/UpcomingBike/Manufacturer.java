package UpcomingBike;

import Background.LoadDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Manufacturer extends LoadDriver {

    public static void hondaManufacturer(){
        Actions actions = new Actions(driver);

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            WebElement honda = driver.findElement(By.className("custom-select"));
            actions.moveToElement(honda).perform();
            honda.click();

            List<WebElement> list = honda.findElements(By.tagName("option"));

            String sortby = "Honda";
            for (WebElement webElement : list) {
                String searchText = webElement.getText();
                //System.out.println(searchText);
                if (searchText.equalsIgnoreCase(sortby)) {
                    webElement.click();
                    break;
                }
            }
            System.out.println("Passed the Selecting the manufacturer");
        } catch (Exception e) {
            System.out.println("Error in selecting the manufacturer");
        }
        try {
            WebElement move_down = driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div[1]/div[2]/div[2]/div/div[3]/div/div/a[1]"));

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", move_down);
            Thread.sleep(500);


            System.out.println("Pass");
        } catch (Exception e) {
            System.out.println("Error in View more bikes ");
        }

    }
    public static void click_on_view_more(){
        try {
            Actions actions = new Actions(driver);


            WebElement click_view_more = driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div[1]/div[2]/ul/li[15]/span"));
            actions.moveToElement(click_view_more).build().perform();
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", click_view_more);

            System.out.println("View more bikes click passed");
        } catch (Exception e) {
            System.out.print("View more bikes click failed " + e);
        }
    }
}
