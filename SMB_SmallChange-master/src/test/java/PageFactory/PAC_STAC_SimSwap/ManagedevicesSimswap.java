package PageFactory.PAC_STAC_SimSwap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagedevicesSimswap {

    WebDriver driver;
    public ManagedevicesSimswap(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"pn3\"]/a/dl/dt")
    WebElement managedevices;

    @FindBy(xpath = "//*[@id=\"Home:MyO2Template:navigationBar:idSimSwapLink\"]")
    WebElement simswap;

    public void manage_simswap()
    {
        Actions action= new Actions(driver);
        action.moveToElement(managedevices).build().perform();
        simswap.click();
    }

}
