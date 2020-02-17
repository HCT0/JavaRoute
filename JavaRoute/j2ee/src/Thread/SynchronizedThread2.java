package Thread;

import LOL.*;
import java.lang.*;
public class SynchronizedThread2 {
	public static void main(String[] args) {

        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 10000;
    
        int n = 10;
        //创建两个线程数组,一个用来装 加血的线程,一个用来装扣血的线程
        Thread [] addThreads = new Thread[n];
        Thread [] reduceThreads = new Thread[n];
        
        for(int i=0;i<n;i++) {
        	Thread t = new Thread() {//使用匿名类来创建对象
        		public void run() {
        				gareen.recover();//recover 方法自带synchronized
        			  try {
                          Thread.sleep(100);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
        		}
        	};
        	t.start();
        	addThreads[i] = t;
        }
        
        for(int i = 0;i<n;n++) {
        	Thread t =  new Thread() {
        		public void run() {
        			gareen.hurt();
        			try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
        		}
        	};
        	t.start();
        	reduceThreads[i] = t;
        }
        //在对每一个线程进行执行即可
        for(Thread t : addThreads ) {
        	try {
        		t.join();
        	}catch(InterruptedException e ) {
        		e.printStackTrace();
        	}
        }
        for(Thread t : reduceThreads ) {
        	try {
        		t.join();
        	}catch(InterruptedException e ) {
        		e.printStackTrace();
        	}
        }
     System.out.println(gareen.hp);   
	}
}
