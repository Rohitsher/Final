package PopularCars;

import Background.LoadDriver;
import CommonFunctions.DataToDisplay;
import CommonFunctions.MoveToFun;
import ReadExcel.Read_From_Excel;
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
            DataToDisplay.dataHandler(dropdown,"Selecting the city","li", Read_From_Excel.value(4,1));
            System.out.println("Selected the city");
        } catch (Exception e) {
            System.out.println("Error in selecting the city");
        }
    }
    public  static void movetoPopular(){
        try {
            WebElement move_down = driver.findElement(By.xpath("/html/body/div[11]/div/div[1]/div[1]/div[1]/div[2]/ul/li[2]/div[2]/h3"));
            DataToDisplay.ScrollToView(move_down,"Scrolling till Popular cars is found");
            System.out.println("Successfully scroll down till view");
        } catch (Exception e) {
            System.out.println("Error in scrolling down ");
        }
    }
}
