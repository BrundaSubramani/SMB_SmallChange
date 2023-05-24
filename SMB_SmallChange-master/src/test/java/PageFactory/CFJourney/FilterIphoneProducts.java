package PageFactory.CFJourney;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class FilterIphoneProducts {

    WebDriver driver;
    public FilterIphoneProducts(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"filterArrow\"]")
    WebElement filter;

    @FindBy(xpath = "//*[@class= 'linkToggler brandBtn']")
    WebElement brand;

    @FindBy(xpath = "//*[@id=\"u5500_input_Apple\"]")
    WebElement iphone;

    @FindBy(xpath = "//*[@id=\"donebtnF\"]")
    WebElement done;

    public void business_page()
    {
        filter.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        brand.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        iphone.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        done.click();
    }
}
