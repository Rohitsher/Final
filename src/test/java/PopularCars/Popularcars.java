package PopularCars;

import Background.LoadDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Popularcars extends LoadDriver {
    public static void move_UsedTo(){//This function is used to move to Used cars button
        try {
            Thread.sleep(10000);
            Actions actions = new Actions(driver);


            WebElement usedcars = driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/div/nav/div[2]/ul/li[5]/a"));

            actions.moveToElement(usedcars).perform();//Moving to Used cars button

            System.out.println("Successfully moved to used cars button");


        } catch (Exception e) {
            System.out.println("Error in moving to used cars button");
        }

    }
    public static void Select_City(){
        try {

            WebElement dropdown = driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/div/nav/div[2]/ul/li[5]"));
            List<WebElement> list = dropdown.findElements(By.tagName("li"));//Capture the all the City details
            String sortby = "Chennai";
            for (WebElement webElement : list) {
                String searchText = webElement.getText();//This for loop is used to fetch the city chennai and click it

                if (searchText.equalsIgnoreCase(sortby)) {//Comparing the sortby and The text we got from the List
                    webElement.click();//clicking the city
                    break;
                }
            }
            System.out.println("Selected the city");
        } catch (Exception e) {
            System.out.println("Error in selecting the city");
        }
    }
    public  static void movetoPopular(){
        try {
            WebElement move_down = driver.findElement(By.xpath("/html/body/div[11]/div/div[1]/div[1]/div[1]/div[2]/ul/li[2]/div[2]/h3"));

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", move_down);//Move to popular cars
            //The above statement is used to scroll till the element is visible.
            Thread.sleep(500);


            System.out.println("Successfully scroll down till view");
        } catch (Exception e) {
            System.out.println("Error in scrolling down ");
        }
    }
}
