package NetworkProgramming;
import java.net.*;

import java.net.InetAddress;

public class SocketTest {
	public static void main(String[] args) throws UnknownHostException   {
		InetAddress host  = InetAddress.getLocalHost();
		String ip = host.getHostAddress();
		System.out.println(ip);
	}
}
