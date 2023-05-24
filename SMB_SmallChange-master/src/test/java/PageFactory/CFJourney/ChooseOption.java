package PageFactory.CFJourney;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class ChooseOption {
    WebDriver driver;
    public ChooseOption(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='bs-col-xs-3 bs-col-sm-3 bs-col-md-3 bs-col-lg-3 brandDiv']")
    WebElement plusBrand;

    @FindBy(xpath = "//span[.=\"Google\"]/../input")
    WebElement clickOption;

    @FindBy(xpath = "//*[@id=\"donebtnF\"]")
    WebElement Done;

    public void clickPlusForBrand() {
    plusBrand.click();
    }

    public void selectAnyBrand() {
    clickOption.click();
    }

    public void clickDone() {
        Done.click();
    }
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
    }


}
