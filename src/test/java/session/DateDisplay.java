package session;

import java.util.Date;

public class DateDisplay {

	public static void main(String[] args) 
	{
		Date d = new Date();
		String dateWithoutTime = d.toString().substring(4, 19).replaceFirst(" ", "-").replace(" ", "_");
		System.out.println(dateWithoutTime+".html");
		
	}

}
