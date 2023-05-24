package PageFactory.CFJourney;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.time.Duration;

public class TarrifAndExtrasPage {
	WebDriver driver;
	public TarrifAndExtrasPage(WebDriver driver) { 
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);
	}

	//@FindBy(xpath = "//button[text()='24 months']")
	//WebElement month;
	
	@FindBy(xpath = "//*[@class=\"blueButtonGlobal blueLight tariffPageBtn selectedRecTariff\"]")
	WebElement selectButton;
	
	@FindBy(xpath = "//*[@class= \"buttonInitial buttonLarge blueLight btnNewCartAdd btnEnable\"]")
	WebElement goToBasket;


	/*public void monthselect(){
		month.click();
	}*/

	public void clickOnSelectButton() {
		selectButton.click();
	}

	
	public void clickGoToBasketButton() throws InterruptedException {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,600)", "");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(10000);
		//((JavascriptExecutor)driver).executeScript("arguments[0].click()",goToBasket);
		goToBasket.click();

	}
	
}
