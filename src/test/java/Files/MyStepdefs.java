package Files;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import ReadExcel.Read_From_Excel;


public class MyStepdefs {
    WebDriver driver;
    List<WebElement> Details;

    @Given("Open the Webdriver")
    public void openTheWebdriver() {
        try {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } catch (Exception e) {
            System.out.println("Error in loding the driver");
        }

    }

    @Then("Enter The  URL")
    public void enterTheURL() {
        try {


            String URL = "https://www.zigwheels.com/";

            driver.get(URL);

        } catch (Exception e) {
            System.out.println("Error in the URL");
        }


    }

    @When("Page is Loaded")
    public void pageIsLoaded() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Thread.sleep(5000);


    }

    @And("Check the URL")
    public void checkTheURL() {
        try {
            String FoundTitle = driver.getTitle();

            Assert.assertEquals(FoundTitle,"ZigWheels - New Cars, Used Cars, Bikes Prices, News, Reviews, Forum");


        } catch (Exception e) {
            System.out.println("Error in the Check the URL");
        }
    }


    @Given("The page")
    public void thePage() {
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

    }

    @Then("Move to new Bike")
    public void moveToNewBike() {
        try {
            Thread.sleep(10000);
            Actions actions = new Actions(driver);

            WebElement new_bike = driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/div/nav/div[2]/ul/li[3]/a"));

            actions.moveToElement(new_bike).perform();

            System.out.println("New bike execution");


        } catch (Exception e) {
            System.out.println("Error in New Bike Action");
        }
    }

    @And("click on the Upcoming bikes from the list")
    public void clickOnTheUpcomingBikesFromTheList() {
        try {

            WebElement dropdown = driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/div/nav/div[2]/ul/li[3]"));
            List<WebElement> list = dropdown.findElements(By.tagName("li"));
            String sortby = "Upcoming Bikes";
            for (WebElement webElement : list) {
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

    @Then("Select The manufacturer as honda")
    public void selectTheManufacturerAsHonda() {
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

    @When("Results are displayed")
    public void resultsAreDisplayed() {
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


        WebElement models = driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div[1]/div[2]/ul"));
        Details = models.findElements(By.tagName("li"));


    }

    @Then("Store all the details")
    public void storeAllTheDetails() {

        try{
            for(int i=0;i<Details.size();i++) {


                int price = Integer.parseInt(Details.get(i).getAttribute("data-price"));
                if (i == 6 || i == 15) {
                    continue;
                }
                else {
                    if (price <= 400000) {
                        System.out.println("Yes price is less than 4 lakhs " + price);
                    } else {
                        System.out.println("price is going high " + price);
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("Error in the Store all the Details function");
        }

    }

    @And("Display them All")
    public void displayThemAll() {
        System.out.println("Bike Model\t\tDate Of Launch\t\tPrice");
        try{
            for (int i=0;i<Details.size();i++) {

                if (i == 6 || i == 14) {
                    continue;
                } else {
                    int price = Integer.parseInt(Details.get(i).getAttribute("data-price"));
                    if (price <= 400000) {
                        String model = Details.get(i).getText();
                        String[] m = model.split("\n");

                        System.out.println(m[0] + "\t\t" + Details.get(i).getAttribute("data-explaunch") + "\t\t" + Details.get(i).getAttribute("data-price"));
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("Error in the Store all the Details function");
        }


    }

    @Then("close the Browser")
    public void closeTheBrowser() {
        driver.close();
    }

    @Then("Move to Used Cars")
    public void moveToUsedCars() {
        try {
            Thread.sleep(10000);
            Actions actions = new Actions(driver);


            WebElement new_bike = driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/div/nav/div[2]/ul/li[5]/a"));

            actions.moveToElement(new_bike).perform();

            System.out.println("Successfully moved to used cars button");


        } catch (Exception e) {
            System.out.println("Error in moving to used cars button");
        }


    }

    @And("Select the city")
    public void selectTheCity() {
        try {

            WebElement dropdown = driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/div/nav/div[2]/ul/li[5]"));
            List<WebElement> list = dropdown.findElements(By.tagName("li"));
            String sortby = "Chennai";
            for (WebElement webElement : list) {
                String searchText = webElement.getText();

                if (searchText.equalsIgnoreCase(sortby)) {
                    webElement.click();
                    break;
                }
            }
            System.out.println("Selected the city");
        } catch (Exception e) {
            System.out.println("Error in selecting the city");
        }

    }

    @Then("Move to the Popular cars")
    public void moveToThePopularCars() {
        try {
            WebElement move_down = driver.findElement(By.xpath("/html/body/div[11]/div/div[1]/div[1]/div[1]/div[2]/ul/li[2]/div[2]/h3"));

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", move_down);
            Thread.sleep(500);


            System.out.println("Successfully scroll down till view");
        } catch (Exception e) {
            System.out.println("Error in scrolling down ");
        }


    }

    @And("Store and Display details")
    public void storeAndDisplayDetails() {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement dropdown = driver.findElement(By.xpath("/html/body/div[11]/div/div[1]/div[1]/div[1]/div[2]/ul/li[2]/div[2]/div[4]/ul"));
        List<WebElement> list = dropdown.findElements(By.tagName("li"));
        System.out.println("List of Popular Used Cars in Chennai");

        for (WebElement webElement : list) {
            System.out.println(webElement.getText());

        }

    }
    @Then("Move to Login Button")
    public void moveToLoginButton() {
        try{
        Actions action=new Actions(driver);
        WebElement element=driver.findElement
                (By.xpath("/html/body/header/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[1]/div"));

        action.moveToElement(element).perform();
        System.out.println("fun passed");
        }

        catch (Exception e){
            System.out.println("fun failed");
        }


    }
    

    @And("Click it")
    public void clickIt() {
        try{
            Actions action=new Actions(driver);
            WebElement element=driver.findElement
                    (By.xpath("/html/body/div[21]/div/div/div/div/div[3]/div[2]"));
            Thread.sleep(5000);

            element.click();
            System.out.println("fun passed2");
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        }

        catch (Exception e){
            System.out.println("fun failed");
        }
        
    }




    @Then("Click on continue with google")
    public void clickOnContinueWithGoogle() {
        try {
            Actions actions = new Actions(driver);
            Set<String> handler = driver.getWindowHandles();
            Iterator<String> it = handler.iterator();
            String Parent_window_id = it.next();
            System.out.println(Parent_window_id);
            String Child_window_id = it.next();
            System.out.println(Child_window_id);
            Thread.sleep(5000);
            driver.switchTo().window(Child_window_id);
            Thread.sleep(5000);
            WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
            actions.moveToElement(element);
            Thread.sleep(5000);
            String email = "rman.com";
            element.sendKeys(email);
            Thread.sleep(5000);

        }
        catch (Exception e){
            System.out.println("Cannot send the values");
        }
        
    }

    @And("Give Invalid Credentials")
    public void giveInvalidCredentials() throws InterruptedException {
        try {
            Actions actions = new Actions(driver);
            WebElement next_click = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[1]"));
            actions.moveToElement(next_click).perform();
            Thread.sleep(5000);

            actions.click().perform();
            System.out.println("clicking next passed");
        }
        catch (Exception e){
            System.out.println("Error in clicking next\n"+e);
        }

        
    }

    @Then("Capture the Invalid Message")
    public void captureTheInvalidMessage() throws InterruptedException, IOException {
        Actions actions = new Actions(driver);
        try {

            Thread.sleep(5000);
            WebElement element = driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/div[1]"));
            actions.moveToElement(element).perform();
            Thread.sleep(5000);
            actions.click().perform();
            System.out.println("Clicked Try again button\n");
        }
        catch (Exception e){
            System.out.println("Error in clicking Try again button\n"+e);

        }
        try {


            Thread.sleep(5000);
            WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
            actions.moveToElement(element);
            Thread.sleep(5000);
            String email = "rman.com";
            element.sendKeys(email);
            Thread.sleep(5000);
            System.out.println("Email Entered");
        }catch (Exception e){
            System.out.println("Error in Entering the email\n"+e);
        }
        try {

            WebElement next_click = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[1]"));
            actions.moveToElement(next_click).perform();
            Thread.sleep(5000);

            actions.click().perform();
            System.out.println("clicking next passed");

        }
        catch (Exception e){
            System.out.println("Error in clicking next\n"+e);
        }


        Thread.sleep(5000);
        this.takeSnapShot(driver, "C:\\Users\\hp\\IdeaProjects\\Final\\Images//test1.png") ;
    }

    private void takeSnapShot(WebDriver webdriver, String fileWithPath) throws IOException {
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
        File DestFile=new File(fileWithPath);
//Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);

    }

    @Then("Screenshot capture")
    public void screenshotCapture() {


    }
}

