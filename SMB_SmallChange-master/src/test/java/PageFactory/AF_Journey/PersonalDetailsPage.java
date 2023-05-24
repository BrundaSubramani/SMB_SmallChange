package PageFactory.AF_Journey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class PersonalDetailsPage {

    WebDriver driver;
    public PersonalDetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"step2PersonalDetails\"]/div[2]/div[1]/div[1]/div[4]/input")
    WebElement mpn;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id659:disableEmailtxt\"]")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"step2PersonalDetails\"]/div[2]/div[1]/div[1]/div[6]/input")
    WebElement confirmemail;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id659:addrPostalCodeTemp\"]")
    WebElement postcode;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id659:j_id778\"]")
    WebElement findaddress;

    @FindBy(xpath = "//*[@id=\"step2hardwareLoanDetails\"]/input[1]")
    WebElement checkbox1;

    @FindBy(xpath = "//*[@id=\"step2hardwareLoanDetails\"]/input[2]")
    WebElement checkbox2;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id659:CCA-HLA:j_id915\"]/input")
    WebElement checkbox3;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id659:CCA-HLA:makePaymentBtn\"]")
    WebElement doverificationcheck;

    @FindBy(xpath = "//input[@id= 'CardHolderName']")
    WebElement nameoncard;

    @FindBy(xpath = "//*[@id=\"CardNumber\"]")
    WebElement cardnumber;

    @FindBy(xpath = "//*[@id=\"Month\"]")
    WebElement expirymonth;

    @FindBy(xpath = "//*[@id=\"Year\"]")
    WebElement expiryyear;

    @FindBy(xpath = "//*[@id=\"CardCvv\"]")
    WebElement cvv;

    @FindBy(xpath = "//*[@id=\"btnPayNow\"]")
    WebElement conttonextstep;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id659:btnGoToStep3\"]")
    WebElement personaldetailsnext;


    public void personal_details() throws InterruptedException {
        Select title= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id659:title")));
        title.selectByValue("Ms");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Select day= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id659:birth_day")));
        day.selectByValue("30");
        Thread.sleep(2000);
        Select month= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id659:birth_month")));
        month.selectByValue("5");
        Thread.sleep(2000);
        Select year= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id659:birth_year")));
        year.selectByValue("1999");
        Thread.sleep(2000);
        mpn.sendKeys("07805080421");
        Thread.sleep(2000);
        email.sendKeys("fraud26728@yopmail.com");
        Thread.sleep(2000);
        confirmemail.sendKeys("fraud26728@yopmail.com");
        Thread.sleep(2000);
        postcode.sendKeys("sl12aa");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        findaddress.click();
        Thread.sleep(20000);
        Select address= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id659:addressListTemp")));
        address.selectByValue("8");
        Thread.sleep(20000);
        Select years= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id659:previousAddrYear")));
        years.selectByValue("7");
        Thread.sleep(4000);
        Select months= new Select(driver.findElement(By.id("j_id0:o2TemplateDSMB:j_id659:previousAddrMonth")));
        months.selectByValue("8");
        Thread.sleep(20000);
        checkbox1.click();
        Thread.sleep(40000);
        checkbox2.click();
        Thread.sleep(10000);
        checkbox3.click();
        Thread.sleep(10000);
        doverificationcheck.click();
        Thread.sleep(60000);
        WebElement ifram1=driver.findElement(By.xpath("//*[@id=\"theIframe\"]"));
        driver.switchTo().frame(ifram1);
        nameoncard.sendKeys("DEREK ACCEPT");
        Thread.sleep(1000);
        cardnumber.sendKeys("4000000000001091");
        Thread.sleep(1000);
        expirymonth.sendKeys("01");
        Thread.sleep(1000);
        expiryyear.sendKeys("23");
        Thread.sleep(1000);
        cvv.sendKeys("123");
        Thread.sleep(1000);
        conttonextstep.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        personaldetailsnext.click();




    }
}
