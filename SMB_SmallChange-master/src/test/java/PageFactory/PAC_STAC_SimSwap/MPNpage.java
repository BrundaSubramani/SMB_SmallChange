package PageFactory.PAC_STAC_SimSwap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MPNpage {

    WebDriver driver;
    public MPNpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tbody/tr[3]/td[5]/a[1]")
    WebElement select;

    @FindBy(xpath = "//*[@id=\"smbSearchPortPageId:MyO2Template:subscriptionSelection:idContinue\"]")
    WebElement Continue;


    public void MPN_page() throws InterruptedException {
            select.click();
            Thread.sleep(10000);
            Continue.click();
    }

}
