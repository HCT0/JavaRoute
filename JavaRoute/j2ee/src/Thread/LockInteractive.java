package Thread;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class LockInteractive {
	public static String now() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
		
	} 
	public static void  log(String msg) {
		 System.out.printf("%s %s %s %n", now() , Thread.currentThread().getName() , msg);
	}
	
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();//lock
		Condition condition = lock.newCondition();//ʹ��lock ���н���
		
		Thread t1 = new Thread() {
			public void run() {
				try {
					log("�߳�����");
					log("��ͼռ�ж���Lock");
					
					lock.lock();
					log("ռ�ж���");
					log("ռ�ж���5��");
					
					Thread.sleep(5000);
					
					condition.await();
					
					log("t1 ����ռ�ж���");
					Thread.sleep(5000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}finally {
					log("�ͷŶ���");
					lock.unlock();
				}
			}
		};
		t1.setName("t1");
		t1.start();
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread t2 = new Thread() {
			public void run() {
				boolean locked = false;
				try {
					log("�߳�����");
					log("��ͼռ�ж���:lock");
					lock.lock();
					log("t2 ռ��lock");
					Thread.sleep(5000);
					log("���ѵȴ��е��߳�");
					condition.signal();//����ֹͣ���߳�
					
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}finally {
					if(locked){
                        log("�ͷŶ���lock");
                        lock.unlock();
                    }
				}
				log("�߳̽���");
			}
		};
		t2.setName("t2");
		t2.start();
		
		
	}
}