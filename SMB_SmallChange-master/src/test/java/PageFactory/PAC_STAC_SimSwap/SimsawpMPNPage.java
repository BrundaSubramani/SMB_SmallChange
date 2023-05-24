package PageFactory.PAC_STAC_SimSwap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SimsawpMPNPage {
    WebDriver driver;
    public SimsawpMPNPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"selectRow\"]")
    WebElement mpn;

    @FindBy(linkText = "Continue to details")
    WebElement conttodetails;

    public void sim_MPN()
    {
        mpn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        conttodetails.click();
    }
}
