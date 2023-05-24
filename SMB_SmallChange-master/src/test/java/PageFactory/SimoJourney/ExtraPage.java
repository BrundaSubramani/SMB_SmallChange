package PageFactory.SimoJourney;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ExtraPage {

    WebDriver driver;
    public ExtraPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"capBtn\"]")
    WebElement spendcap;

    @FindBy(xpath ="//*[@id=\"billCapAmount_5\"]")
    WebElement select5cap;

    @FindBy(xpath ="//*[@id=\"billCapAmount_10\"]")
    WebElement select10cap;

    @FindBy(xpath ="//*[@id=\"billCapAmount_15\"]")
    WebElement select15cap;

    @FindBy(xpath ="//*[@id=\"billCapAmount_20\"]")
    WebElement select20cap;

    @FindBy(xpath ="//*[@id=\"billCapAmount_30\"]")
    WebElement select30cap;

    @FindBy(xpath ="//*[@id=\"billCapAmount_50\"]")
    WebElement select50cap;

    @FindBy(xpath ="//*[@id=\"billCapAmount_75\"]")
    WebElement select75cap;

    @FindBy(xpath ="//*[@id=\"billCapAmount_100\"]")
    WebElement select100cap;

    @FindBy(xpath ="//*[@id=\"billCapAmount_200\"]")
    WebElement select200cap;

    @FindBy(xpath = "//*[@id=\"capBtnSecond\"]")
    WebElement Cont;

    @FindBy(xpath = "//a[@class='buttonInitial buttonLarge blueLight btnEnable']")
    WebElement nxtbutton;


    public void select_5cap()
    {
        spendcap.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        select5cap.click();
        Cont.click();
    }

    public void ClickonNextbutton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", nxtbutton);
    }

    public void select_10cap()
    {
        select10cap.click();
        Cont.click();
    }

    public void select_15cap()
    {
        select15cap.click();
        Cont.click();
    }

    public void select_20cap()
    {
        select20cap.click();
        Cont.click();
    }

    public void select_30cap()
    {
        select30cap.click();
        Cont.click();
    }

    public void select_50cap()
    {
        select50cap.click();
        Cont.click();
    }

    public void select_75cap()
    {
        select75cap.click();
        Cont.click();
    }

    public void select_100cap()
    {
        select100cap.click();
        Cont.click();

    }public void select_200cap()
    {
        select200cap.click();
        Cont.click();
    }
}
