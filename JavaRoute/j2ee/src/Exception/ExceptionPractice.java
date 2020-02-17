package Exception;
import java.io.*;
public class ExceptionPractice {
	public static void main(String[] args) {
		ExceptionPractice  ep = new ExceptionPractice();
		System.out.println(ep.method());
	}
	
	@SuppressWarnings("finally")
	public int method() {
		try {
			return 1;
		}
		catch(Exception e )
		{
			return 2;
		}
		finally{
			return 3;
		}
		
	}
}
