package Tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PageObjects.CartPage;
import PageObjects.CheckOutPage;
import PageObjects.HomePage;
import Utils.TextContextSetup;

public class E_commerceTesting extends BaseTest{
	

	@Test         // These Test cases are run based on "alphabetical order"
	public void T01_HomePageTest() throws   InterruptedException, IOException {
		
		WebDriverManager();
		
		HomePage hp = new HomePage(WebDriverManager());
		hp.mouseOverOnMenuPages();
		Thread.sleep(2000);                // To UI Appreance purpose
		
		hp.contactClick();
		Thread.sleep(2000);               // To UI Appreance purpose
	}
	
	
	@Test
	public void T02_PlaceOrderTest() throws InterruptedException, IOException {
		
		WebDriverManager();
		
		HomePage hp = new HomePage(WebDriverManager());
		Assert.assertEquals(WebDriverManager().getTitle(), "Essence - Fashion Ecommerce Template");
		hp.mouseOverOnMenuPages();
		Thread.sleep(1000);                       // To UI Appreance purpose
		hp.ProductDetailsClick();
		Thread.sleep(1000);                        // To UI Appreance purpose
		hp.AddToCartButtonClick();
		hp.CartClick();
		Thread.sleep(2000);                      // To UI Appreance purpose
		
		CartPage cp = new CartPage(WebDriverManager());
		cp.checkOutClick();
		
		CheckOutPage cop = new CheckOutPage(WebDriverManager());
		cop.enterFirstName("Prabhakar");
		cop.enterLasttName("Nakka");
//		cop.SelectCountry();                     // Not Working properly
		cop.EnterStreetAdress("Kalluru");
		cop.EnterPinCode("523304");
		cop.EnterCity("Kurichedu");
		cop.EnterState("Andhra Pradesh");
		cop.EnterPhooneNumber("1234567890");
		cop.EnterEmail("prabhakar@gmail.com");
		cop.ClickOnCheckBox();
//		cop.ClickOnCashOnDelivery();            // Not Working properly
		cop.ClickPlaceOrder();
		System.out.println("Two Test cases passed successfully");
		Thread.sleep(3000);                         // To UI Appreance purpose

	}
	
	
	@AfterTest
	public void closeDriver() throws IOException
	{
		WebDriverManager().quit();
	}

	
}





