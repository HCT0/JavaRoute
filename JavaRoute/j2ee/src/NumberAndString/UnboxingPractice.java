package NumberAndString;

public class UnboxingPractice {
	public static void main(String[] args) {
		byte b1 =100;
		Byte b2 = b1;//�Զ�װ��
		b1 = b2;//�Զ�װ��
		

		int i1=100;
		Integer i2 = i1;//�Զ�װ��
		
		b2 =(byte) i1;//int ��������ת��ΪŶByte
		i1 = b2;//�Զ�����
		
		short s1 = 100;
		Short s2 = s1;//�Զ�װ��
		s1 = s2;//�Զ�����
		
		float f1 = 100f; 
		Float f2 =f1;//�Զ�װ��
		float f3 = f2;//�Զ�����
	
		double d1 = 100;
		Double d2 = d1;//�Զ�װ��
		d1 = d2;//�Զ�����
		
		//���Byte�����ֵ
		System.out.println(Byte.MAX_VALUE);
	
	}

}