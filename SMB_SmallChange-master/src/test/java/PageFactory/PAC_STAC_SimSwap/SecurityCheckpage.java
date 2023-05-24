package PageFactory.PAC_STAC_SimSwap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SecurityCheckpage {

    WebDriver driver;
    public SecurityCheckpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void security_check()
    {
        Select mpn= new Select(driver.findElement(By.id("portChngId:MyO2Template:thePortForm:j_id133:j_id134:chooseMPN")));
        mpn.selectByValue("447488810908");
    }
}
