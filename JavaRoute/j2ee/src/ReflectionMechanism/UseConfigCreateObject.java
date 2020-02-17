package ReflectionMechanism;
import java.io.*;
import java.lang.reflect.*;
import LOL.*;
public class UseConfigCreateObject {
	public static void main(String[] args) {
		File f = new File("C:\\代码区\\j2ee\\src\\ReflectionMechanism\\Hero.config");
		try(//使用buffer 读取配置文件
				FileReader fr = new FileReader(f);
				BufferedReader  br = new BufferedReader(fr);
		){
			String line;
			while((line = br.readLine()) != null ) {//进行一行一行的读取
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
