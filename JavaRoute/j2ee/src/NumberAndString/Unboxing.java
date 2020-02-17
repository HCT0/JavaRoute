package NumberAndString;

public class Unboxing {
	public static void main(String[] args) {
		int i =100;
		Integer it1 = new Integer(i);//普通的封装
		Integer it2 = i;//自动装箱
		int i3 = it1.intValue();//普通的拆箱
		int i2 = it1;//自动拆箱
		
		System.out.println(Integer.MAX_VALUE);//输出这个封装类的最大值
		System.out.println(Integer.MIN_VALUE);//输出这个封装类的最小值
	}
}
