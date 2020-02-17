package DataSet;
import java.util.Date;
import java.text.SimpleDateFormat;



/*
 * ����ʱ������ɺͽ�������
 * */
public class DateFormatPractice {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String datestr;
		
		@SuppressWarnings("deprecation")
		Date d1 = new Date(70,1,1,0,0,0);
		Date temp ;
		Date ds[] = new Date[9];
		
		System.out.println("����ǰ��ʱ������");
		for(int i=0;i<ds.length;i++) {
			//����һ������Ϊ9 �����ʱ������
			long number = (long) (Math.random()*24*60*60*365*30*1000)+d1.getTime();
			ds[i]= new Date(number);
			//���и�ʽ��
			datestr = sdf.format(ds[i]);
			System.out.println(datestr);	
		}
		//ʹ��ð�ݽ�������
		for(int i=0;i<ds.length;i++) {
			for(int j=0;j<ds.length-i-1;j++) {
				if(ds[j].getTime()<ds[j+1].getTime()) {
					temp =ds[j+1];
					ds[j+1] = ds[j];
					ds[j] = temp;
				}
			}	
		}
		
		System.out.println("������ʱ������");
		for(int i=0;i<ds.length;i++) {
			datestr = sdf.format(ds[i]);
			System.out.println(datestr);	
		}
		
		
		
		
		
	}
}
