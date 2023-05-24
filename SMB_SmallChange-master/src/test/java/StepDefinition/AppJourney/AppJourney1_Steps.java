package StepDefinition.AppJourney;

import PageFactory.AppJourney.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AppJourney1_Steps {


    WebDriver driver;

    @Given("Customer is able to launch the online shop")
    public void customer_is_able_to_launch_the_online_shop() {
        //System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browser_Chrome/chromedriver.exe");
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        ChromeDriver driver =new ChromeDriver(opt);
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://csupreprod-businessshop.cs88.force.com/");
    }

    SelectApp app;
    @Then("Customer selects the {string} {string}")
    public void customer_selects_the(String Scenario_ID, String App) {
        app=new SelectApp(driver);
        app.hoverAndClick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        app.select_particular_app();
    }


    QuantityAndChoose ChooseClick;
    @Then("Customer can choose the {string} and click on chose button")
    public void customer_can_choose_the_and_click_on_chose_button(String qty) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        ChooseClick=new QuantityAndChoose(driver);
        ChooseClick.clickOnChoose(qty);
    }

    ProceedtoOrder pto;
    @Then("Customer lands on review basket page and clicks on proceed to order button")
    public void customer_lands_on_review_basket_page_and_clicks_on_proceed_to_order_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pto=new ProceedtoOrder(driver);
        pto.clickProceedToOrder();

    }


    NewOrExist_app exist;
    @Then("customer click Existing customer button")
    public void customer_click_existing_customer_button() {
        exist=new NewOrExist_app(driver);
        exist.existClick();
    }

    OrderPage OP;
    @Then("customer fills all the details in the form")
    public void customer_fills_all_the_details_in_the_form() {
        OP = new OrderPage(driver);
        OP.enterDetails();
        OP.clickCheckBox();

    }

    @Then("Customer click on order button")
    public void customer_click_on_order_button() throws InterruptedException {
        Thread.sleep(3000);
        OP.clickOrderButton();
        String str = driver.findElement(By.xpath("//*[@id=\"containerId\"]/div/div")).getText();
        System.out.println(str);

    }


}
