package ReflectionMechanism;
import LOL.*;
import java.lang.reflect.*;

public class CallingMethod {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		try {
			//��ȡ����ķ���,ע��getMethod�Ĳ���
			Method m = h1.getClass().getMethod("setName", String.class);
			m.invoke(h1, "gailun");
			System.out.println(h1.name);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
