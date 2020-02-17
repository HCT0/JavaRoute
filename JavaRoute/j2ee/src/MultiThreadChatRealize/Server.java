package MultiThreadChatRealize;

import java.io.IOException;
import java.net.*;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8888);
			Socket s = ss.accept();
			new SendThread(s).start();
			new RecieveThread(s).start();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
