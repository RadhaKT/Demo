package session;

import java.text.DecimalFormat;

public class Decimalformat {

	public static void main(String[] args) 
	{
		//Decimalformat dd = new Decimalformat();
		//dd.trim();
		Percentage("78138", "199985");
		
		/*
		 * String value1 = "123"; double Double1 = Double.parseDouble(value1);
		 * DecimalFormat df = new DecimalFormat("0.00"); df.setMaximumFractionDigits(0);
		 * String value2 = df.format(Double1);
		 * System.out.println("liters of petrol before putting in editor : "+value2);
		 */
		
	}

	/*
	 * public void trim() { String value = "2,222.89"; String value1 =
	 * value.replaceAll(",", ""); System.out.println(value1); }
	 */
	public void decimalse()
	{
		String value1 = "123.822";

		double Double1 = Double.parseDouble(value1);
		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(2);
		String value2 = df.format(Double1);
		System.out.println("liters of petrol before putting in editor : "+value2);
	}
	
	public static void Percentage(String Value1, String Value2)
	{
		double value = ((Double.parseDouble(Value1)-Double.parseDouble(Value2))/Double.parseDouble(Value1));
		String result = String.valueOf(value) ;
		System.out.println(result);
		double value_D = Double.parseDouble(result);
		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(0);
		String Result = df.format(value_D);
		System.out.println(Result);
	}
}
