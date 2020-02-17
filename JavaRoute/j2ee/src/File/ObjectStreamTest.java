package File;
import java.io.*;
/*
 * 对象流的使用
 * */
public class ObjectStreamTest {
	public static void main(String[] args) {
	File f = new File("C:\\代码区\\j2ee\\src\\File\\gailun.txt");
	Hero h = new Hero();
	h.hp = 100;
	h.name = "盖伦";
	try(
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);//创建对象输出流
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);//创建对象输入流
	){
		oos.writeObject(h);//将对象序列化写入到文件中去
		
		Hero h2 = null;
		try {
			h2 = (Hero )ois.readObject();//将文件中的序列化对象进行读取
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(h2.hp);
		System.out.println(h2.name);
		
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
	
}
