package StepDefinition.Guru;

import PageFactory.Guru.CallBack;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Guru1_Steps {

    WebDriver driver;

    @Given("Customer is able to launch the business shop for book a call")
    public void customer_is_able_to_launch_the_business_shop_for_book_a_call() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://csupreprod-businessshop.cs88.force.com/O2BusinessShopGuruCallback");
    }

    CallBack call;
    @Then("Customer can view the form and enters {int} {string} {string} {string} {string} {string} and other details")
    public void customer_can_view_the_form_and_enters_tc_tc_tc_tc_tc_and_other_details(Integer Scenario_ID, String app, String firstname, String lastname, String phonenumber, String email) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        call=new CallBack(driver);
        call.enterAllDetails(firstname, lastname, phonenumber, email, app);
    }
    @Then("click on submit button")
    public void click_on_submit_button() {
        call=new CallBack(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        call.clickSubmit();
    }

    public String appointmentNumber;
    @Then("Customer get the appointment number")
    public void customer_get_the_appointment_number() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String number=call.getAppointmentNumber();
        appointmentNumber = (String) number.subSequence(103,111);
        System.out.println(appointmentNumber);
    }

}
