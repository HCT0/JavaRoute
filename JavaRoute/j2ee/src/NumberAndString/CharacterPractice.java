package NumberAndString;

import java.util.Scanner;

public class CharacterPractice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		char [] c =a.toCharArray();//将字符串转化为字符数组
		for (char d: c) {
			if(Character.isDigit(d)) {
				System.out.print(d);
			}
			if(Character.isUpperCase(d)) {
				System.out.print(d);
			}
		}
		System.out.println("读取成功");
	}
}
