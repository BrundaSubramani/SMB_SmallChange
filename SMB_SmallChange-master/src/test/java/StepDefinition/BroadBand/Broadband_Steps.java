package StepDefinition.BroadBand;

import PageFactory.AppJourney.ProceedtoOrder;
import PageFactory.BBAndLL.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Broadband_Steps {

    WebDriver driver;

    @Given("Customer is able to launch the business shop")
    public void customer_is_able_to_launch_the_business_shop() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://csupreprod-businessshop.cs88.force.com/");
    }

    Shophomepage click;
    @When("Customer hover on shop and click on Broadband")
    public void customer_hover_on_shop_and_click_on_broadband() {
        click=new Shophomepage(driver);
        click.hoverAndClick_bb();
    }

    CheckAvailability check;
    @Then("customer enters the {string} {string} {string}")
    public void customer_enters_the(String postcode, String fixedline, String o2mobilenumber) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        check=new CheckAvailability(driver);
        check.enterdetails(postcode,fixedline,o2mobilenumber);
    }


    @Then("Customer clicks the  check button")
    public void customer_clicks_the_check_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        check.clickCheck();
    }

    SelectPlan SP;
    @Then("Customer chooses the {int} {string} for broadband and clicks on buynow button")
    public void customer_chooses_the_for_broadband_and_clicks_on_buynow_button(Integer Scenario_ID, String plan) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        SP= new SelectPlan(driver);
        if(Scenario_ID==1)
        {
            System.out.println(plan);
            SP.Select_BBconnect();
        } else if (Scenario_ID==2)
        {
            System.out.println(plan);
            SP.select_bbfibre();
        }
        else
        {
            System.out.println(plan);
            SP.select_bbfastfibre();
        }

    }

    ContinuePage cont;
    @Then("Customer clicks on continue button")
    public void customer_clicks_on_continue_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        cont=new ContinuePage(driver);
        cont.clickContinue_1();
    }

    OnSiteContact contact;
    @Then("Customer enters the {string} {string} {string} and installation address")
    public void customer_enters_the_and_installation_address(String fname, String lname, String mpn) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        contact=new OnSiteContact(driver);
        contact.fillform(fname, lname, mpn);
    }

    ProceedtoOrder PTO;
    @Then("Customer can see the basket page and click on proceed button.")
    public void customer_can_see_the_basket_page_and_click_on_proceed_button() {
        PTO=new ProceedtoOrder(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        PTO.clickProceedToOrder();
    }

    NewOrExist exist;
    @Then("customer click on Existing customer button")
    public void customer_click_on_existing_customer_button() {
        exist=new NewOrExist(driver);
        exist.existClick();
    }

    OrderPage_bb OP;
    @Then("Customer fill the details like {string} {string} {string} {string} {string} {string} and click on order button")
    public void customer_fill_the_details_like_and_click_on_order_button(String firstname, String lastname, String Businessname, String O2ContactNumber,  String NoOfEmployees, String Email) {
        OP = new OrderPage_bb(driver);
        OP.enterDetails(firstname, lastname, Businessname, O2ContactNumber, NoOfEmployees, Email);
        OP.clickCheckBox();
        OP.clickOrderButton();
    }
    @Then("customer is able to see the Order number")
    public void customer_is_able_to_see_the_order_number() {
        System.out.println(driver.findElement(By.xpath("//*[@id=\"orderID\"]")).getText());
    }

}
