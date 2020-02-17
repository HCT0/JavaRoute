package DataSet;

public class CalendarMethods {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());//输出当前时间
		//设置时间
		c.set(c.getTime());
		c.add(Calendar.MONTH,-1);//下一个月
		c.add(Calendar.DATE,30);//下一个月的最后一天,因为不存在,则会进行重置
		c.add(Calendar.DATE, -2);//倒数第三天
		c.set(2018, 1, 15, 23, 59, 59);
		//单个设置时间
		/*
		 c.set(Calendar.YEAR, 2018);
		 c.set(Calendar.MONTH, Calendar.FEBRUARY);
		 c.set(Calendar.DAY_OF_MONTH, 15);
		 c.set(Calendar.HOUR_OF_DAY, 23);
		 c.set(Calendar.MINUTE, 59);
		 c.set(Calendar.SECOND, 59);
		 */
		//时间增加
		
		c.add(Calendar.Month,1);//月份加1
		c.add(Calendar.Month,-1);//月份减1

	}
	

	private static Calendar add(String month, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
