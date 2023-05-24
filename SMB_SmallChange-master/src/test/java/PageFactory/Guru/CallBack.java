package PageFactory.Guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CallBack {
    WebDriver driver;
    public CallBack(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//label[.=\"First Name\"]/../..//input)[1]")
    WebElement fn;
    @FindBy(xpath = "(//label[.=\"Last Name\"]/../..//input)[2]")
    WebElement ln;

    @FindBy(xpath = "(//label[.=\"Phone Number\"]/../..//input)[1]")
    WebElement pn;

    @FindBy(xpath = "(//label[.=\"Email Address\"]/../..//input)[1]")
    WebElement email1;

    @FindBy(xpath = "(//label[.=\"Confirm Email Address\"]/../..//input)[2]")
    WebElement email2;

    @FindBy(xpath = "//strong[.=\"Select the time you want your Guru call\"]/../../input")
    WebElement date;

    @FindBy(xpath = "(//*[text()='Submit'])[1]")
    WebElement submit;


    //WebElement selectproduct;

    public void enterAllDetails(String firstname, String lastname, String phonenumber, String email, String app) throws InterruptedException {
    fn.sendKeys(firstname);
    Thread.sleep(1000);
    ln.sendKeys(lastname);
    Thread.sleep(1000);
    pn.sendKeys(phonenumber);
    Thread.sleep(1000);
    email1.sendKeys(email);
    Thread.sleep(1000);
    email2.sendKeys(email);
    Thread.sleep(1000);
    Select selectProduct= new Select(driver.findElement(By.xpath("(//label[.=\"Product\"]/../..//select)[1]")));
    selectProduct.selectByValue(app);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    Select selectReason= new Select(driver.findElement(By.xpath("(//label[.=\"What do you want to talk about?\"]/../..//select)[2]")));
    selectReason.selectByValue("General Query");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    date.sendKeys("19/01/2023 16:00");
    }

    public void clickSubmit() {
    submit.click();
    }

    @FindBy(xpath = "//*[@class='confMessage']")
    WebElement appointmentNumber;
    public String getAppointmentNumber() {
        String str=appointmentNumber.getText();
        System.out.println(str);
        return str;
    }
}
