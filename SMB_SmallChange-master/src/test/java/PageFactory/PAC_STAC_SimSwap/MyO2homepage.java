package PageFactory.PAC_STAC_SimSwap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyO2homepage {
    WebDriver driver;
    public MyO2homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"pn2\"]/a/dl/dt")
    WebElement managecontracts;

    @FindBy(xpath = "//*[@id=\"Home:MyO2Template:navigationBar:idPortLink\"]")
    WebElement switchingO2;

    public void Myo2_homepage()
    {
        Actions action= new Actions(driver);
        action.moveToElement(managecontracts).build().perform();
        switchingO2.click();
    }
}
