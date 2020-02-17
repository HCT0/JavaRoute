package DataSet;
import java.util.Date;
public class DataTest {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);//date就是当前时间
		System.out.println(d1.getTime());//date的数字展示
		System.out.println(System.currentTimeMillis());//通过系统获取当前时间的数字表示
		System.out.println(d1.toString());//跟date是一样的
		
		@SuppressWarnings("deprecation")//创建一个在1995 一年之间的时间点
		Date d3 = new Date(95,1,1,0,0,0);
		long str = (long) (Math.random()*60*60*24*365*1000+d3.getTime());
		Date d4 = new Date(str);
		System.out.println(d4);//date就是当前时间
		
		Date d2 = new Date(5000);//从原点过去5000毫秒的时间对象
		System.out.println(d2);//输出时间格式
		
		
	}

	
}
	