package j2ee;
import java.util.Scanner;
public class Bmi {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//读取身高和体重
		float height = s.nextFloat();
		float weight = s.nextFloat();
		float bmi = weight/(height*height);
		System.out.println(bmi);
	}
}
