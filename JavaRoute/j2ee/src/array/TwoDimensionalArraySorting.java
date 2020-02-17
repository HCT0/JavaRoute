package array;
import java.util.*;
/*
 * 实现二维数组的排序，将每一个一维数组进行排序
 * 
 * 将每一个一维数组进行排序即可
 * */
public class TwoDimensionalArraySorting {
	public static void main(String[] args) {
		int [][] a = new int [5][8];
		//对二维数组进行随机数的赋值
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
