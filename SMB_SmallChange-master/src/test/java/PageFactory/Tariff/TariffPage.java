package PageFactory.Tariff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TariffPage {
    WebDriver driver;
    public TariffPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id= \"OthersmartphonesSIMQA2AVV_tbl-btn\"]")
    WebElement select6GB;

    @FindBy(xpath = "//*[@class= \"blueButtonGlobal tariffPageBtn selectedButtonSim continueClicked\"]")
    WebElement Continue;

    public void tariff_page() throws InterruptedException {
        select6GB.click();
        Thread.sleep(5000);
        Continue.click();
    }
}
