package File;
import java.io.*;
public class FileInputstreamTest {
	//����������
	public static void main(String[] args) throws IOException {
	File f = new File("F:\\�����ļ�\\�����\\java  ·��\\j2ee\\src\\File\\FileInputStreamTest.txt");
	FileInputStream fis = new FileInputStream(f);
	byte [] all = new byte[(int) f.length()];
	fis.read(all);
	for(byte b :all) {
		System.out.println(b);	
	}
	fis.close();
	
	//���������
	File d = new File("F:\\�����ļ�\\�����\\java  ·��\\j2ee\\src\\File\\FileInputStreamTest.txt");
	FileOutputStream fos = new FileOutputStream(d);
	byte byteArray[]  = {65,66,67};
	fos.write(byteArray);
	fos.close();
	
	
	
	}
}
