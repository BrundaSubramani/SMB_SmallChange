package StepDefinition.Promo_LBM_SME;

import PageFactory.AF_Journey.LoginPage;
import PageFactory.PromoLBM_SME.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class PromoLBM_steps {

    WebDriver driver;

    @Given("user is on sales force home page on web")
    public void user_is_on_sales_force_home_page_on_web() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test.salesforce.com/");
    }

    LoginPage LP;
    @When("user enter User Name {string} and password {string} and click enter button and home page is displayed")
    public void user_enter_user_name_and_password_and_click_enter_button_and_home_page_is_displayed(String string, String string2) {
        LP= new LoginPage(driver);
        LP.Login_page();
    }

    SearchProfile SP;

    @Then("user navigates to search box and search for ben myres LBM and click on search button")
    public void user_navigates_to_search_box_and_search_for_ben_myres_lbm_and_click_on_search_button() {
        SP= new SearchProfile(driver);
        SP.search_profile();
    }

    ProfileLogin PL;
    @Then("user logins to the Ben Myres LBM profile")
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

    OpportunityTab OT;
    @Then("user navigates to opportunity tab and creates the new opportunity with the following details {string} {string} {string} {string} {string}")
    public void user_navigates_to_opportunity_tab_and_creates_the_new_opportunity_with_the_following_details(String string, String string2, String string3, String string4, String string5) {
        OT= new OpportunityTab(driver);
        OT.opty_tab();
    }

    ProductBasketPage PDpage;

    @Then("User creates the product basket to add SMB Digital Products")
    public void user_creates_the_product_basket_to_add_smb_digital_products() throws InterruptedException {
        PDpage= new ProductBasketPage(driver);
        PDpage.productbasket_page();
    }

    ConfigurePage CF;

    @Then("User configures all SMB Digital products in the basket with the following details {string} {string} {string} {string} {string} {string} {string} {string}")
    public void user_configures_all_smb_digital_products_in_the_basket_with_the_following_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        CF= new ConfigurePage(driver);
        CF.configure_page();
    }

    @Then("User can click on finish button")
    public void user_can_click_on_finish_button() {
        WebElement iframe2 = driver.findElement(By.xpath("//*[@id=\"EditProductDialog\"]/iframe"));
        driver.switchTo().frame(iframe2);
        driver.findElement(By.xpath("//body[@class='hasMotif Custom8Tab sfdcBody brandQuaternaryBgr ext-webkit ext-chrome ngdialog-open']"));
    }
}
