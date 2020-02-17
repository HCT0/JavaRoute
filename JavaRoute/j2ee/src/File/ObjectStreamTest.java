package File;
import java.io.*;
/*
 * ��������ʹ��
 * */
public class ObjectStreamTest {
	public static void main(String[] args) {
	File f = new File("C:\\������\\j2ee\\src\\File\\gailun.txt");
	Hero h = new Hero();
	h.hp = 100;
	h.name = "����";
	try(
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);//�������������
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);//��������������
	){
		oos.writeObject(h);//���������л�д�뵽�ļ���ȥ
		
		Hero h2 = null;
		try {
			h2 = (Hero )ois.readObject();//���ļ��е����л�������ж�ȡ
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
