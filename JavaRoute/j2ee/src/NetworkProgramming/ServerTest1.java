package NetworkProgramming;
import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;
/*
 * 
 * 服务器端代码
 * 
 * */
public class ServerTest1 {
	public static void main(String[] args)  {
		
		try{
			ServerSocket ss = new ServerSocket(8888);//创建一个服务器端的内容
			Socket s = ss.accept();
			System.out.println("有连接过来" + s);
			s.close();
			ss.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

