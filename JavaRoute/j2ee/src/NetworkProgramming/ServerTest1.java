package NetworkProgramming;
import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;
/*
 * 
 * �������˴���
 * 
 * */
public class ServerTest1 {
	public static void main(String[] args)  {
		
		try{
			ServerSocket ss = new ServerSocket(8888);//����һ���������˵�����
			Socket s = ss.accept();
			System.out.println("�����ӹ���" + s);
			s.close();
			ss.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

