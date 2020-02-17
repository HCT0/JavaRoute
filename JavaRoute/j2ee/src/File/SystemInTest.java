package File;
import java.io.*;
public class SystemInTest {
	public static void main(String[] args) {
	try(InputStream is = System.in){
		while(true) {
			int i = is.read();//在没有 标识的情况下，会将回车和换行读入
			System.out.println(i);
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
}
