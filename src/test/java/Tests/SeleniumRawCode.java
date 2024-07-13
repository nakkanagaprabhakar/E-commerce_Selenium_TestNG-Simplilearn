package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumRawCode {

	public static void main(String[] args) throws InterruptedException {
		
// 1
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Apache24/htdocs/ATE_PEP2_Testing_Using_TestNG/index.html");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Pages"))).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(2000);
		
// 2
		
		action.moveToElement(driver.findElement(By.linkText("Pages"))).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Product Details")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("addtocart")).click();
		
		driver.findElement(By.id("essenceCartBtn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=\"check out\"]")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Prabhakar");
		driver.findElement(By.id("last_name")).sendKeys("Nakka");
		
//		WebElement Countries = driver.findElement(By.cssSelector(".nice-select"));
//		Select dropdown = new Select(Countries);
//		dropdown.selectByValue("ind");
		
		driver.findElement(By.id("street_address")).sendKeys("Kalluru");
		driver.findElement(By.id("postcode")).sendKeys("523304");
		driver.findElement(By.id("city")).sendKeys("Kurichedu");
		driver.findElement(By.id("state")).sendKeys("Andhra Pradesh");
		driver.findElement(By.id("phone_number")).sendKeys("1234567890");
		driver.findElement(By.id("email_address")).sendKeys("prabhakar@gmail.com");
		
		driver.findElement(By.xpath("//label[@for=\"customCheck1\"]")).click();
//		driver.findElement(By.xpath("//a[text()=\"cash on delievery\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Place Order\"]")).click();
		
		Thread.sleep(2000);
		
		
		
		
		

	}

}
