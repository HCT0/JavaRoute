package StringSet;

import java.util.Arrays;

public class StringComparaPractice {
	public static void main(String[] args) {
		String []str = new String[100];
		String []str2 =new String[100];
		char c2[] = new char[2];
		char c;
		for(int j=0;j<100;j++){
			for(int i=0;i<2;i++){
				c =(char)(Math.random()*125);
				if(Character.isDigit(c) || Character.isLowerCase(c) || Character.isUpperCase(c)){
					c2[i] =c;
				}
			}
			str[j] = new String(c2);
		}
		int sum=0;
		for(int i=0;i<100;i++){
			for(int j=i+1;j<100;j++)
				if(str[i].equals(str[j])) {
					if(Arrays.binarySearch(str2,str[j])<0) {
						sum++;
						str2[sum] = str[j];
					}
				}
		}
		
		System.out.printf("总共有%d种重复的字符串",str2.length);
		
	}
}
