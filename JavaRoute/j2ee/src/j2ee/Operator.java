package j2ee;
import java.util.Scanner;
public class Operator {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();//��ȡһ������
	int b = s.nextInt();
	//��ʣ��Ļس����ַ�����ȡ��
	String rn = s.nextLine();
	//��ȡһ���ַ���
	String c = s.nextLine();
	int d = a+b;
	System.out.println(d);	
}
}