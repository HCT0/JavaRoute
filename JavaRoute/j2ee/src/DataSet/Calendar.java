package DataSet;

import java.util.Date;

public class Calendar {
	public static final String Month = null;
	public static final String DATE = null;
	public static final String MONTH = null;




	public static void main(String[] args) {
		
		
		//通过单例模式获取calendar 对象
		Calendar c = Calendar.getInstance();
		
		//将日历对象转换为date对象
		Date d = c.getTime();
		
		Date d2 = new Date(0);
		c.setTime(d2);//将date对象转换为calendar对象
		
	}

	
	
	
	private void setTime(Date d2) {
		// TODO Auto-generated method stub
		
	}

	Date getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	static Calendar getInstance() {
		// TODO Auto-generated method stub
		return null;
	}




	public void set(Date time) {
		// TODO Auto-generated method stub
		
	}




	public void set(int i, int j, int k, int l, int m, int n) {
		// TODO Auto-generated method stub
		
	}




	public void add(String month2, int i) {
		// TODO Auto-generated method stub
		
	}
}
