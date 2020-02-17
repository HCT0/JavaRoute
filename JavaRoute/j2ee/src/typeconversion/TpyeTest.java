package typeconversion;
import LOL.*;
public class TpyeTest {
	public static void main(String[] args) {
		Adhero h1 = new Adhero();
		Hero h2 = new Hero();
		Aphero h3 = new Aphero();
		//子类是父类的具体,所以小于父类,所以向上转型 不需要强制
		h1=(Adhero) h2;//父类转子类 ，需要强制转换
		h2 = h1;//子类转父类，不需要强制转换
		//h1 = h3;//转换错误，两者没有关系，无法转换
		
		
		
	}
}	
