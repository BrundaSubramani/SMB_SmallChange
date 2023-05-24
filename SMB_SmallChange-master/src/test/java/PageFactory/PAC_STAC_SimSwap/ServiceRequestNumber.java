package PageFactory.PAC_STAC_SimSwap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceRequestNumber {

    WebDriver driver;
    public ServiceRequestNumber(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"theCaseNumber\"]")
    WebElement number;

    public void request_number()
    {
        String request= number.getText();
        System.out.println("Service Request Number is : "+request);
    }
}
