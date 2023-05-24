package PageFactory.AF_Journey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class SelectApp_AF {
    WebDriver driver;
    public SelectApp_AF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void clickApp() {
        Actions action=new Actions(driver);
        WebElement Bshop=driver.findElement(By.xpath("//*[text()='Business shop']"));
        action.moveToElement(Bshop).build().perform();
        WebElement apps=driver.findElement(By.xpath("//*[text()='Apps']"));
        action.moveToElement(apps).build().perform();
        WebElement mcaffe=driver.findElement(By.xpath("(//*[text()='McAfee Multi Access'])[1]"));
       // action.moveToElement(mcaffe).build().perform();
        mcaffe.click();
    }
}