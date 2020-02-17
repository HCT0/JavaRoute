package File;
import java.io.*;
public class FileInputstreamTest {
	//建立输入流
	public static void main(String[] args) throws IOException {
	File f = new File("F:\\代码文件\\代码库\\java  路线\\j2ee\\src\\File\\FileInputStreamTest.txt");
	FileInputStream fis = new FileInputStream(f);
	byte [] all = new byte[(int) f.length()];
	fis.read(all);
	for(byte b :all) {
		System.out.println(b);	
	}
	fis.close();
	
	//建立输出流
	File d = new File("F:\\代码文件\\代码库\\java  路线\\j2ee\\src\\File\\FileInputStreamTest.txt");
	FileOutputStream fos = new FileOutputStream(d);
	byte byteArray[]  = {65,66,67};
	fos.write(byteArray);
	fos.close();
	
	
	
	}
}
