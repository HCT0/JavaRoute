package array;
/*
 * 	进行数组的倒置
 * 
 * */
public class ArrayFlipping {
	public static void main(String[] args) {
		int [] a = new int[] {1,2,3,4,5};
		int temp = 0;
		for(int i=0;i<a.length/2;i++) {
			temp = a[i];
			a[i] = a[a.length-1 - i];
			a[a.length-1-i]  = temp;
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
	}
}
