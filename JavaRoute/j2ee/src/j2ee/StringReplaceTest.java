package j2ee;
/*
 * replace 并不会修改原字符串，因为Strig 是不可以改变的，只会返回一个修改一行的结果
 * */
public class StringReplaceTest {	
	public static void main(String[] args) {
	String str = "this a test line";
	str.replace('a','e');
	System.out.println(str);
	System.out.println(str.replace('a','e'));
	
	}
}
