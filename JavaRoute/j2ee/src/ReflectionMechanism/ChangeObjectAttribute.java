package ReflectionMechanism;
import java.lang.reflect.Field;

import LOL.Hero;
public class ChangeObjectAttribute {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "gailun";
		try {
			//获取对象的某一个字段
			Field f1 = h1.getClass().getDeclaredField("name");
			//进行修改
			f1.set(h1,"temo");
			System.out.println(h1.name);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
