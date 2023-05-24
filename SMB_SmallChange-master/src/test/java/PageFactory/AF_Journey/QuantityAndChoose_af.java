package PageFactory.AF_Journey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
public class QuantityAndChoose_af {
WebDriver driver;
    public QuantityAndChoose_af(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[text()='Choose']")
    WebElement choose;
    public void clickOnChoose() throws InterruptedException {
        Thread.sleep(5000);
        Select quanity= new Select(driver.findElement(By.xpath("//label[.=\"Number of licenses\"]/../..//select")));
        quanity.selectByValue("2");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        choose.click();
    }
}