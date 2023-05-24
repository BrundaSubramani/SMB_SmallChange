package PageFactory.AF_Journey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class LeadPage {

    WebDriver driver;
    public LeadPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"Lead_Tab\"]/a")
    WebElement lead;
    @FindBy(xpath = "//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
    WebElement newlead;
    @FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
    WebElement continuee;
    @FindBy(xpath = "//*[@id=\"name_firstlea2\"]")
    WebElement firstname;
    @FindBy(xpath = "//*[@id=\"name_lastlea2\"]")
    WebElement lastname;
    @FindBy(xpath = "//*[@id=\"00N9E000000kNHo_unselected\"]/optgroup/option[1]")
    WebElement fourG;
    @FindBy(xpath = "//*[@id=\"00N9E000000kNHo_right_arrow\"]")
    WebElement clickright;
    @FindBy(xpath = "//*[@id=\"lea3\"]")
    WebElement company;
    @FindBy(xpath = "//*[@id=\"topButtonRow\"]/input[1]")
    WebElement save;
    public void lead_page()
    {
        lead.click();
        newlead.click();
        continuee.click();
        firstname.sendKeys("test");
        lastname.sendKeys("abc");
        fourG.click();
        clickright.click();
        company.sendKeys("NTT");
        Select leadsource= new Select(driver.findElement(By.id("lea5")));
        leadsource.selectByValue("All In - Online");
        save.click();
    }

}