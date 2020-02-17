package ReflectionMechanism;
import LOL.Hero;

public class GetClassObject {
	public static void main(String[] args) {
		String name = "LOL.Hero";
		try {
			Class class1 = Class.forName(name);
			Class class2 = Hero.class;//不会导致静态属性初始化
			Class class3 = new Hero().getClass();
			System.out.println(class1);
			System.out.println(class2);
			System.out.println(class3);
			System.out.println(class1 == class2);
			System.out.println(class3 == class2);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
