package StepDefinition.Filter;

import PageFactory.CFJourney.*;
import PageFactory.Filter.MobDescriptionpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Filter_Steps {

    WebDriver driver;

    @Given("Customer is on online business home page")
    public void user_is_on_online_business_home_page() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://csupreprod-businessshop.cs88.force.com/");
    }

    PreprodHomePage homepage;
    FilterIphoneProducts FIP;
    @When("Customer hover over shop and clicks on All phones icon and filters iphone products")
    public void user_hover_over_shop_and_clicks_on_all_phones_icon() {
        homepage = new PreprodHomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homepage.hoverAndClick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        FIP= new FilterIphoneProducts(driver);
        FIP.business_page();

    }

    BusinessMobilePhonePage BMPage;
    @Then("Customer is navigated to Business Mobile Phones webpage and selects {int} {string}")
    public void user_is_navigated_to_business_mobile_phones_webpage_and_selects(Integer Scenario_ID, String DevName) throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,600)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        BMPage = new BusinessMobilePhonePage(driver);
        BMPage.select_iphone12promax();

    }

    MobDescriptionpage MDP;
    @Then("Customer is navigated to phone description page and selects {int} {int} and clicks on view all tarrifs")
    public void user_is_navigated_to_phone_description_page_and_selects_and_clicks_on_view_all_tarrifs(Integer Scenario_ID, Integer memory) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,400)");
        MDP= new MobDescriptionpage(driver);
        if(memory==128)
        {
            System.out.println("iphone 12 pro Max 5G- 128GB");
            MDP.select_128gb();
        } else if (memory==256) {
            System.out.println("iphone 12 pro Max 5G- 256GB");
            MDP.select_256gb();
        } else if (memory==512) {
            System.out.println("iphone 12 pro Max 5G- 256GB");
            MDP.select_512gb();
        }


    }
    TarrifAndExtrasPage TEP;
    @Then("Customer is navigated to tarrifs and extras page and select the required {string} {string}")
    public void user_is_navigated_to_tarrifs_and_extras_page_and_select_the_required(String Tariff, String plan) {
        TEP = new TarrifAndExtrasPage(driver);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,300)", "");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        TEP.clickOnSelectButton();
    }
    @Then("Customer select Bolt ons and clicks on Go to basket button")
    public void user_select_bolt_ons_and_clicks_on_go_to_basket_button() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,600)", "");
        TEP.clickGoToBasketButton();
    }

    YourBasketPage YBP;
    @Then("Customer is on review your basket page and clicks on proceed to order button")
    public void user_is_on_review_your_basket_page_and_clicks_on_proceed_to_order_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        YBP = new YourBasketPage(driver);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,600)", "");
        YBP.proceedToOderClick();
    }
    ExisitingOrNewCustomerPage EONCP;
    @Then("Customer clicks on existing cutomer")
    public void user_clicks_on_existing_cutomer() throws InterruptedException {
        EONCP = new ExisitingOrNewCustomerPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        EONCP.existClick();
    }
    OrderPage OP;
    @Then("Customer navigated to order page and enter the details")
    public void user_navigated_to_order_page_and_enter_the_details() {
        OP = new OrderPage(driver);
        OP.enterDetails();
    }
    @Then("Customer selects upgrading or adding and clicks on the checkbox")
    public void user_selects_upgrading_or_adding_and_clicks_on_the_checkbox() throws InterruptedException {
        OP.clickCheckBox();
        Thread.sleep(3000);
    }

    @Then("Customer clicks the order button and get the order number")
    public void clicks_the_order_button_and_get_the_order_number() throws InterruptedException {
        Thread.sleep(3000);
        OP.clickOrderButton();
        String str = driver.findElement(By.xpath("//*[@id=\"containerId\"]/div/div")).getText();
        System.out.println(str);
    }

}
