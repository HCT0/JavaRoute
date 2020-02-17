package array;
/*
 * ����a������b�ĳ��Ȳ�ȷ��������c �ĳ���Ϊa+b�ĺ�
 *������a������b�����ݸ��Ƶ����� ����c��
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
	System.out.println("a���������Ϊ:"+Arrays.toString(a));
	
	for(int i = 0 ; i < b.length;i++)
		b[i] =  new Random().nextInt(100);
	System.out.println("b���������Ϊ:"+Arrays.toString(b));

	System.arraycopy(a,0,c,0,a.length);
	System.arraycopy(b,0,c,a.length,b.length);
	
	
	System.out.println("c���������Ϊ:"+Arrays.toString(c));
	}
}
