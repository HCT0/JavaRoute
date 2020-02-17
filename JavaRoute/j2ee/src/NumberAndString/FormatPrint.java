package NumberAndString;

public class FormatPrint {
	public static void main(String[] args) {
		int a = 100;
		int b = 10;
		int c =1;
		//8位，不够用0 补,  ,8是千位分隔符
		System.out.printf("%08d,%,8d,%d%n",a,b*1000,c);
		System.out.printf("%8d,%d,%d\n",a,b,c);
		//-8是左对齐
		System.out.format("%-8d,%d,%d\r",a,b,c);
		//小数的输出位数
		System.out.format("%.2f%n",Math.PI);
	}
}
