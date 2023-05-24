package PageFactory.Tariff;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
public class ExtrasPage {
    WebDriver driver;
    public ExtrasPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Yes, add a Spend Cap")
    WebElement spendcap;
    @FindBy(xpath = "//*[@id=\"billCapAmount_15\"]")
    WebElement capAmount;
    @FindBy(xpath = "//span[@id='capBtnSecond']")
    WebElement Cont;
    @FindBy(xpath = "//a[@id='false-tariffbolton-grid-btn-OthersmartphonesSIMQA2AWC100MN2']")
    WebElement bolton;
    @FindBy(xpath = "//a[@class='buttonInitial buttonLarge blueLight btnEnable']")
    WebElement nxtbutton;
    public void ClickonSpendCap(){
        spendcap.click();
    }

    public void ClickonCapAmt(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", capAmount);
    }

    public void ClickonCont(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Cont.click();
    }

    public void ClickonBolton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", bolton);
    }
    public void ClickonNextbutton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", nxtbutton);
    }
}
