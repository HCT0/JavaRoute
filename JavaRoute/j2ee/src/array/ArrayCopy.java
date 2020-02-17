package array;
/*
 * 
 *数组的复制
 * */
public class ArrayCopy {

	public static void main(String[] args) {
		int [] a = new int[] {1,2,3,4,5};
		int [] b = new int [4];

		System.arraycopy( a , 0 , b , 0 , b.length);
		for (int each:b)
			System.out.println(each);
	}	
}
