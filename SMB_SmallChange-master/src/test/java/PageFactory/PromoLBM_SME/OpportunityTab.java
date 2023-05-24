package PageFactory.PromoLBM_SME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class OpportunityTab {

    WebDriver driver;
    public OpportunityTab(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"Opportunity_Tab\"]/a")
    WebElement opty;

    @FindBy(xpath = "//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
    WebElement New;

    @FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
    WebElement Continue;

    @FindBy(xpath = "//*[@id=\"opp3\"]")
    WebElement optyname;

    @FindBy(xpath = "//*[@id=\"opp4\"]")
    WebElement accountnamesearch;

    //@FindBy(linkText = "Testing Account")
    //WebElement testaccount;

    //@FindBy(xpath = "//*[@id=\"opp5\"]")
    //WebElement type;

    //@FindBy(xpath = "//*[@id=\"opp5\"]/option[3]")
    //WebElement newBusiness;

    //@FindBy(xpath = "//*[@id=\"opp11\"]")
    //WebElement stage;

    //@FindBy(xpath = "//*[@id=\"opp11\"]/option[2]")
    //WebElement awarenessofneeds;

    @FindBy(xpath = "//*[@id=\"ep\"]/div[2]/div[2]/table/tbody/tr[7]/td[4]/div/span/span/a")
    WebElement closedate;

    //@FindBy(xpath = "//*[@id=\"opp6\"]")
    //WebElement leadsource;

    //@FindBy(xpath = "//*[@id=\"opp6\"]/option[2]")
    //WebElement brt;

    @FindBy(xpath = "//*[@id=\"topButtonRow\"]/input[1]")
    WebElement save;

    public void opty_tab()
    {
        opty.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        New.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Continue.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        optyname.sendKeys("test_BRT");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //testaccount.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select type= new Select(driver.findElement(By.xpath("//*[@id=\"opp5\"]")));
        type.selectByValue("New Business");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select stage= new Select(driver.findElement(By.id("opp11")));
        stage.selectByValue("Awareness of Needs");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        closedate.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select leadsource= new Select(driver.findElement(By.id("opp6")));
        leadsource.selectByValue("BRT");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        accountnamesearch.sendKeys("Test Private");
        save.click();

    }



}
