package NumberAndString;

public class FormatPrint {
	public static void main(String[] args) {
		int a = 100;
		int b = 10;
		int c =1;
		//8λ��������0 ��,  ,8��ǧλ�ָ���
		System.out.printf("%08d,%,8d,%d%n",a,b*1000,c);
		System.out.printf("%8d,%d,%d\n",a,b,c);
		//-8�������
		System.out.format("%-8d,%d,%d\r",a,b,c);
		//С�������λ��
		System.out.format("%.2f%n",Math.PI);
	}
}
