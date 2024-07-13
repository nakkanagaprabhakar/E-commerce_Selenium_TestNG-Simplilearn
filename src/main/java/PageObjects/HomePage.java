package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonCode.ReusableCode;

public class HomePage extends ReusableCode{
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(linkText = "Contact")
	WebElement ContactElement;
	
	@FindBy(linkText = "Product Details")
	WebElement ProductDetailsElement;
	
	@FindBy(name = "addtocart")
	WebElement addToCartElement;
	
	
	public void contactClick()
	{
		ContactElement.click();
	}
	
	
	public void ProductDetailsClick()
	{
		ProductDetailsElement.click();
		explicitlyWaitForElementVisible(addToCartElement);
	}
	
	public void AddToCartButtonClick()
	{
		addToCartElement.click();
	}
	
	public void acceptAlert()
	{
	    driver.switchTo().alert().accept();
	}

	
	
}


















