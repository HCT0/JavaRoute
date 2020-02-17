package Exception;
import java.io.*;
public class ThrowsText {
	public static void main(String[] args) {
		method1();
	}
	private static void  method1() {
		try {
			method2();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	private static void method2() throws FileNotFoundException {
		File f = new File("lol.txt");//创建文件
		FileInputStream fis = new FileInputStream(f);//打开文件
		
	}
}
