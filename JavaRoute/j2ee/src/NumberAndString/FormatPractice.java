package NumberAndString;
import java.util.*;

public class FormatPractice {
	public static void main(String[] args) {
			String str = "%s最大%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的%s，现在全部只卖二十块，统统只要二十块!%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
		Scanner s = new Scanner(System.in);
		String local  = s.nextLine();
		String companyType = s.nextLine();
		String companyName = s.nextLine();
		String companyBoss = s.nextLine();
		String total = s.nextLine();
		String product = s.nextLine();
		String  unit = s.nextLine();
		System.out.printf(str,local,companyType,companyName,companyBoss,total,product,unit,unit,unit,product,companyBoss);
	
	}
}
