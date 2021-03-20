package session;
import java.text.DecimalFormat;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Try 
{
	static int i;
	public static void main(String args[])
	{
		String ab = "";
		try
		{
			if(!(ab.equalsIgnoreCase("")))
			{
				System.out.println("Inside if loop");
				System.out.println(ab);
			}
			System.out.println("dsfsd");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}



}
