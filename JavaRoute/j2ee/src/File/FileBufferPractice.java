package File;
import java.io.*;
public class FileBufferPractice {
	public static void main(String[] args) {
	File f =  new File("F:\\�����ļ�\\�����\\java  ·��\\j2ee\\src\\File\\FileBufferPractice.txt");
	StringBuffer sb = new StringBuffer();
	try(
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			){
		while(true){
			String line = br.readLine();
			if(line == null)//���ļ������ݽ������޵��ж�
				break;
			System.out.println(line);
			if(line != null)
				if( !line.startsWith("//")) {
					sb.append(line);
					sb.append("\n");
				}
		}	
	}
	catch(IOException e ) {
		e.printStackTrace();
	}
	try(
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			){
		pw.println(sb);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	System.out.println("java�ļ�ע��ɾ���ɹ�");
	}
}
