package j2ee;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int c = s.nextInt();
	if(c % 400 == 0 || c % 100 != 0 && c % 4 == 0)
		System.out.println("是闰年");
	else
		System.out.println("不是闰年");
}
}
