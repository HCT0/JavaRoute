package ReflectionMechanism;
import java.lang.reflect.Field;

import LOL.Hero;
public class ChangeObjectAttribute {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "gailun";
		try {
			//��ȡ�����ĳһ���ֶ�
			Field f1 = h1.getClass().getDeclaredField("name");
			//�����޸�
			f1.set(h1,"temo");
			System.out.println(h1.name);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
