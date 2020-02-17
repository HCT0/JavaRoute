package NetworkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import File.DataInputStream;

public class ServerTest3 {
	public static void main(String[] args)  {
		try{
			ServerSocket ss = new ServerSocket(8888);//����һ���������˵�����
			Socket s = ss.accept();
			System.out.println("�����ӹ���" + s);
			try(BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));){
				System.out.println(br.readLine());
			}catch(IOException e) {
				e.printStackTrace();
			}
			s.close();
			ss.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}