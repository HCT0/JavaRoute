package j2ee;
import java.util.Scanner;
public class Bmi2 {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			//��ȡ���ߺ�����
			float height = s.nextFloat();
			float weight = s.nextFloat();
			float bmi = weight/(height*height);
			if(bmi < 18.5)
				System.out.println("���ع���");
			if(bmi >= 18.5 && bmi<24)
				System.out.println("������Χ");
			if(bmi>= 24 && bmi<27)
				System.out.println("���ع���");
			if(bmi>=27&&bmi<30)
				System.out.println("��ȷ���");
			if(bmi>=30&&bmi<35)
				System.out.println("�жȷ���");
			if(bmi>35)
				System.out.println("�ضȷ���");
		}
	}
