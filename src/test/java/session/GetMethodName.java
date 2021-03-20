package session;

public class GetMethodName {

	public static void main(String[] args) 
	{
		String methodname = new Throwable().getStackTrace()[0] .getMethodName();
		System.out.println(methodname);
	}

}
