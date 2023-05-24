package PageFactory.PromoLBM_SME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class ConfigurePage {

    WebDriver driver;
    public ConfigurePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='btn btn-edit ng-scope']")
    WebElement icon;

    @FindBy(xpath = "//*[@id=\"SMB_Digital_Products:Choose_your_Digital_Product:Select_SMB_Digital_Product_0\"]")
    WebElement digitalproductname;


    @FindBy(xpath = "//*[@id=\"j_id0:j_id10:j_id57:0:j_id69\"]/a")
    WebElement microsoftNCE;

    @FindBy(xpath = "//*[@id=\"SMB_Digital_Products:Choose_your_Digital_Product:DISE_Account_Number_0\"]")
    WebElement disecode;

    public void configure_page()
    {
        icon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"EditProductDialog\"]/iframe"));
        driver.switchTo().frame(iframe);
        digitalproductname.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
                driver.switchTo().window(child_window);}
        WebElement iframe1 = driver.findElement(By.xpath("//*[@id=\"lookupIframeLE\"]"));
        driver.switchTo().frame(iframe1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        microsoftNCE.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.switchTo().frame(iframe);
        disecode.sendKeys("5436782");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

}
