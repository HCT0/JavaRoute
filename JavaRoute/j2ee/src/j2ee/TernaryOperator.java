package j2ee;
import java.util.Scanner;
public class TernaryOperator {
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int i = s.nextInt();
	String str=i<=5?"�����ǹ�����":"���첻�ǹ�����";
	System.out.println(str);
	}
}