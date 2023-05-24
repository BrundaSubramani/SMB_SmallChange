package PageFactory.Filter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class MobDescriptionpage {


    WebDriver driver;

    public MobDescriptionpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"select-variant-button-1\"]")
    WebElement viewalltariffs;

    @FindBy(xpath = "//*[@id=\"memsize memsizeSelect128\"]/div[2]")
    WebElement dropdown;

    @FindBy(xpath = "//*[@id=\"memsize memsizeSelect256\"]/div[1]")
    WebElement select256GB;

    @FindBy(xpath = "//*[@id=\"memsize memsizeSelect512\"]/div[1]")
    WebElement select512gb;


    public void select_128gb()
    {

        try
        {
            viewalltariffs.click();
        }
        catch(Exception e)
        {
            Reporter.log("Only one memory variant is available",true);
        }
    }

    public void select_256gb()
    {
        try
        {
            dropdown.click();
            select256GB.click();
        }
        catch(Exception e)
        {
            Reporter.log("Only one memory variant is available",true);
        }
    }

    public void select_512gb()
    {
        try
        {
            dropdown.click();
            select512gb.click();
        }
        catch(Exception e)
        {
            Reporter.log("Only one memory variant is available",true);
        }

    }
}
