package UpcomingBike;

import Background.LoadDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import write.WriteInNotepad;

import java.util.List;

public class Store extends LoadDriver {
    static List<WebElement> Details;
    public static void store_upcoming_bike(){//Stored all the bike details In the List
        WebElement models = driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div[1]/div[2]/ul"));
        Details = models.findElements(By.tagName("li"));
    }
    public static void display_bikes(){//This function will print all the bike details below 4lakhs
        System.out.println("Bike Model\t\tDate Of Launch\t\tPrice");
        WriteInNotepad.write_in_notepad("Bike Model\t\tDate Of Launch\t\tPrice");
        try{

            for (int i=0;i<Details.size();i++) {


                if (i == 6 || i == Details.size()-1) {
                    continue;
                } else {
                    int price = Integer.parseInt(Details.get(i).getAttribute("data-price"));
                    if (price <= 400000) {
                        String model = Details.get(i).getText();
                        String[] m = model.split("\n");
//Below line will print Bike model,date of launch and Price by using getAttribute method.
                        WriteInNotepad.write_in_notepad(m[0]);
                        WriteInNotepad.write_in_notepad(Details.get(i).getAttribute("data-explaunch"));
                        WriteInNotepad.write_in_notepad(Details.get(i).getAttribute("data-price"));
                        System.out.println(m[0] + "\t\t" + Details.get(i).getAttribute("data-explaunch") + "\t\t" + Details.get(i).getAttribute("data-price"));
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("Error in the Store all the Details function");
        }

    }
    public static void xmp(String path){//This function will fetch the data of Popular cars
        WebElement element=driver.findElement(By.xpath(path));
        Details = element.findElements(By.tagName("li"));

    }
    public static void display_Result(String value){
        //Didplays the popular cars
        System.out.println("The Details of "+value);
        for (WebElement webElement : Details) {
            System.out.println(webElement.getText());
        }
    }

}
