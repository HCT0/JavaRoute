package array;
import java.util.*;
	public class ArrayMethod {
	public static void main(String[] args) {
		int  a[] = new int [] {2,1,3,4,5};
		int [] b = Arrays.copyOfRange(a,0,5);//Դ���� ��ʼλ�� ����λ��
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		//���������е�ĳһ�����ֵ�λ��
		//binarySearch()�����ķ���ֵΪ��
		//1������ҵ��ؼ��֣��򷵻�ֵΪ�ؼ����������е�λ����������������0��ʼ
		//2�����û���ҵ��ؼ��֣�����ֵΪ���Ĳ����ֵ����ν�����ֵ���ǵ�һ���ȹؼ��ִ��Ԫ���������е�λ���������������λ��������1��ʼ��
		System.out.println(Arrays.binarySearch(b,5));
		//��������ıȽ�
		System.out.println(Arrays.equals(a,b));
	//	Arrays.sort(a);
	//	System.out.println(Arrays.equals(a,b));	
		//ʹ��ĳһ�����������������
		Arrays.fill(a,2);
		System.out.println(Arrays.toString(a));
	
	}
}
