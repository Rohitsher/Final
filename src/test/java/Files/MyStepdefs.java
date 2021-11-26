package Files;
import Background.AssertFun;
import Background.Close;
import Background.LoadDriver;
import Background.OpenURL;
import Login.Clicknext;
import Login.Clickon;
import Login.Second_window;
import PopularCars.Popularcars;
import UpcomingBike.Manufacturer;
import UpcomingBike.Store;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import ReadExcel.Read_From_Excel;
import write.WriteInNotepad;

public class MyStepdefs extends LoadDriver{
    @Given("Open the Webdriver")
    public void openTheWebdriver() {
            LoadDriver.launch("OpenURL");//This function will launch the Driver
    }
    @Then("Enter The  URL")
    public void enterTheURL() {
        OpenURL.openurl();//Opens the URL

    }

    @When("Page is Loaded")
    public void pageIsLoaded()  {
        System.out.println("Page is loading");
    }

    @And("Check the URL")
    public void checkTheURL() {
       String value= Read_From_Excel.value(1,1);//Get the value from excel and store it in the variable value
        AssertFun.Assert(value);//Assertion function

    }


    @Given("The page")
    public void thePage() {
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
    }

    @Then("Move to new Bike")
    public void moveToNewBike() {
        UpcomingBike.Upcoming.move();//Move to the Newbikes button and move to Upcoming bikes
    }

    @And("click on the Upcoming bikes from the list")
    public void clickOnTheUpcomingBikesFromTheList() {
        UpcomingBike.Upcoming.click();//Click on Upcoming bikes
    }

    @Then("Select The manufacturer as honda")
    public void selectTheManufacturerAsHonda() {
        UpcomingBike.Manufacturer.hondaManufacturer();//Selects the Manufacturer as Honda
    }

    @When("Results are displayed")
    public void resultsAreDisplayed() {
        Manufacturer.click_on_view_more();//View All the Bikes under honda
        Store.store_upcoming_bike();//Store them
    }

    @And("Display them All")
    public void displayThemAll() {
        Store.display_bikes();//Displayes the bikes under 400000
    }

    @Then("close the Browser")
    public void closeTheBrowser() {
        Close.closingTheBrowser();//Closes the browser
    }

    @Then("Move to Used Cars")
    public void moveToUsedCars() {
        Popularcars.move_UsedTo();//Move to Used Car button
    }

    @And("Select the city")
    public void selectTheCity() {
        Popularcars.Select_City();//Select the city
    }

    @Then("Move to the Popular cars")
    public void moveToThePopularCars() {
        Popularcars.movetoPopular();//Scroll till popular cars are visible
    }

    @And("Store and Display details")
    public void storeAndDisplayDetails() {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Store.xmp("/html/body/div[11]/div/div[1]/div[1]/div[1]/div[2]/ul/li[2]/div[2]/div[4]/ul");//Captures the popular cars
       Store.display_Result("Popular Cars");//Displays the result



    }
    @Then("Move to Login Button")
    public void moveToLoginButton() {
        Login.Clickon.moveToLogin();//move to login popup

    }
    

    @And("Click it")
    public void clickIt() {
        Clickon.clickit();//click on it
    }




    @Then("Click on continue with google")
    public void clickOnContinueWithGoogle() {
        Second_window.move_to_next_window();//moving to child window

    }

    @And("Give Invalid Credentials")
    public void giveInvalidCredentials()  {
        Second_window.passData();//Passing the Data
        Clicknext.click_next();//and Click next

        
    }

    @Then("Capture the Invalid Message")
    public void captureTheInvalidMessage() throws InterruptedException {
        Clicknext.tryagain();//tryagain button and send the details again
        Thread.sleep(5000);

    }



    @Then("Screenshot capture")
    public void screenshotCapture() throws IOException {

        Login.Screenshot.takeSnapShot(driver, "C:\\Users\\hp\\IdeaProjects\\Final\\Images//test1.png");//capture the screen shot
        Second_window.switch_to();
        driver.quit();
    }
}

