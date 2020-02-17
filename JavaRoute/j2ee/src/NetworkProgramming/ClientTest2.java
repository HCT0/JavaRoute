package NetworkProgramming;

import java.io.IOException;
import java.net.Socket;
import java.io.*;
/*
 * 
 * 客户端传输数字
 * 
 * */
public class ClientTest2 {
	public static void main(String[] args) {
		try {
				Socket s = new Socket("127.0.0.1",8888);
				System.out.println(s);
				OutputStream os = s.getOutputStream();
				os.write(100);
				os.close();
				s.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
