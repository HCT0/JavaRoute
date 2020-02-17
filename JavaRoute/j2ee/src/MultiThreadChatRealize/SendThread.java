package MultiThreadChatRealize;
import java.io.*;
import java.net.*;
import java.util.*;
public class SendThread extends Thread {
	private Socket s;
	
	public SendThread(Socket s) {
		this.s = s;
	}	
	public void run() {
		try(
				PrintStream ps = new PrintStream(s.getOutputStream());
		){
			Scanner s = new Scanner(System.in);
			ps.print(s.nextLine());
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}

}
