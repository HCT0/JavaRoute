package File;
import java.io.*;
import java.util.Scanner;
public class ScannerTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();//��ȡһ������
		String str = s.nextLine();//��ȡһ���ַ���
		System.out.println(i);
		System.out.println(str);
		
	}
}
