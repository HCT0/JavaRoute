package NumberAndString;

public class Unboxing {
	public static void main(String[] args) {
		int i =100;
		Integer it1 = new Integer(i);//��ͨ�ķ�װ
		Integer it2 = i;//�Զ�װ��
		int i3 = it1.intValue();//��ͨ�Ĳ���
		int i2 = it1;//�Զ�����
		
		System.out.println(Integer.MAX_VALUE);//��������װ������ֵ
		System.out.println(Integer.MIN_VALUE);//��������װ�����Сֵ
	}
}