package UpcomingBike;

import Background.LoadDriver;
import CommonFunctions.DataToDisplay;
import CommonFunctions.MoveToFun;
import ReadExcel.Read_From_Excel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Manufacturer extends LoadDriver {

    public static void hondaManufacturer() {
        Actions actions = new Actions(driver);

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement honda = driver.findElement(By.className("custom-select" ));
            MoveToFun.moveto(honda,"Moving element to honda");
            honda.click();
            DataToDisplay.dataHandler(honda, "Click on Honda", "option", Read_From_Excel.value(3, 1));
        } catch (Exception e) {
            System.out.println("Click honda failed" );
        }

        try {
            WebElement move_down = driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div[1]/div[2]/div[2]/div/div[3]/div/div/a[1]" ));
            DataToDisplay.ScrollToView(move_down,"View More Bikes");
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Error in View more bikes " );
        }
    }


        public static void click_on_view_more () {
            try {
                Actions actions=new Actions(driver);
                WebElement click_view_more = driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div[1]/div[2]/ul/li[15]/span" ));
                MoveToFun.moveto(click_view_more,"Click view More");
                MoveToFun.Clickfunction(click_view_more,"Clicking view more");
            } catch (Exception e) {
                System.out.print("View more bikes click failed ");
            }
        }
    }
