package j2ee;
/*
 * 
 * 
 * ��ӡ 1-100 ֮�����������������Ҫô��3��Ҫô5�ı������ͺ��Ե�
 * 
 * */
public class IgnoreMultiple {
public static void main(String[] args) {
	for(int i = 1;i<=100;i++) {	
		if(i%3==0 || i%5==0)
			continue;
		else
			System.out.println(i);
	}
}
}