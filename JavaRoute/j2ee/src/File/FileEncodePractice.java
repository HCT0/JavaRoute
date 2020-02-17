package File;
/*
 * 将三个16进制的字母使用utf-8转换为一个汉字
 * 
 * 
 * */
import java.io.*;

public class FileEncodePractice {
	public static void main(String[] args) {
	byte  b1 = (byte) 0xE5;
	byte  b2 = (byte) 0xB1;
	byte  b3 = (byte) 0x8c;
	byte all[] = new byte[3];
	all[0] = b1;
	all[1] = b2;
	all[2] = b3;
			
	String str = null ;
	try {
		str = new String(all,"UTF-8");//使用UTF-8编码，三个字节转换为一个汉字
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
	System.out.println(str);
	}
}
