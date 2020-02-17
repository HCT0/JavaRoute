package NumberAndString;
import java.util.*;
public class Character {
	public Character(char c) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {	
		
		//自动拆装箱失败
		//char c = 'a';
		//Character c3 = c;
		/*
		//常见的字符的方法
		//判断是不是字母
		System.out.println(Character.isLetter('a'));
		//判断是不是数字
		System.out.println(Character.isDigit('1'));
		//判断是不是空格
		System.out.println(Character.isWhitespace(' '));
		//判断是不是大写
		System.out.println(Character.isUpperCase('A'));
		//判断是不是小写
		System.out.println(Character.isLowerCase('a'));
		//转换为大写
		System.out.println(Character.toLowerCase('C'));
		//转换为小写
		System.out.println(Character.toUpperCase('a'));
		
		char d = '1';
		char e = '中';
		
		Character c3 = new Character('a');
		*/
		
		//使用/t 制表符 进行对齐
		System.out.println("adfa\t df");
		System.out.println("ad\t asdf");
		System.out.println("a\t asdf");
		System.out.println("aasdf\t asdf");
		
		
		
		
		//Character 将char 的封装了变为string
		String s = Character.toString('a');
		
		}

	private static String toString(char c) {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean isDigit(char d) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean isUpperCase(char d) {
		// TODO Auto-generated method stub
		return false;
	}



	
}
