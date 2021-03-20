package session;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeWindowOPen 
{

	//public static void main(String args[])
	//{

	@Test
	public void chromeopen()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.toolsqa.com/selenium-tutorial/");
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.tutorialspoint.com/index.htm");
		driver.switchTo().window(tabs.get(0));
		String Actualtitle = driver.getTitle();
		//System.out.println(Actualtitle);
		//Assert.assertEquals(Actualtitle, "Free Selenium Tutorial | Selenium WebDriver Tutorials | For Beginners");
	}

	//} 
}
