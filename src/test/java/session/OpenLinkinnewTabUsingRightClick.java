package session;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkinnewTabUsingRightClick {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		//Actions action= new Actions(driver);
		//driver.get("https://www.toolsqa.com/");
		WebElement productLink = driver.findElement(By.xpath("(//span[text() = 'Blogs'])[1]"));
		//action.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		//action.contextClick(productLink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		//productLink.sendKeys(Keys.CONTROL, "t");
		//Actions actions = new Actions(driver);
		/*actions.keyDown(Keys.LEFT_CONTROL)
		    .click(productLink)
		    .keyUp(Keys.LEFT_CONTROL)
		    .build()
		    .perform();*/
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).build().perform();
		//driver.findElement(By.xpath(".//*[@id='selectable']/li[1]")).click();
		driver.findElement(By.xpath("(//span[text() = 'Blogs'])[1]")).click();
		action.keyUp(Keys.CONTROL).build().perform();
	}

}
