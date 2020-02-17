package Thread;
/*import java.util.LinkedList;
import Thread.TaskConsumeThread;
public class ThreadPool {
	
	//�̳߳ش�С
	int threadPoolSize;
	//��������
	LinkedList<Runnable> tasks = new LinkedList<>();
	
	public ThreadPool() {
		threadPoolSize =10;
		synchronized(tasks) {//�����������е��߳�
			for(int i=0;i<threadPoolSize;i++) {
				new TaskConsumeThread("�����������߳�"+i).run();
			}
		}
	}
	public void add(Runnable r) {
		synchronized(tasks) {//���µ�������
			tasks.add(r);
			tasks.notifyAll();
		}
	}	
	class TaskConsumeThread extends ThreadPool {
		public TaskConsumeThread(String name) {
	        super(name);
	    }
		
		Runnable task;
		public void run() {
			 System.out.println("������ " + this.getName());
			 while(true) {
				 synchronized(tasks) {
					 while(tasks.isEmpty()) {
						 try {
							tasks.wait(); 
						 }catch(InterrupedtException e) {
							 e.printStackTrace();
						 }
					 }
				 }
				 tasks  = tasks.removeLast();
				 tasks.notifyAll();
			 }
			 System.out.println(this.getName() + " ��ȡ�����񣬲�ִ��");
	         task.run();
		}

	}

}
		
		
*/


import java.util.LinkedList;
import java.util.concurrent.*;
public class ThreadPool {
	public static void main(String[] args)  throws InterruptedException {
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10,15,60,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
		threadPool.execute(new Runnable() {
			public void run() {
				System.out.println("�������");
			}
		});
	}
}