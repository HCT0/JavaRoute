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
		File f = new File("lol.txt");//�����ļ�
		FileInputStream fis = new FileInputStream(f);//���ļ�
		
	}
}
