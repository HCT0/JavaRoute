package ReflectionMechanism;
import java.io.*;
import java.lang.reflect.*;
import LOL.*;
public class UseConfigCreateObject {
	public static void main(String[] args) {
		File f = new File("C:\\������\\j2ee\\src\\ReflectionMechanism\\Hero.config");
		try(//ʹ��buffer ��ȡ�����ļ�
				FileReader fr = new FileReader(f);
				BufferedReader  br = new BufferedReader(fr);
		){
			String line;
			while((line = br.readLine()) != null ) {//����һ��һ�еĶ�ȡ
				try {
					//Strig name = "Adhero";
					Class class1 = Class.forName(line);
					Constructor c = class1.getConstructor();
					Hero h1 = (Hero) c.newInstance();
					System.out.println(h1);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
