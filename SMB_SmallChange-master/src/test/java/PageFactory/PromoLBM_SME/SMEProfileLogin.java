package PageFactory.PromoLBM_SME;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SMEProfileLogin {

    WebDriver driver;
    public SMEProfileLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Ben Myres SME')]")
    WebElement benmyresSME;

    @FindBy(xpath = "//a[@id='moderatorMutton']")
    WebElement dropdown;

    @FindBy(xpath = "//*[text()='User Detail']")
    WebElement userdetail;

    @FindBy(xpath = "//*[@id=\"topButtonRow\"]/input[4]")
    WebElement login;

    public void smeprofile_login()
    {
        benmyresSME.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dropdown.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",userdetail);
        //userdetail.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        login.click();
    }
}
