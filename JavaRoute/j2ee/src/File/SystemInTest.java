package File;
import java.io.*;
public class SystemInTest {
	public static void main(String[] args) {
	try(InputStream is = System.in){
		while(true) {
			int i = is.read();//��û�� ��ʶ������£��Ὣ�س��ͻ��ж���
			System.out.println(i);
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
}
