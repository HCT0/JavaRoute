package NetworkProgramming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
public class ServerTest2 {
	public static void main(String[] args)  {
		try{
			ServerSocket ss = new ServerSocket(8888);//����һ���������˵�����
			Socket s = ss.accept();
			System.out.println("�����ӹ���" + s);
			
			InputStream is = s.getInputStream();
			int msg = is.read();
			System.out.println(msg);
			s.close();
			ss.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}