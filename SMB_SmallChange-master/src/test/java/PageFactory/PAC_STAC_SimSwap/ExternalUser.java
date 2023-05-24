package PageFactory.PAC_STAC_SimSwap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ExternalUser {

    WebDriver driver;
    public ExternalUser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"workWithPortalLabel\"]")
    WebElement extuser;

    @FindBy(xpath = "//*[@id=\"workWithPortalMenu\"]/a[3]")
    WebElement loginuser;

    public void external_user()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        extuser.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginuser.click();
    }
}
