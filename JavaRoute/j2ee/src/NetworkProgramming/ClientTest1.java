package NetworkProgramming;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.io.*;

/*�ͻ��˴���
 * */
public class ClientTest1 {
	public static void main(String[] args) {
		try {
				Socket s = new Socket("127.0.0.1",8888);
				System.out.println(s);
				s.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
