package PageFactory.PromoLBM_SME;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SMEprofilesearch {

    WebDriver driver;
    public SMEprofilesearch(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='phSearchInput']")
    WebElement search;

    @FindBy(xpath = "//input[@id='phSearchButton']")
    WebElement searchclick;

    public void SMEsearch_profile()
    {
        search.sendKeys("Ben Myres SME");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        searchclick.click();
    }
}
