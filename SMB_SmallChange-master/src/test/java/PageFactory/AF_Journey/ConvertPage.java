package PageFactory.AF_Journey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class ConvertPage {

    WebDriver driver;
    public ConvertPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"tsk5_fu\"]")
    WebElement subject;
    @FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
    WebElement convert;
    public void convert_page()
    {
        Select accountname= new Select(driver.findElement(By.id("accid")));
        accountname.selectByValue("000000000000000");
        subject.sendKeys("name");
        convert.click();
    }

}