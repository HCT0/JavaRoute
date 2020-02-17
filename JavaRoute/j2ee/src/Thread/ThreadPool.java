package Thread;
/*import java.util.LinkedList;
import Thread.TaskConsumeThread;
public class ThreadPool {
	
	//线程池大小
	int threadPoolSize;
	//任务容器
	LinkedList<Runnable> tasks = new LinkedList<>();
	
	public ThreadPool() {
		threadPoolSize =10;
		synchronized(tasks) {//轮流启动所有的线程
			for(int i=0;i<threadPoolSize;i++) {
				new TaskConsumeThread("任务消费者线程"+i).run();
			}
		}
	}
	public void add(Runnable r) {
		synchronized(tasks) {//有新的任务来
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
			 System.out.println("启动： " + this.getName());
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
			 System.out.println(this.getName() + " 获取到任务，并执行");
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
				System.out.println("任务测试");
			}
		});
	}
}