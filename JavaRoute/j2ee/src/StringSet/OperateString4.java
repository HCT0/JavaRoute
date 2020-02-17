package StringSet;
/*
 * 最后一个字母大写
 * 
 * */
public class OperateString4 {
	public static void main(String[] args) {
		String str = "lengendary";
		char chars[] = str.toCharArray();
		chars[chars.length-1] -=32;
		System.out.println(new String(chars));
	}
}
