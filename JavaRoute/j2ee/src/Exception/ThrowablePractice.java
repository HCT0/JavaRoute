package Exception;
import java.io.*;
public class ThrowablePractice{
	
	
	public static void method1() throws Throwable {
		System.out.println("≤‚ ‘");
	}
	public static void main(String[] args) {
		
		
		try {
			method1();
		}catch(Throwable t) {
				System.out.println("Throwable Practice");	
		}
	}
}
