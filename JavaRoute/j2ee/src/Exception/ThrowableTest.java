package Exception;
import java.io.*;
public class ThrowableTest {
	public static void main(String[] args) {
		File f = new File("a.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
		}catch(Throwable t) {
				System.out.println("Throwable Test");	
		}
	}
}
