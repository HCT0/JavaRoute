package File;
import java.io.*;

/*
 * �������Ķ���
 * 
 * 
 * */
public class FileBufferReader {	
	public static void main(String[] args) {
		File f = new File("F:\\�����ļ�\\�����\\java  ·��\\j2ee\\src\\File\\FileBufferPractice.txt");
		try(
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				){
			while(true) {//�������ߵ�ѭ��
				String line = br.readLine();//��ȡһ�е�������
				if(line == null )
					break;
				System.out.println(line);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
