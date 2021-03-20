package session;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;

public class DateFormatConversion 
{
	public static void main(String args[]) throws Exception
	{
	
		String a1 = "2019-01";
		String a = "01-OCT-20";
		//SimpleDateFormat parser = new SimpleDateFormat("yy-MM");
		SimpleDateFormat parser = new SimpleDateFormat("dd-MMMM-yy");
		//SimpleDateFormat formatter = new SimpleDateFormat("MMM yyyy");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		//System.out.println(formatter.format(parser.parse(a)));
		String abc = formatter.format(parser.parse(a));
		System.out.println(abc);
		//int monthNumber = 01;
		//Month exemple = new Month(12);
		
		//System.out.println(Month.of(monthNumber).name());
		
		//System.out.println( new SimpleDateFormat("yyyy-MM").parse(a) );
	}
}
