package StepDefinition.CFJourney;

import PageFactory.CFJourney.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CF_Device_phone {

    WebDriver driver;

    @Given("user is on online business home page")
    public void user_is_on_online_business_home_page() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://csupreprod-businessshop.cs88.force.com/");
    }

    PreprodHomePage homepage;
    FilterIphoneProducts FIP;
    @When("user hover over shop and clicks on All phones icon and filters iphone products")
    public void user_hover_over_shop_and_clicks_on_all_phones_icon() {
        homepage = new PreprodHomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homepage.hoverAndClick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        FIP= new FilterIphoneProducts(driver);
        FIP.business_page();

    }

    BusinessMobilePhonePage BMPage;
    @Then("user is navigated to Business Mobile Phones webpage and selects {int} {string}")
    public void user_is_navigated_to_business_mobile_phones_webpage_and_selects(Integer Scenario_ID, String DevName) throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,600)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        BMPage = new BusinessMobilePhonePage(driver);
        if (Scenario_ID==1)
        {
            System.out.println(DevName);
            BMPage.select_iphone12promax();
        } else if (Scenario_ID==2)
        {
            System.out.println(DevName);
            BMPage.select_iphone13promax();
        } else if (Scenario_ID==3)
        {
            System.out.println(DevName);
            BMPage.select_iphone13pro();
        }
        else if (Scenario_ID==4)
        {
            System.out.println(DevName);
            BMPage.select_iphone12_5G();
        }
        else
        {
            System.out.println(DevName);
            BMPage.select_iphone13();
        }


    }

    MobileDescriptionPage MDP;
    @Then("user is navigated to phone description page and selects {int} {string} and clicks on view all tarrifs")
    public void user_is_navigated_to_phone_description_page_and_selects_and_clicks_on_view_all_tarrifs(Integer Scenario_ID, String memory) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,400)");
        MDP= new MobileDescriptionPage(driver);
        if (Scenario_ID==1)
        {
            MDP.iphone12promax_memory();

        } else if (Scenario_ID==2)
        {
            MDP.iphone13promax_memory();
        } else if (Scenario_ID==3)
        {
            MDP.iphone13pro_memory();
        }
        else if (Scenario_ID==4)
        {
            MDP.iphone12_5g_memory();
        }
        else
        {
            MDP.iphone13_memory();
        }

    }
    TarrifAndExtrasPage TEP;
    @Then("user is navigated to tarrifs and extras page and select the required {string} {string}")
    public void user_is_navigated_to_tarrifs_and_extras_page_and_select_the_required(String Tariff, String plan) {
        TEP = new TarrifAndExtrasPage(driver);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,300)", "");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        TEP.clickOnSelectButton();
    }
    @Then("user select Bolt ons and clicks on Go to basket button")
    public void user_select_bolt_ons_and_clicks_on_go_to_basket_button() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,600)", "");
        TEP.clickGoToBasketButton();
    }

    YourBasketPage YBP;
    @Then("user is on review your basket page and clicks on proceed to order button")
    public void user_is_on_review_your_basket_page_and_clicks_on_proceed_to_order_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        YBP = new YourBasketPage(driver);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,600)", "");
        YBP.proceedToOderClick();
    }
    ExisitingOrNewCustomerPage EONCP;
    @Then("user clicks on existing cutomer")
    public void user_clicks_on_existing_cutomer() throws InterruptedException {
        EONCP = new ExisitingOrNewCustomerPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        EONCP.existClick();
    }
    OrderPage OP;
    @Then("user navigated to order page and enter the details")
    public void user_navigated_to_order_page_and_enter_the_details() {
        OP = new OrderPage(driver);
        OP.enterDetails();
    }
    @Then("user selects upgrading or adding and clicks on the checkbox")
    public void user_selects_upgrading_or_adding_and_clicks_on_the_checkbox() throws InterruptedException {
        OP.clickCheckBox();
        Thread.sleep(3000);
    }

    @Then("clicks the order button and get the order number")
    public void clicks_the_order_button_and_get_the_order_number() throws InterruptedException {
        Thread.sleep(3000);
        OP.clickOrderButton();
        String str = driver.findElement(By.xpath("//*[@id=\"containerId\"]/div/div")).getText();
        System.out.println(str);
    }

}
