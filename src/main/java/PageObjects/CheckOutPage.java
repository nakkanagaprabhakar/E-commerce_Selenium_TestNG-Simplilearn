package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import CommonCode.ReusableCode;

public class CheckOutPage extends ReusableCode{
	public WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(id = "first_name")
	WebElement firstnameElement;
	
	@FindBy(id = "last_name")
	WebElement lastnameElement;
	
	@FindBy(css = ".nice-select")
	WebElement CountriesElement;
	
	@FindBy(id = "street_address")
	WebElement streetAddressElement;
	
	@FindBy(id = "postcode")
	WebElement pinCodeElement;
	
	@FindBy(id = "city")
	WebElement cityElement;
	
	@FindBy(id = "state")
	WebElement StateElement;
	
	@FindBy(id = "phone_number")
	WebElement phoneNumberElement;
	
	@FindBy(id = "email_address")
	WebElement emailElement;
	
	@FindBy(xpath = "//label[@for=\"customCheck1\"]")
	WebElement CheckBoxElement;
	
	@FindBy(xpath = "//a[text()=\"cash on delievery\"]")
	WebElement CashOnDeliveryElement;
	
	@FindBy(xpath = "//a[text()=\"Place Order\"]")
	WebElement PlaceOrderElement;
	
	
	
	public void enterFirstName(String firstName)
	{
		explicitlyWaitForElementVisible(PlaceOrderElement);
		firstnameElement.sendKeys(firstName);
	}
	
	public void enterLasttName(String lasttName)
	{
		lastnameElement.sendKeys(lasttName);
	}
	
	public void SelectCountry()
	{
		WebElement Countries = CountriesElement;
		Select dropdown = new Select(Countries);
		dropdown.selectByValue("ind");
	}
	
	public void EnterStreetAdress(String streetAddress)
	{
		streetAddressElement.sendKeys(streetAddress);
	}
	
	public void EnterPinCode(String pincode)
	{
		pinCodeElement.sendKeys(pincode);
	}
	
	public void EnterCity(String city)
	{
		cityElement.sendKeys(city);
	}
	
	public void EnterState(String State)
	{
		StateElement.sendKeys(State);
	}
	
	public void EnterPhooneNumber(String phoneNumber)
	{
		phoneNumberElement.sendKeys(phoneNumber);
	}
	
	public void EnterEmail(String email)
	{
		emailElement.sendKeys(email);
	}
	
	public void ClickOnCheckBox()
	{
		CheckBoxElement.click();
	}
	
	public void ClickOnCashOnDelivery()
	{
		CashOnDeliveryElement.click();
	}

	public void ClickPlaceOrder()
	{
		PlaceOrderElement.click();
	}
	
}













