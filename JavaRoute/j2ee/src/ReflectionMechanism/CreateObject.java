package ReflectionMechanism;
import java.lang.reflect.*;
import LOL.Hero;
public class CreateObject {
	public static void main(String[] args) {
		Hero h1 = new Hero();//new 创建对象
		h1.name = "盖伦";
		h1.hp = 330f;
		System.out.println(h1);
		try{//使用反射创建对象
			String name = "LOL.Hero";
			//获取类对象
			Class class1 = Class.forName(name);
			//获取构造器对象
			Constructor c =  class1.getConstructor();
			Hero h2 = (Hero)c.newInstance(); 
			System.out.println(h2);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
