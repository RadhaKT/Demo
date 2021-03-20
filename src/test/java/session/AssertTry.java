package session;

import org.testng.Assert;

public class AssertTry 
{
	public static void main(String args[])
	{
		String a = "Radha";
		String b = "Radha";
		
		Assert1(a, b);
	}
	
	public static void Assert1(String a, String b)
	{
		try
		{ 
			Assert.assertEquals(a, b); 
			System.out.println();
			System.out.println("DB Result: " +a +" is matching to UI Result: "+ b);
		}catch(AssertionError e) 
		{
			System.out.println();
			System.out.println("DB Result: " +a +" is not matching to UI Result: "+ b);
			//throw e;
		}
	}
	
}
