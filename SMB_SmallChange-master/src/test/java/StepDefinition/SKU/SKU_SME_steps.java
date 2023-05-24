package StepDefinition.SKU;

import PageFactory.AF_Journey.LoginPage;
import PageFactory.PromoLBM_SME.SMEProfileLogin;
import PageFactory.PromoLBM_SME.SMEprofilesearch;
import PageFactory.SKU.ProductPage;
import PageFactory.SKU.SkuSearch;
import PageFactory.SKU.productDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class SKU_SME_steps {

    WebDriver driver;

    @Given("User is on salesforce home page on web")
    public void user_is_on_salesforce_home_page_on_web() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test.salesforce.com/");
    }

    LoginPage LP;
    @When("user enter Username {string} and Password {string} and click enter button and home page is displayed")
    public void user_enter_username_and_password_and_click_enter_button_and_home_page_is_displayed(String string, String string2) {
        LP= new LoginPage(driver);
        LP.Login_page();
    }

    SMEprofilesearch sme;
    @Then("User navigates to search box and search for Ben myres SME and click on search button")
    public void user_navigates_to_search_box_and_search_for_ben_myres_sme_and_click_on_search_button() {
        sme= new SMEprofilesearch(driver);
        sme.SMEsearch_profile();
    }

    SMEProfileLogin smelog;
    @Then("User logins to the BenMyres SME profile")
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

    SkuSearch SS;
    @Then("User search for sales rep {string} and clicks search button")
    public void user_search_for_sales_rep_and_clicks_search_button(String str) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("SKU code is : "+str);
        SS= new SkuSearch(driver);
        SS.sku_search_SME();
    }

    ProductPage PP;
    @Then("User clicks on {string} product")
    public void user_clicks_on_product(String str) {
        System.out.println("Commercial product is : "+str);
        PP = new ProductPage(driver);
        PP.product_page(str);
    }

    productDetails PD;
    @Then("user can see the Product details")
    public void user_can_see_the_product_details() {
        PD= new productDetails(driver);
        PD.product_details();
    }

}
