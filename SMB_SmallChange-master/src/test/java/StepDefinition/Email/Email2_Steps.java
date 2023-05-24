package StepDefinition.Email;

import PageFactory.AppJourney.OrderPage;
import PageFactory.Email.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Email2_Steps {

    WebDriver driver;

    @Given("Customer is on business shop homepage")
    public void customer_is_on_business_shop_home_page() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://csupreprod-businessshop.cs88.force.com/");
    }

    SimoPage SP;
    @When("Customer hovers on shop and clicks on Sim Only")
    public void customer_hovers_on_shop_and_clicks_on_sim_only() {
        SP = new SimoPage(driver);
        SP.Simo_page();
    }

    Contractterm CT;
    @Then("Customer is navigated to the Simo page and selects the {int}")
    public void customer_is_navigated_to_the_simo_page_and_selects_the(Integer SimoContractTerm) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        Thread.sleep(15000);
        CT= new Contractterm(driver);
        CT.select_12months();

    }

    TariffPage_12months TP;
    @Then("Customer clicks on the {int} {string} and clicks on continue")
    public void customer_clicks_on_the_and_clicks_on_continue(Integer Serialno, String SimoTariff) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        Thread.sleep(15000);
        TP= new TariffPage_12months(driver);
        if(Serialno==1)
        {
            System.out.println("Tariff plan is 6GB");
            TP.select_6GB();
        } else if (Serialno==2) {
            System.out.println("Tariff plan is 1GB");
            TP.select_1GB();
        } else if (Serialno==3) {
            System.out.println("Tariff plan is 20GB");
            TP.select_20GB();
        } else if (Serialno==4) {
            System.out.println("Tariff plan is 50GB");
            TP.select_50GB();
        } else if (Serialno==5) {
            System.out.println("Tariff plan is Unlimited");
            TP.select_unlimited();
        } else if (Serialno==6) {
            System.out.println("Tariff plan is 2GB");
            TP.select_2GB();
        } else if (Serialno==7) {
            System.out.println("Tariff plan is 10GB");
            TP.select_10GB();
        } else if (Serialno==8) {
            System.out.println("Tariff plan is 30GB");
            TP.select_30GB();
        } else {
            System.out.println("Tariff plan is 300GB");
            TP.select_300GB();
        }

    }
    @Then("Customer clicks on FourG or FiveG Simo {string}")
    public void customer_clicks_on_four_g_or_five_g_simo(String string) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"gen5G\"]")).click();
    }

    ExtrasPage EP;
    @Then("Customer is navigated to the extras page and selects spend cap {string} {int} and clicks on next button")
    public void customer_is_navigated_to_the_extras_page_and_selects_spend_cap_and_clicks_on_next_button(String SIMOSpendCapSelect, Integer SIMOSpendCapValue) throws InterruptedException {
        EP = new ExtrasPage(driver);
        EP.ClickonSpendCap();
        Thread.sleep(2000);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        Thread.sleep(2000);
        EP.ClickonNextbutton();
    }

    BusinessAppPage BAP;
    @Then("Customer is navigated to business apps page and select the business app and clicks on next button")
    public void customer_is_navigated_to_business_apps_page_and_select_the_business_app_and_clicks_on_next_button() throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        BAP = new BusinessAppPage(driver);
        BAP.select_businessapp();
        Thread.sleep(5000);
        BAP.clickNext();
    }

    ProceedToOrder order;
    @Then("Customer lands on review basket page and clicks on proceed button")
    public void customer_lands_on_review_basket_page_and_clicks_on_proceed_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        order=new ProceedToOrder(driver);
        order.proceedToOderClick();
    }

    ExisitingOrNewCustomerPage exist;
    @Then("Customer selects either new or existing customer button")
    public void customer_selects_either_new_or_existing_customer_button() throws InterruptedException {
        exist=new ExisitingOrNewCustomerPage(driver);
        exist.existClick();
    }

    PageFactory.AppJourney.OrderPage OP;
    @Then("Customer enter all details {string}")
    public void customer_enter_all_details(String email) {
        OP = new OrderPage(driver);
        OP.enterDetails();
        OP.clickCheckBox();

    }
    @Then("Customer click on order button and get the order number for sim")
    public void customer_click_on_order_button_and_get_the_order_number_for_sim() {
        OP.clickOrderButton();
        String str = driver.findElement(By.xpath("//*[@id=\"containerId\"]/div/div")).getText();
        System.out.println(str);
    }


}
