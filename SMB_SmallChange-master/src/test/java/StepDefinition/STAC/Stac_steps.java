package StepDefinition.STAC;

import PageFactory.AF_Journey.LoginPage;
import PageFactory.PAC_STAC_SimSwap.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Stac_steps {

    WebDriver driver;

    @Given("USer is on sales force home page on web {string}")
    public void u_ser_is_on_sales_force_home_page_on_web(String string) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://test.salesforce.com/");
    }

    LoginPage LP;
    @When("User enter User Name {string} and password {string} and click enter button and home page is displayed")
    public void user_enter_user_name_and_password_and_click_enter_button_and_home_page_is_displayed(String string, String string2) {
        LP= new LoginPage(driver);
        LP.Login_page();
    }


    @Then("User click on contacts button")
    public void user_click_on_contacts_button() {
        driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a")).click();
    }

    Contact contact;
    @Then("user clicks on the contact name")
    public void user_clicks_on_the_contact_name() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
                driver.switchTo().window(child_window);}
        contact= new Contact(driver);
        contact.contact_page();
    }

    ExternalUser EU;
    @Then("User click on manage External user and then click login to the portal as a user")
    public void user_click_on_manage_external_user_and_then_click_login_to_the_portal_as_a_user() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
                driver.switchTo().window(child_window);}
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        EU= new ExternalUser(driver);
        EU.external_user();
    }


    @Then("User modifies the url of the page and clicks enter")
    public void user_modifies_the_url_of_the_page_and_clicks_enter() {
        driver.navigate().to("https://o2uk--csupreprod.my.salesforce.com/apex/smbhome");
    }

    MyO2homepage MH;
    @Then("User is navigated to My O2 business page and hovers on manage contracts and clicks on Thinking of switching from O2? \\({int} to {int} numbers)")
    public void user_is_navigated_to_my_o2_business_page_and_hovers_on_manage_contracts_and_clicks_on_thinking_of_switching_from_o2_to_numbers(Integer int1, Integer int2) {
        MH= new MyO2homepage(driver);
        MH.Myo2_homepage();
    }


    @Then("User is navigated to the search page and clicks on search")
    public void user_is_navigated_to_the_search_page_and_clicks_on_search() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"smbSearchPortPageId:MyO2Template:subscriptionSelection:idSubmitSearch\"]")).click();
    }

    MPNpage MP;
    @Then("User can see the multiple MPN and selects the MPN and clicks on continue")
    public void user_can_see_the_multiple_mpn_and_selects_the_mpn_and_clicks_on_continue() throws InterruptedException {
        MP= new MPNpage(driver);
        MP.MPN_page();
    }

    SelectSTAC sSTAC;
    @Then("user checks the stac checkbox and clicks on review your request")
    public void user_checks_the_stac_checkbox_and_clicks_on_review_your_request() {
        sSTAC = new SelectSTAC(driver);
        sSTAC.select_stac();
    }
    @Then("user is navigated to submit page and submits the request")
    public void user_is_navigated_to_submit_page_and_submits_the_request() {
        driver.findElement(By.xpath("//span[@id='portChngId:MyO2Template:thePortForm:theSubmitstatictext']")).click();
    }

    ServiceRequestNumber SRN;
    @Then("user copies the service request number")
    public void user_copies_the_order_number() {
            SRN = new ServiceRequestNumber(driver);
            SRN.request_number();

    }
}
