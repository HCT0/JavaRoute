package j2ee;
import java.util.Scanner;
public class Switch {
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int c = s.nextInt();
	switch(c) {
	case 3:
	    System.out.println("这是春天");
	    break;
	case 4:
	    System.out.println("这是春天");
	    break;
	case 5:
	    System.out.println("这是春天");
	    break;
	case 6:
	    System.out.println("这是夏天");
	    break;
	case 7:
	    System.out.println("这是夏天");
	    break;
	case 8:
	    System.out.println("这是夏天");
	    break;
	case 9:
	    System.out.println("这是秋天");
	    break;
	case 10:
	    System.out.println("这是秋天");
	    break;
	case 11:
	    System.out.println("这是秋天");
	    break;
	case 12:
	    System.out.println("这是冬天");
	    break;
	case 1:
	    System.out.println("这是冬天");
	    break;
	case 2:
	    System.out.println("这是冬天");
	    break;
	default:
		System.out.println("输出数字有误");
	}
	}
}
