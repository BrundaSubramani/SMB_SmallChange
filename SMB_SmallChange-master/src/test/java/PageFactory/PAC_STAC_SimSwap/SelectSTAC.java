package PageFactory.PAC_STAC_SimSwap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SelectSTAC {

    WebDriver driver;
    public SelectSTAC(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"portChngId:MyO2Template:thePortForm:theLineitems:0:j_id105\"]/label")
    WebElement checkstac;

    @FindBy(xpath = "//*[@id=\"portChngId:MyO2Template:thePortForm:theContinue\"]/span")
    WebElement reviewrequest;

    public void select_stac(){
        checkstac.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        reviewrequest.click();
    }

}
