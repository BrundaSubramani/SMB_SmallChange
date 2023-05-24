package PageFactory.CFJourney;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessMobilePhonePage {
	
	WebDriver driver;
	public BusinessMobilePhonePage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"a7H9E000000HXorUAG\"]/a")
	WebElement iphone12promax;

	@FindBy(xpath = "//*[@id=\"a7H9E0000002kArUAI\"]/a")
	WebElement iphone13promax;

	@FindBy(xpath = "//*[@id=\"a7H9E0000002kAmUAI\"]/a")
	WebElement iphone13pro;

	@FindBy(xpath = "//*[@id=\"a7H9E000000HXoIUAW\"]/a")
	WebElement iphone12_5G;

	@FindBy(xpath = "//*[@id=\"a7H9E0000002kAhUAI\"]/a")
	WebElement iphone13;

	public void select_iphone12promax()
	{
		iphone12promax.click();
	}

	public void select_iphone13promax()
	{
		iphone13promax.click();
	}

	public void select_iphone13pro()
	{
		iphone13pro.click();
	}

	public void select_iphone12_5G()
	{
		iphone12_5G.click();
	}

	public void select_iphone13()
	{
		iphone13.click();
	}
}
