package PageFactory.SKU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkuSearch {
    WebDriver driver;
    public SkuSearch(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='phSearchInput']")
    WebElement sku;

    @FindBy(xpath = "//input[@id='phSearchButton']")
    WebElement search;

    public void sku_search_LBM() {
        sku.sendKeys("Microsoft Teams Audio Conferencing select dial-out (NCE COM ADD 1MO MTH)");
        search.click();
    }

    public void sku_search_SME() {
        sku.sendKeys("Microsoft Teams Audio Conferencing select dial-out (NCE COM ADD 1MO MTH)");
        search.click();
    }
}
