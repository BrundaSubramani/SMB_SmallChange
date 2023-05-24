package StepDefinition.Promo_LBM_SME;

import PageFactory.AF_Journey.LoginPage;
import PageFactory.PromoLBM_SME.OpportunityTab;
import PageFactory.PromoLBM_SME.ProductBasketPage;
import PageFactory.PromoLBM_SME.SMEProfileLogin;
import PageFactory.PromoLBM_SME.SMEprofilesearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class PromoSME_steps {

    WebDriver driver;

    @Given("useR is on sales force home page on web")
    public void use_r_is_on_sales_force_home_page_on_web() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test.salesforce.com/");
    }

    LoginPage LP;
    @When("useR enter User Name {string} and password {string} and click enter button and home page is displayed")
    public void use_r_enter_user_name_and_password_and_click_enter_button_and_home_page_is_displayed(String string, String string2) {
        LP= new LoginPage(driver);
        LP.Login_page();
    }

    SMEprofilesearch sme;
    @Then("User navigates to search box and search for ben myres SME and click on search button")
    public void user_navigates_to_search_box_and_search_for_ben_myres_sme_and_click_on_search_button() {
        sme= new SMEprofilesearch(driver);
        sme.SMEsearch_profile();

    }

    SMEProfileLogin smelog;
    @Then("User logins to the Ben Myres SME profile")
    public void user_logins_to_the_ben_myres_sme_profile() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
                driver.switchTo().window(child_window);}
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        smelog= new SMEProfileLogin(driver);
        smelog.smeprofile_login();
    }

    OpportunityTab OT;
    @Then("User navigates to opportunity tab and creates the new opportunity with the following details {string} {string} {string} {string} {string}")
    public void user_navigates_to_opportunity_tab_and_creates_the_new_opportunity_with_the_following_details(String string, String string2, String string3, String string4, String string5) {
        OT= new OpportunityTab(driver);
        OT.opty_tab();
    }

    ProductBasketPage PDpage;
    @Then("user creates the product basket to add SMB Digital Products")
    public void user_creates_the_product_basket_to_add_smb_digital_products() throws InterruptedException {
        PDpage= new ProductBasketPage(driver);
        PDpage.productbasket_page();
        Thread.sleep(10000);
    }



}
