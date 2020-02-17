package Thread;
import LOL.*;
import java.util.*;
import java.text.SimpleDateFormat;//导入时间格式的包

public class SynchronizedThread {
	public static String nowTime() {//返回按照一定格式的现在的时间
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
	
	public static void main(String[] args) {
		Object o1 = new Object();
		Thread t1 = new Thread() {
			public void run() {
				try {
					System.out.println(nowTime()+":t1线程已经运行");
					System.out.println(nowTime()+this.getName()+"试图占有o1");
					synchronized(o1) {
						System.out.println(nowTime()+this.getName()+"占有对象中");
						Thread.sleep(5000);
						System.out.println(nowTime()+this.getName()+"释放对象");
					}
					System.out.println("t1 线程结束");
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	t1.setName("T1");
	t1.start();
	}
}
