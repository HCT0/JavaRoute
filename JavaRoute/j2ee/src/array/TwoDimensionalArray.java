package array;
import java.util.*;
/*
 * ���ж�ά�������Сֵ
 * 
 * 
 * */
public class TwoDimensionalArray {
	public static void main(String[] args) {
		int [][] a =new int [5][5];
		for(int i = 0; i < a.length; i++) {
			for(int n = 0; n < a[0].length; n++) {
			 a[i][n] = new Random().nextInt(100);	 
			}
		}
		int max = a[0][0];
		for(int i = 0; i < a.length; i++) {
			for(int n = 0; n < a[0].length; n++) {
				if(max < a[i][n]){
					max = a[i][n];
					}	
			}
		}	
	//Arrays.sort(a);//�޷��Զ�ά�����������
	//System.out.println(a[0][0]);
	System.out.println("��������ֵΪ��"+max);
	}
	
}
