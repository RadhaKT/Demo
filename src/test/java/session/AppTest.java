package session;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AppTest 
{
	static String childWindow;
	public static void main(String args[])
	{
	    
		System.setProperty("webdriver.geko.driver", System.getProperty("user.dir") + "\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver(); 

		driver.get("https://stackoverflow.com/questions/29455355/how-to-switch-to-another-tab-using-selenium-webdriver-with-java#:~:text=String%3E(driver.-,getWindowHandles())%3B%20driver.,like%20that%20or%20previous%3A%20driver.");
		//String parent_window = driver.getWindowHandle();
		//System.out.println("Parent window is: " + parent_window);
		String URL = "https://www.edureka.co/community/33298/how-to-get-the-title-of-a-webpage-using-selenium-java"; 
		((JavascriptExecutor) driver).executeScript("window.open('"+ URL+"');");
		new WebDriverWait(driver, 10).until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(driver.getWindowHandle());
		//Set<String> allWindows = driver.getWindowHandles();
		
		//for(String handle : allWindows)
	//	{
		//	if(!parent_window.equals(handle)) 
		//	{ 
				//childWindow = handle;
				//System.out.println("Child Window is: " + childWindow);
				//driver.switchTo().window(handle); 
				//new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("How to get the title of a webpage using Selenium Java? | Edureka Community")); String first_chile_window = driver.getWindowHandle(); 
		//	}
		//}
		//driver.switchTo().window(parent_window);
		//driver.switchTo().window(childWindow);

	}
	

}


