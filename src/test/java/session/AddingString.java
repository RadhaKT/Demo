package session;

import org.openqa.selenium.By;

public class AddingString 
{
	public static void main(String args[])
	{
		String a = "15.78";
		String b = "10";
		//System.out.println(a);
		a = a.replaceAll(",", "");
		//System.out.println(a);
		double value = Double.parseDouble(a)-Double.parseDouble(b);
		String result = String. valueOf(value) ;
		System.out.println(result);
		
		
		}
	}
	
	
	
	


