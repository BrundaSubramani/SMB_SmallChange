package StepDefinition.SimSwap;


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

public class Simswap_steps {

    WebDriver driver;

    @Given("USER is on sales force home page on web {string}")
    public void user_is_on_sales_force_home_page_on_web(String string) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test.salesforce.com/");
    }

    LoginPage LP;
    @When("USER enter User Name {string} and password {string} and click enter button and home page is displayed")
    public void user_enter_user_name_and_password_and_click_enter_button_and_home_page_is_displayed(String string, String string2) {
        LP= new LoginPage(driver);
        LP.Login_page();
    }


    @Then("user click on contacts button")
    public void user_click_on_contacts_button() {
        driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a")).click();
    }

    Contact contact;
    @Then("clicks on the contact name")
    public void clicks_on_the_contact_name() {
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
    @Then("user click on manage External user and then click login to the portal as a user")
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


    @Then("USer modifies the url of the page and clicks enter")
    public void u_ser_modifies_the_url_of_the_page_and_clicks_enter() {
        driver.navigate().to("https://o2uk--csupreprod.my.salesforce.com/apex/smbhome");
    }

    ManagedevicesSimswap sim;

    @Then("user navigates to MyO2 business page and hovers on manage devices and clicks on Sim swap")
    public void user_navigates_to_my_o2_business_page_and_hovers_on_manage_devices_and_clicks_on_sim_swap() {
       sim= new ManagedevicesSimswap(driver);
       sim.manage_simswap();
    }
    @Then("USer is navigated to the search page and clicks on search")
    public void u_ser_is_navigated_to_the_search_page_and_clicks_on_search() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"smbSearchPageId:MyO2Template:subscriptionSelection:idSubmitSearch\"]")).click();
    }

    SimsawpMPNPage mpnpage;

    @Then("USer can see the multiple MPN and selects the MPN and clicks on continue")
    public void u_ser_can_see_the_multiple_mpn_and_selects_the_mpn_and_clicks_on_continue() {
        mpnpage= new SimsawpMPNPage(driver);
        mpnpage.sim_MPN();
    }

    NewSimnumberpage simpage;
    @Then("user providesd the unique sim number and clicks on continue")
    public void user_providesd_the_unique_sim_number_and_clicks_on_continue() {
        simpage= new NewSimnumberpage(driver);
        simpage.newsim_page();
    }
    @Then("User is navigated to the security check page and selects the phone number from the dropdown")
    public void user_is_navigated_to_the_security_check_page_and_selects_the_phone_number_from_the_dropdown() {

    }
    @Then("User clicks on send code")
    public void user_clicks_on_send_code() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User opens a new tab and enters receive sms online and clicks on search")
    public void user_opens_a_new_tab_and_enters_receive_sms_online_and_clicks_on_search() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User opens the webpage and search for the specific MPN")
    public void user_opens_the_webpage_and_search_for_the_specific_mpn() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User copies the OTP and paste it in the enter you code text box and clicks on verify")
    public void user_copies_the_otp_and_paste_it_in_the_enter_you_code_text_box_and_clicks_on_verify() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
