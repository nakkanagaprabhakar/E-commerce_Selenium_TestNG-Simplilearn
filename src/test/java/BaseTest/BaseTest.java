package BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("URL_link");
		
		if(driver == null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("Chrome"))
			{
				driver = new ChromeDriver();
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("Edge"))
			{
				driver = new EdgeDriver();
			}
			
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		}
		
		return driver;
		
		
	}
	

}












