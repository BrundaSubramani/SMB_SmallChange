package PageFactory.PAC_STAC_SimSwap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class NewSimnumberpage {

    WebDriver driver;
    public NewSimnumberpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"simswappage:MyO2Template:theForm:theLineitems:0:thetxt2\"]")
    WebElement inputbox1;

    @FindBy(xpath = "//*[@id=\"simswappage:MyO2Template:theForm:theLineitems:0:thetxt3\"]")
    WebElement inputbox2;

    @FindBy(xpath = "//*[@id=\"simswappage:MyO2Template:theForm:theLineitems:0:thetxt4\"]")
    WebElement inputbox3;

    @FindBy(xpath = "//*[@id=\"simswappage:MyO2Template:theForm:theContinue\"]/span")
    WebElement cont;

    public void newsim_page()
    {
        inputbox1.sendKeys("00680");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        inputbox2.sendKeys("6719");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        inputbox3.sendKeys("5227");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        cont.click();
    }
}
