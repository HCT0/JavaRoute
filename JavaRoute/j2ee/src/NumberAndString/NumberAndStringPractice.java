package NumberAndString;

public class NumberAndStringPractice {
	public static void main(String[] args) {
		float f = 3.14f;
		String str = String.valueOf(f);//数字转化为字符串
		f = Float.parseFloat(str);
		
		String str2 = "3.14";
		//String str3 = "3.1a4";//会报错
		
		System.out.println(Float.parseFloat(str2));
	}
}
