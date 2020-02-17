package ReflectionMechanism;
import LOL.*;
import java.lang.reflect.*;

public class CallingMethod {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		try {
			//获取对象的方法,注意getMethod的参数
			Method m = h1.getClass().getMethod("setName", String.class);
			m.invoke(h1, "gailun");
			System.out.println(h1.name);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
