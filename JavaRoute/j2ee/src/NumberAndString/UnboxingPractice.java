package NumberAndString;

public class UnboxingPractice {
	public static void main(String[] args) {
		byte b1 =100;
		Byte b2 = b1;//自动装箱
		b1 = b2;//自动装箱
		

		int i1=100;
		Integer i2 = i1;//自动装箱
		
		b2 =(byte) i1;//int 基本类型转换为哦Byte
		i1 = b2;//自动拆箱
		
		short s1 = 100;
		Short s2 = s1;//自动装箱
		s1 = s2;//自动拆箱
		
		float f1 = 100f; 
		Float f2 =f1;//自动装箱
		float f3 = f2;//自动拆箱
	
		double d1 = 100;
		Double d2 = d1;//自动装箱
		d1 = d2;//自动拆箱
		
		//输出Byte的最大值
		System.out.println(Byte.MAX_VALUE);
	
	}

}
