package File;
/*
 * ������16���Ƶ���ĸʹ��utf-8ת��Ϊһ������
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
		str = new String(all,"UTF-8");//ʹ��UTF-8���룬�����ֽ�ת��Ϊһ������
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
	System.out.println(str);
	}
}