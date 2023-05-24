package PageFactory.AF_Journey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchDMU {

    WebDriver driver;
    public SearchDMU(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='phSearchInput']")
    WebElement search;
    @FindBy(xpath = "//input[@id='phSearchButton']")
    WebElement searchclick;
    public void search_DMU()
    {
        search.sendKeys("Sundaram Subramanian DMU");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        searchclick.click();
    }
}