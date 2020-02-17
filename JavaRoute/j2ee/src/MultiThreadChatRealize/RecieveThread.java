package MultiThreadChatRealize;
import java.net.*;
import java.io.*;
public class RecieveThread extends Thread {
	private Socket s;
	
	public RecieveThread(Socket s) {
		this.s = s;
	}
	public void run() {
		try(
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));		
		){
			System.out.println(br.readLine());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
