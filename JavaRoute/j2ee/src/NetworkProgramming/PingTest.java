package NetworkProgramming;
import java.io.*;

public class PingTest {
	public static void main(String[] args) throws IOException {
		Process  p = Runtime.getRuntime().exec("ping " + "192.168.2.106");
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		StringBuffer sb = new StringBuffer();
		String line = null;
		while( (line = br.readLine()) != null) {
			if(line.length() != 0) {
				sb.append(line);
				sb.append("\n");
			}
		}
		System.out.println("本次指令返回的消息是：");
        System.out.println(sb.toString());
	}
}
