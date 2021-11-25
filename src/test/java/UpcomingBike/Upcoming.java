package UpcomingBike;


import Background.LoadDriver;
import CommonFunctions.DataToDisplay;
import CommonFunctions.MoveToFun;
import ReadExcel.Read_From_Excel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Upcoming extends LoadDriver {


    public static void move() {//This function will move to NewBikes Dropdown
        WebElement element=driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/div/nav/div[2]/ul/li[3]/a"));
        MoveToFun.moveto(element,"Move to new bike");
    }

    public static void click() {//This will click the New bike

        WebElement dropdown = driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/div/nav/div[2]/ul/li[3]" ));
        DataToDisplay.dataHandler(dropdown, "Selecting Upcoming Bikes", "li", Read_From_Excel.value(2, 1));
    }
}

