package array;
/*
 * ʹ����ǿ�͵�for
 * 
 * 
 * */
public class EnhancementTypeFor {
public static void main(String[] args) {
	int [] a = new int [] {1,2,3,4,5};
	int b = a[0];
	for(int each : a) {
		if(b<=each)
			b=each;
	}
	
	System.out.println(b);
	
}
}
