package array;
import java.util.*;
/*
 * ʵ�ֶ�ά��������򣬽�ÿһ��һά�����������
 * 
 * ��ÿһ��һά����������򼴿�
 * */
public class TwoDimensionalArraySorting {
	public static void main(String[] args) {
		int [][] a = new int [5][8];
		//�Զ�ά�������������ĸ�ֵ
		for(int i=0;i<a.length;i++) {
			for(int n=0;n<a[0].length;n++){
				a[i][n] = new Random().nextInt(100);
			}
		}
		
		for(int i=0;i<a.length;i++)
			System.out.println(Arrays.toString(a[i]));
		
		int b[] = new int [8];
		for(int i=0;i<a.length;i++) {
			b = Arrays.copyOfRange(a[i],0,8);	
			Arrays.sort(b);
			a[i] = Arrays.copyOfRange(b,0,8);
		}
		
		for(int i=0;i<a.length;i++)
			System.out.println(Arrays.toString(a[i]));
			
	}
}
