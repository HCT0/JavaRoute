package typeconversion;
import LOL.*;
public class TpyeTest {
	public static void main(String[] args) {
		Adhero h1 = new Adhero();
		Hero h2 = new Hero();
		Aphero h3 = new Aphero();
		//�����Ǹ���ľ���,����С�ڸ���,��������ת�� ����Ҫǿ��
		h1=(Adhero) h2;//����ת���� ����Ҫǿ��ת��
		h2 = h1;//����ת���࣬����Ҫǿ��ת��
		//h1 = h3;//ת����������û�й�ϵ���޷�ת��
		
		
		
	}
}	
