package ReflectionMechanism;
import java.lang.reflect.*;
import LOL.Hero;
public class CreateObject {
	public static void main(String[] args) {
		Hero h1 = new Hero();//new ��������
		h1.name = "����";
		h1.hp = 330f;
		System.out.println(h1);
		try{//ʹ�÷��䴴������
			String name = "LOL.Hero";
			//��ȡ�����
			Class class1 = Class.forName(name);
			//��ȡ����������
			Constructor c =  class1.getConstructor();
			Hero h2 = (Hero)c.newInstance(); 
			System.out.println(h2);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
