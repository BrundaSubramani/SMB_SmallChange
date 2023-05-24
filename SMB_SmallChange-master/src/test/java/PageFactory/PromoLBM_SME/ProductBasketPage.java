package PageFactory.PromoLBM_SME;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ProductBasketPage {

    WebDriver driver;
    public ProductBasketPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[3]/a[3]/span[1]")
    WebElement producthover;

    @FindBy(xpath = "//input[@name='new00N0Y000004FHH4']")
    WebElement newproduct;

    @FindBy(xpath = "//button[@class='ng-binding ng-isolate-scope btn-new-basket label icon icon-new']")
    WebElement addproduct;

    @FindBy(xpath = "//*[@id=\"a1y9E000002al75QAA~a2I9E0000008Qk0UAE_anchor\"]/i[1]")
    WebElement digitalsmb;

    @FindBy(xpath = "//button[@class= 'btn label icon-add']")
    WebElement addprod;

    public void productbasket_page() throws InterruptedException {
        Actions act= new Actions(driver);
        act.moveToElement(producthover).build().perform();
        newproduct.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        addproduct.click();
        Thread.sleep(5000);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,500)");
        digitalsmb.click();
        Thread.sleep(5000);
        addprod.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        //((JavascriptExecutor)driver).executeScript("arguments[0].click()",addprod);


    }
}
