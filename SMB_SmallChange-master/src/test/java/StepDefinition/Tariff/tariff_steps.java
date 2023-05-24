package StepDefinition.Tariff;

import PageFactory.AppJourney.OrderPage;
import PageFactory.Email.ExisitingOrNewCustomerPage;
import PageFactory.Tariff.BusinessAppPage;
import PageFactory.Tariff.ExtrasPage;
import PageFactory.Tariff.SimoPage;
import PageFactory.Tariff.TariffPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class tariff_steps {

    WebDriver driver;

    @Given("customer is on Businessshop home page")
    public void customer_is_on_business_shop_home_page() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://csupreprod-businessshop.cs88.force.com/");
    }

    SimoPage SP;
    @When("Customer hovers on the shop and clicks on SimOnly")
    public void customer_hovers_on_shop_and_clicks_on_sim_only() {
        SP = new SimoPage(driver);
        SP.Simo_page();
    }

    TariffPage TP;
    @Then("Customer is navigated to the Simo page and selects contract term {string} and tariff plan {string}")
    public void customer_is_navigated_to_the_simo_page_and_selects_the_contract_term_and_tariff_plan(String string, String string2) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("scroll(0,300)");
        Thread.sleep(10000);
        TP = new TariffPage(driver);
        TP.tariff_page();
        Thread.sleep(2000);
    }
    @Then("Customer selects  {string}")
    public void customer_selects(String string) {
        driver.findElement(By.id("gen4G")).click();
    }

    ExtrasPage EP;

    @Then("Customer is navigated to extras page and selects required {string} and \"{int}\"and clicks on next button")
    public void customer_is_navigated_to_the_extras_page_and_selects_required_and_and_clicks_on_next_button(String string, Integer int1) throws InterruptedException {
        EP = new ExtrasPage(driver);
        EP.ClickonSpendCap();
        Thread.sleep(5000);
        EP.ClickonCapAmt();
        Thread.sleep(5000);
        EP.ClickonCont();
        Thread.sleep(5000);
        EP.ClickonBolton();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        Thread.sleep(5000);
        EP.ClickonNextbutton();
    }

    BusinessAppPage BAP;
    @Then("Customer is navigated to business apps page and selects business app and clicks on next button")
    public void customer_is_navigated_to_business_apps_page_and_select_the_business_app_and_clicks_on_next_button() throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        BAP = new BusinessAppPage(driver);
        BAP.select_businessapp();
        Thread.sleep(3000);
        BAP.clickNext();
    }

    @Then("customer lands on Review basket page and clicks on proceed  button")
    public void customer_lands_on_review_basket_page_and_clicks_on_proceed_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("(//*[@class='blueButtonGlobal blueLight proceed-checkout'])[2]")).click();
    }

    ExisitingOrNewCustomerPage ENP;
    OrderPage OP;

    @Then("Customer fills the form and can see the Order number")
    public void customer_fills_the_form_and_can_see_the_order_number() throws InterruptedException {
        ENP= new ExisitingOrNewCustomerPage(driver);
        ENP.existClick();
        OP = new OrderPage(driver);
        OP.enterDetails();
        OP.clickCheckBox();
        OP.clickOrderButton();
        String str = driver.findElement(By.xpath("//*[@id=\"containerId\"]/div/div")).getText();
        System.out.println(str);
    }

}
