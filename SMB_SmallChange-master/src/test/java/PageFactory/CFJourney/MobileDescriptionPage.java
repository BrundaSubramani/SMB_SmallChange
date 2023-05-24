package PageFactory.CFJourney;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileDescriptionPage {
	
	WebDriver driver;
	public MobileDescriptionPage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"select-variant-button-1\"]")
	WebElement viewalltariffs;

	@FindBy(xpath = "//*[@id=\"memsize memsizeSelect128\"]/div[2]")
	WebElement dropdown;

	@FindBy(xpath = "//*[@class= \"256GB selected-background sel-background\"]")
	WebElement select256GB;

	public void iphone12promax_memory()
	{
		viewalltariffs.click();
	}

	public void iphone13promax_memory()
	{
		dropdown.click();
		select256GB.click();
		viewalltariffs.click();
	}

	public void iphone13pro_memory()
	{
		dropdown.click();
		select256GB.click();
		viewalltariffs.click();
	}

	public void iphone12_5g_memory()
	{
		dropdown.click();
		select256GB.click();
		viewalltariffs.click();
	}

	public void iphone13_memory()
	{
		dropdown.click();
		select256GB.click();
		viewalltariffs.click();
	}
}
