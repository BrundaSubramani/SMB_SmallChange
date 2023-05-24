package PageFactory.AF_Journey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonthlyPaymentDetails {
    WebDriver driver;
    public MonthlyPaymentDetails(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id1337:j_id1446:j_id1447:gdprCheckbox9\"]")
    WebElement checkbox;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id1337:hf2\"]")
    WebElement next;

    public void monthly_details() throws InterruptedException {
        checkbox.click();
        Thread.sleep(30000);
        next.click();
    }
}
