package File;
import java.io.*;
import java.util.Scanner;
public class ScannerTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();//读取一个整数
		String str = s.nextLine();//读取一个字符串
		System.out.println(i);
		System.out.println(str);
		
	}
}
