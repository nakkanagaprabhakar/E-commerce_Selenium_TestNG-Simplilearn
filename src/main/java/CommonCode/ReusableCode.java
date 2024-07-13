package CommonCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableCode {
	public WebDriver driver;
	
	public ReusableCode(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(linkText = "Pages")
	WebElement MenuPagesElement;
	
	@FindBy(id = "essenceCartBtn")
	WebElement CartBagElement;
	
	public void mouseOverOnMenuPages()
	{
		Actions action = new Actions(driver);
		action.moveToElement(MenuPagesElement).build().perform();
		
	}
	
	public void CartClick()
	{
		CartBagElement.click();
	}
	
	
	public void explicitlyWaitForElementVisible(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	

}











