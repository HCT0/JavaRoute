package DataSet;
import java.util.Date;
public class DataTest {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);//date���ǵ�ǰʱ��
		System.out.println(d1.getTime());//date������չʾ
		System.out.println(System.currentTimeMillis());//ͨ��ϵͳ��ȡ��ǰʱ������ֱ�ʾ
		System.out.println(d1.toString());//��date��һ����
		
		@SuppressWarnings("deprecation")//����һ����1995 һ��֮���ʱ���
		Date d3 = new Date(95,1,1,0,0,0);
		long str = (long) (Math.random()*60*60*24*365*1000+d3.getTime());
		Date d4 = new Date(str);
		System.out.println(d4);//date���ǵ�ǰʱ��
		
		Date d2 = new Date(5000);//��ԭ���ȥ5000�����ʱ�����
		System.out.println(d2);//���ʱ���ʽ
		
		
	}

	
}
	