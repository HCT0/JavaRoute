package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
	private static int value =0;
	private static AtomicInteger ai = new AtomicInteger();
	
	public static void main(String[] args) {
		int  number = 10000;
		Thread ts1[] =  new Thread[number];
		
		 for (int i = 0; i < number; i++) {
			 Thread t =new Thread(){
				 public void run(){
					 value++;
	              	}
	          	};
	          t.start();
	          ts1[i] = t;
		 }
		 for (Thread t : ts1) {//�ȴ������߳̽���
	            try {
	                t.join();
	            } catch (InterruptedException e) {
	                
	                e.printStackTrace();
	            }
	        }
		 System.out.printf("%d���߳̽���value++��value��ֵ���:%d%n", number,value);
		 
		 //�ڶ��ַ���
		 Thread [] ts2 = new Thread[number];
		 for(int i=0 ;i<number; i++) {
			 Thread t2 =new Thread() {
				 public void run() {
					ai.incrementAndGet();
				 }
			 };
			 t2.start();
			 ts2[i] = t2;
		 }
		 for (Thread t : ts2) {//�ȴ������߳̽���
	            try {
	                t.join();
	            } catch (InterruptedException e) {
	                
	                e.printStackTrace();
	            }
	        }
		 System.out.printf("%d���߳̽���atomicValue.incrementAndGet();��atomicValue��ֵ���:%d%n", number,ai.intValue());
	
	
	
	
	}
}