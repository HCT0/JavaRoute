package StringSet;

public class CreateString {
	public static void main(String[] args) {
		String str1 = "盖坤";//根据字面量进行创建
		String str2 = new String("提莫");//调用构造函数创建
		String str3 = str1 + str2;//使用+ 进行相加
		char [] cs = {'a','b','d'};
		String str4 = new String(cs);//通过字符数组进行创建
		String str5 ="";//空数组
		System.out.println(str4.length());

		System.out.println(str4.charAt(1));
		
	}
}
