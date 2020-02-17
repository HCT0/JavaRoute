package DataSet;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateFormate {
	public static void main(String[] args) throws ParseException {
		
		//����ת��Ϊ�ַ��� format
		//ע��simpledateFormat�ĸ�ʽ
		//y ������
        //M ������
        //d ������
        //H ����24���Ƶ�Сʱ
        //h ����12���Ƶ�Сʱ
        //m �������
        //s ������
        //S �������
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss SSS");
		Date d1 = new Date();
		String str = sdf.format(d1);//��ʽ������,�����ڵ�ʱ�����ó���simpleDateFormat�����õĸ�ʽ
		System.out.println(str);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat ("yyyy-MM-dd");
		String str2 = sdf2.format(d1);
		System.out.println(str2);
		
		
		//�ַ���ת��Ϊ���� parse
		//ע��simpledateforma��str�ĸ�ʽҪƥ��
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String str3 = "2016/1/5 12:12:12";
		Date d3 = sdf3.parse(str3);
		
		System.out.println(d3);
		
	}
}
