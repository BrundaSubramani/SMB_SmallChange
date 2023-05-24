package PageFactory.PAC_STAC_SimSwap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SelectPAC {

    WebDriver driver;
    public SelectPAC(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"portChngId:MyO2Template:thePortForm:theLineitems:0:j_id100\"]/label")
    WebElement check;

    @FindBy(xpath = "//*[@id=\"portChngId:MyO2Template:thePortForm:theContinue\"]/span")
    WebElement review;

    public void select_pac(){
        check.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        review.click();
    }
}
