package array;
import java.util.*;
	public class ArrayMethod {
	public static void main(String[] args) {
		int  a[] = new int [] {2,1,3,4,5};
		int [] b = Arrays.copyOfRange(a,0,5);//源数组 开始位置 结束位置
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		//搜索数组中的某一个数字的位置
		//binarySearch()方法的返回值为：
		//1、如果找到关键字，则返回值为关键字在数组中的位置索引，且索引从0开始
		//2、如果没有找到关键字，返回值为负的插入点值，所谓插入点值就是第一个比关键字大的元素在数组中的位置索引，而且这个位置索引从1开始。
		System.out.println(Arrays.binarySearch(b,5));
		//进行数组的比较
		System.out.println(Arrays.equals(a,b));
	//	Arrays.sort(a);
	//	System.out.println(Arrays.equals(a,b));	
		//使用某一个数字填充整个数组
		Arrays.fill(a,2);
		System.out.println(Arrays.toString(a));
	
	}
}
