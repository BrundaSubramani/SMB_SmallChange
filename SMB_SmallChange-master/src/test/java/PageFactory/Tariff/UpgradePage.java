package PageFactory.Tariff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpgradePage {

    WebDriver driver;
    public UpgradePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"procBtn\"]/a")
    WebElement Proceed;

    public void Upgrade_page()
    {
        Proceed.click();
    }
}
