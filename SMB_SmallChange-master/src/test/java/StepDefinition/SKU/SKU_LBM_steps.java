package StepDefinition.SKU;

import PageFactory.AF_Journey.LoginPage;
import PageFactory.PromoLBM_SME.ProfileLogin;
import PageFactory.PromoLBM_SME.SearchProfile;
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

public class SKU_LBM_steps {

    WebDriver driver;

    @Given("User is on sales force home page on web")
    public void user_is_on_sales_force_home_page_on_web() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test.salesforce.com/");
    }

    LoginPage LP;
    @When("user enter Username {string} and password {string} and click enter button and home page is displayed")
    public void user_enter_username_and_password_and_click_enter_button_and_home_page_is_displayed(String string, String string2) {
        LP= new LoginPage(driver);
        LP.Login_page();
    }

    SearchProfile SP;
    @Then("User navigates to search box and search for ben myres LBM and click on search button")
    public void user_navigates_to_search_box_and_search_for_ben_myres_lbm_and_click_on_search_button() {
        SP= new SearchProfile(driver);
        SP.search_profile();
    }

    ProfileLogin PL;
    @Then("User logins to the Ben Myres LBM profile")
    public void user_logins_to_the_ben_myres_lbm_profile() {
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
        PL= new ProfileLogin(driver);
        PL.profile_login();
    }

    SkuSearch SS;
    @Then("user search for sales rep {string} and click search button")
    public void user_search_for_sales_rep_and_click_search_button(String str) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("SKU code is : "+str);
        SS= new SkuSearch(driver);
        SS.sku_search_LBM();
    }

    ProductPage PP;
    @Then("user click on {string} product")
    public void user_click_on_product(String str) {
        System.out.println("Commercial product is : "+str);
        PP = new ProductPage(driver);
        PP.product_page(str);
    }

    productDetails PD;
    @Then("user can see the product details")
    public void user_can_see_the_product_details() {
        PD= new productDetails(driver);
        PD.product_details();
    }



}
