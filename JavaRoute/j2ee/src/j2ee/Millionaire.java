package j2ee;

public class Millionaire {
public static void main(String[] args) {
	double sum = 1.2 ;
	//����ѭ���ı�ǩ
	loop:
	for(int i=1;;i++) {
		sum = sum * 1.2;
		
		if(sum>=100) {
			i++;
			System.out.print("����100������"+i+"��");
			break loop;
		}
		sum +=1.2;
	}
}
}