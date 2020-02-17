package j2ee;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		int sum=1;
		
		while(c!=0) {
			if(c==0) {
				sum=1;
				break;
			}
			sum = sum*c;
			c--;
		}
		System.out.println(sum);
			
	}
}
