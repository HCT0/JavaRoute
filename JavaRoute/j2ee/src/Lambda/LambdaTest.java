package Lambda;
import java.util.*;
import LOL.*;
public class LambdaTest {

	//过滤函数
	private static void filter(ArrayList<Hero> h1,HeroChecker hc ) {
		for(Hero h : h1) {
			if(hc.test(h)) {
				System.out.println(h);
			}
		}
	}
	
	//构建静态检测方法
	public static boolean testHero(Hero h) {
		return h.hp>100&&h.damage<50;
	}
	
	//构建普通的方法
	public boolean lambdaObjectMethods(Hero h) {
		return h.hp>100 && h.damage<50;
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Hero> al = new ArrayList<Hero>();
		for(int i=0;i<5;i++) {
			al.add(new Hero("HeroList "+i + r.nextInt(1000),+ r.nextInt(100) ));
		}
		//匿名类
		HeroChecker hc = new HeroChecker() {
			public boolean test(Hero h) {
				return h.hp>100 &&h.damage<50;
			}
		};
		//正常的使用
		filter(al,hc);		
		
		//使用Lambda表达式
		filter(al,h->h.hp>100&&h.damage<50);//将匿名的对象的方法的主体传递给另外一个函数
		
		//使用静态方法
		filter(al,h->LambdaTest.testHero(h));
		
		//直接引用静态方法
		filter(al,LambdaTest::testHero);
		
		//使用Lambad 调用对象的方法
		LambdaTest lt  = new LambdaTest();
		filter(al,lt::lambdaObjectMethods);
		
		//引用容器中的方法
		filter(al, Hero::match);
	}
}