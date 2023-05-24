package PageFactory.Tariff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class OrderPage {

    WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='j_id0:o2TemplateDSMB:j_id31:j_id154']")
    WebElement existingcustomer;

    @FindBy(id = "j_id0:o2TemplateDSMB:theForm:FirstName")
    WebElement firstname;

    @FindBy(id = "j_id0:o2TemplateDSMB:theForm:LastName")
    WebElement lastname;

    @FindBy(id = "j_id0:o2TemplateDSMB:theForm:BusinessName")
    WebElement businessname;

    @FindBy(id = "j_id0:o2TemplateDSMB:theForm:NoofEmployees")
    WebElement noofemployees;

    @FindBy(id = "j_id0:o2TemplateDSMB:theForm:MobileNumber")
    WebElement mpn;

    @FindBy(id = "j_id0:o2TemplateDSMB:theForm:disableEmailtxt")
    WebElement email;

    @FindBy(id = "j_id0:o2TemplateDSMB:theForm:enableOrderButton")
    WebElement orderbutton;

    public void order_page() throws InterruptedException {
        existingcustomer.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        firstname.sendKeys("TTABAAAAAAAAAAA");
        Thread.sleep(1000);
        lastname.sendKeys("TTAAAAAAAAAAAAAAAAAA");
        Thread.sleep(1000);
        businessname.sendKeys("Business Professional");
        Thread.sleep(1000);
        noofemployees.sendKeys("10");
        Thread.sleep(1000);
        mpn.sendKeys("07805080421");
        Thread.sleep(1000);
        email.sendKeys("fraudaaa@yopmail.com");
        Thread.sleep(1000);
        WebElement check= driver.findElement(By.xpath("//*[@id=\"upgradeRD\"]"));
        check.click();
        Thread.sleep(1000);
        orderbutton.click();
    }
}