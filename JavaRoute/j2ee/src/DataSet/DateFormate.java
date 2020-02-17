package DataSet;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateFormate {
	public static void main(String[] args) throws ParseException {
		
		//日期转换为字符串 format
		//注意simpledateFormat的格式
		//y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss SSS");
		Date d1 = new Date();
		String str = sdf.format(d1);//格式化函数,将现在的时间设置成在simpleDateFormat中设置的格式
		System.out.println(str);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat ("yyyy-MM-dd");
		String str2 = sdf2.format(d1);
		System.out.println(str2);
		
		
		//字符串转换为日期 parse
		//注意simpledateforma和str的格式要匹配
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String str3 = "2016/1/5 12:12:12";
		Date d3 = sdf3.parse(str3);
		
		System.out.println(d3);
		
	}
}
