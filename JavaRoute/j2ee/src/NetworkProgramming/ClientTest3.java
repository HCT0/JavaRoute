package NetworkProgramming;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest3 {
	public static void main(String[] args) {
		System.out.println("�����ǿͻ��˽���");
		try {
				Socket s = new Socket("127.0.0.1",8888);
				System.out.println(s);
				Scanner sc = new Scanner(System.in);
				
				//����console��ȡ�����ݴ���������
				try(
					PrintStream ps  = new PrintStream(s.getOutputStream());
				){
					ps.print(sc.nextLine());
				}catch(IOException e) {
					e.printStackTrace();
				}
				s.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}