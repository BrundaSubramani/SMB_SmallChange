package PageFactory.AF_Journey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class BusinessDetailsPage {

    WebDriver driver;
    public BusinessDetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:accountNameInputtxt\"]")
    WebElement accountname;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:sortCodeTb1txt\"]")
    WebElement sortcode1;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:sortCodeTb2txt\"]")
    WebElement sortcode2;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:sortCodeTb3txt\"]")
    WebElement sortcode3;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:accountNumberInputtxt\"]")
    WebElement accountnumber;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:txtcbAgreeDirectDebit\"]")
    WebElement checkbox;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:checkYourDetails\"]")
    WebElement checkyourdetails;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:proceedToPersonalDetail\"]")
    WebElement next;



    public void business_details() throws InterruptedException {
        Select companytype= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id31:businessType")));
        companytype.selectByValue("Business Professional");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        accountname.sendKeys("Lisa Taylor");
        Thread.sleep(2000);
        sortcode1.sendKeys("20");
        Thread.sleep(2000);
        sortcode2.sendKeys("93");
        Thread.sleep(2000);
        sortcode3.sendKeys("15");
        Thread.sleep(5000);
        accountnumber.sendKeys("93940101");
        Thread.sleep(2000);
        checkbox.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        checkyourdetails.click();
        Thread.sleep(20000);
        next.click();
    }
}
