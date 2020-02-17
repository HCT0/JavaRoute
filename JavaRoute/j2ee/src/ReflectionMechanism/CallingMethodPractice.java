package ReflectionMechanism;
import java.lang.reflect.*;
import java.io.*;
import LOL.*;
public class CallingMethodPractice {
	public static void main(String[] args) {
		File f = new File("C:\\代码区\\j2ee\\src\\ReflectionMechanism\\Hero.config");
		try(//打开文件，读取文件
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
		){
				String line = null ;
				String allDate[] = new String[5];
				int i = 0;//没一行一行的读取内容，然后存入字符串数组
				while((line = br.readLine()) != null) {
					allDate[i] = line;
					i++;
				}
				//创建两个对象
				try {
					
					//使用反射机制创建对象
					Class class1 = Class.forName(allDate[0]);
					Constructor c1 = class1.getConstructor();
					Aphero h1 = (Aphero) c1.newInstance();
					//设置第一个对象的名字
					Field f1 = h1.getClass().getField("name");
					f1.set(h1,allDate[3]);
					
					//使用反射机制创建第二个对象
					Class class2 = Class.forName(allDate[2]);
					Constructor c2 = class2.getConstructor();
					Adhero h2 = (Adhero)c2.newInstance();
					//设置第二个对象的名字
					Field f2 = h2.getClass().getField("name");
					f2.set(h2, allDate[1]);
									
					//调用第一个对象的攻击方法
					Method m1 = h1.getClass().getMethod("attackHero",String.class);
					m1.invoke(h1,h2.name);//对象 参数
					
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

