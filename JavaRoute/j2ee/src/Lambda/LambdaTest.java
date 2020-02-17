package Lambda;
import java.util.*;
import LOL.*;
public class LambdaTest {

	//���˺���
	private static void filter(ArrayList<Hero> h1,HeroChecker hc ) {
		for(Hero h : h1) {
			if(hc.test(h)) {
				System.out.println(h);
			}
		}
	}
	
	//������̬��ⷽ��
	public static boolean testHero(Hero h) {
		return h.hp>100&&h.damage<50;
	}
	
	//������ͨ�ķ���
	public boolean lambdaObjectMethods(Hero h) {
		return h.hp>100 && h.damage<50;
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Hero> al = new ArrayList<Hero>();
		for(int i=0;i<5;i++) {
			al.add(new Hero("HeroList "+i + r.nextInt(1000),+ r.nextInt(100) ));
		}
		//������
		HeroChecker hc = new HeroChecker() {
			public boolean test(Hero h) {
				return h.hp>100 &&h.damage<50;
			}
		};
		//������ʹ��
		filter(al,hc);		
		
		//ʹ��Lambda���ʽ
		filter(al,h->h.hp>100&&h.damage<50);//�������Ķ���ķ��������崫�ݸ�����һ������
		
		//ʹ�þ�̬����
		filter(al,h->LambdaTest.testHero(h));
		
		//ֱ�����þ�̬����
		filter(al,LambdaTest::testHero);
		
		//ʹ��Lambad ���ö���ķ���
		LambdaTest lt  = new LambdaTest();
		filter(al,lt::lambdaObjectMethods);
		
		//���������еķ���
		filter(al, Hero::match);
	}
}