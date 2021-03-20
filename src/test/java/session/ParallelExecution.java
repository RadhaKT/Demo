package session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class ParallelExecution 
{
	WebDriver driver;

	@BeforeMethod
	public void befor()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@DataProvider (parallel = true, name = "Get")
	public Object[][] dp1() 
	{
		return new Object[][] {
			new Object[] { "AP" },
			new Object[] { "SP" },
			new Object[] { "DP" },
			new Object[] { "MP" }

		};
	}

	@Test (dataProvider = "Get", threadPoolSize = 2)
	public void B1(String city) throws InterruptedException
	{		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title = 'Search']")).sendKeys(city);
		//driver.findElement(By.xpath("(//input[@class = 'gNO89b'])[2]")).click(); 
	}
}