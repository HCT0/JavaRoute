package NumberAndString;
import java.util.*;

public class FormatPractice {
	public static void main(String[] args) {
			String str = "%s���%s�����ˣ����˵��ϰ�%s�Ժ��ζģ�Ƿ����%s���ڣ���������С��������!����û�а취������%s�ֹ���!ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���%s������ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ��!%s���˵����㲻����!����������������˴���꣬�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!";
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