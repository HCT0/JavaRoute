package DataSet;

public class CalendarMethods {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());//�����ǰʱ��
		//����ʱ��
		c.set(c.getTime());
		c.add(Calendar.MONTH,-1);//��һ����
		c.add(Calendar.DATE,30);//��һ���µ����һ��,��Ϊ������,����������
		c.add(Calendar.DATE, -2);//����������
		c.set(2018, 1, 15, 23, 59, 59);
		//��������ʱ��
		/*
		 c.set(Calendar.YEAR, 2018);
		 c.set(Calendar.MONTH, Calendar.FEBRUARY);
		 c.set(Calendar.DAY_OF_MONTH, 15);
		 c.set(Calendar.HOUR_OF_DAY, 23);
		 c.set(Calendar.MINUTE, 59);
		 c.set(Calendar.SECOND, 59);
		 */
		//ʱ������
		
		c.add(Calendar.Month,1);//�·ݼ�1
		c.add(Calendar.Month,-1);//�·ݼ�1

	}
	

	private static Calendar add(String month, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
