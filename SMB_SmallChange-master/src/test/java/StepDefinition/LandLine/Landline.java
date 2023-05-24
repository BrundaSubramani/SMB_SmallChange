package StepDefinition.LandLine;


import PageFactory.BBAndLL.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Landline {
    WebDriver driver;
    Shophomepage click;
        @Given("Customer is able to launch the businessshop and select the Landline")
        public void customer_is_able_to_launch_the_businessshop_and_select_the_landline() {
            System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
            driver = new ChromeDriver();
            //driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.get("https://csupreprod-businessshop.cs88.force.com/");
            click=new Shophomepage(driver);
            click.hoverAndClick_ll();
        }

        plan_check checkNow;
        @Then("customer check the Availability and then click check now button")
        public void customer_check_the_availability_and_then_click_check_now_button() {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            checkNow=new plan_check(driver);
            checkNow.check_now();
        }

        CheckAvailability enterAndContinue;
        @Then("customer enter  {string} and {string}")
        public void customer_enter_and(String lpn, String pcode) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            enterAndContinue=new CheckAvailability(driver);
            enterAndContinue.sendData(lpn, pcode);
        }

        ContinuePage continueButton;
        @Then("Customer clicks the  continue button")
        public void customer_clicks_the_continue_button() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            continueButton=new ContinuePage(driver);
            Thread.sleep(10000);
            continueButton.clickContinue_1();
            Thread.sleep(10000);
            continueButton.clickContinue_2();
        }

        OnSiteContact Form;
        @Then("Customer enters the {string} {string} {string} and {string}")
        public void customerEntersTheAnd(String fname, String lname, String mpn, String postcode)throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            Form=new OnSiteContact(driver);
            Form.fillform_ll(fname, lname, mpn, postcode);
        }
        ProceedToOrder clickPTO;
        @Then("Customer see the basket page and click on proceed button.")
        public void customer_see_the_basket_page_and_click_on_proceed_button() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            clickPTO=new ProceedToOrder(driver);
            Thread.sleep(10000);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            clickPTO.proceed_order();
        }

        NewOrExist exist;
        @Then("customer click on New customer button")
        public void customer_click_on_new_customer_button() {
            exist=new NewOrExist(driver);
            exist.existClick();
        }

    OrderPage_ll OP;
    @Then("Customer fill  the details {string} {string}  {string}  and click on order button")
    public void customerFillTheDetailsAndClickOnOrderButton(String firstname, String lastname, String o2ContactNumber) {
        OP = new OrderPage_ll(driver);
        OP.enterDetails(firstname, lastname,  o2ContactNumber);
        OP.clickCheckBox();
        OP.clickOrderButton();
        }

        @Then("customer is able to see the Order No.")
        public void customer_is_able_to_see_the_order_no() {
            System.out.println(driver.findElement(By.xpath("//*[@id=\"orderID\"]")).getText());
        }



}

