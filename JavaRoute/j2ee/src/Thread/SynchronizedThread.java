package Thread;
import LOL.*;
import java.util.*;
import java.text.SimpleDateFormat;//����ʱ���ʽ�İ�

public class SynchronizedThread {
	public static String nowTime() {//���ذ���һ����ʽ�����ڵ�ʱ��
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
	
	public static void main(String[] args) {
		Object o1 = new Object();
		Thread t1 = new Thread() {
			public void run() {
				try {
					System.out.println(nowTime()+":t1�߳��Ѿ�����");
					System.out.println(nowTime()+this.getName()+"��ͼռ��o1");
					synchronized(o1) {
						System.out.println(nowTime()+this.getName()+"ռ�ж�����");
						Thread.sleep(5000);
						System.out.println(nowTime()+this.getName()+"�ͷŶ���");
					}
					System.out.println("t1 �߳̽���");
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
