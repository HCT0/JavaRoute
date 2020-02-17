package array;
/*
 * 数组a和数组b的长度不确定，数字c 的长度为a+b的和
 *将数组a和数组b的内容复制到数组 数组c中
 * 
 * */

import java.util.*;

public class MergedArray {
	public static void main(String[] args) {
	int [] a = new int[new Random().nextInt(5) + 5];
	int [] b = new int[new Random().nextInt(5) + 5];
	int [] c = new int [a.length + b.length]; 
	
	for(int i = 0 ; i < a.length ; i++)
		a[i] =  new Random().nextInt(100);
	System.out.println("a数组的内容为:"+Arrays.toString(a));
	
	for(int i = 0 ; i < b.length;i++)
		b[i] =  new Random().nextInt(100);
	System.out.println("b数组的内容为:"+Arrays.toString(b));

	System.arraycopy(a,0,c,0,a.length);
	System.arraycopy(b,0,c,a.length,b.length);
	
	
	System.out.println("c数组的内容为:"+Arrays.toString(c));
	}
}
