package File;
import java.io.*;

/*
 * ������д��
 * flush�Ľ���
 * 
 * */
public class FileBufferWriter {
	public static void main(String[] args) {
		File f = new File("F:\\�����ļ�\\�����\\java  ·��\\j2ee\\src\\File\\BufferWriterPractice.txt");
		try(
				FileWriter fw = new FileWriter(f); 
				PrintWriter pw = new PrintWriter(fw);
				){
			 	pw.println("garen kill teemo");//ʹ�û������ķ���,����д�룬������������������д��
			 	pw.flush(); //flush ǿ�ƽ������ݵ�д�룬���㻺����û����
	            pw.println("teemo revive after 1 minutes");
	            pw.println("teemo try to garen, but killed again");	
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
