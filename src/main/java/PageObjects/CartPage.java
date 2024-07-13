package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonCode.ReusableCode;

public class CartPage extends ReusableCode{
	public WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath = "//a[text()=\"check out\"]")
	WebElement CheckOutBtnElement;
	
	public void checkOutClick()
	{
		CheckOutBtnElement.click();
	}
	

}
