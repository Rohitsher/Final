package UpcomingBike;

import Background.LoadDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Upcoming extends LoadDriver {


    public static void move() {//This function will move to NewBikes Dropdown
        try {
            Actions actions = new Actions(driver);

            WebElement new_bike = driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/div/nav/div[2]/ul/li[3]/a" ));

            actions.moveToElement(new_bike).perform();//Moving to Newbike location

            System.out.println("New bike execution" );
        } catch (Exception e) {
            System.out.println("Error in New Bike Action" );
        }
    }

    public static void click(){//This will click the New bike
        try {

            WebElement dropdown = driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/div/nav/div[2]/ul/li[3]"));
            List<WebElement> list = dropdown.findElements(By.tagName("li"));//Fetching and storeing all the data in the list
            String sortby = "Upcoming Bikes";
            for (WebElement webElement : list) {//This for loop will fetch the Upcoming Bike and click them
                String searchText = webElement.getText();

                if (searchText.equalsIgnoreCase(sortby)) {
                    webElement.click();
                    break;
                }
            }
            System.out.println("Selected the upcoming bikes");
        } catch (Exception e) {
            System.out.println("Error in selecting the Upcoming bikes");
        }
    }
}

