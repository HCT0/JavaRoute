package Thread;
/*
 * 线程之间的交互
 * 1 while 等待式交互
 * 缺点：占用cpu,影响性能
 * 
 * */
import LOL.*;
public class ThreadInteractive {
	public static void main(String[] args) {

        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        
        Thread t1 = new Thread() {
        	public void run() {
        		while(true) {
        			while(gareen.hp == 1) {
        				continue;
        			}
        			gareen.hurt();
        			System.out.printf("t1 为%s 减血1点,减少血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
        			try {
        				Thread.sleep(10);
        			}catch(InterruptedException e) {
        				e.printStackTrace();
        			}
        		}
        	}
        };
        t1.start();
        
        Thread t2 = new Thread() {
        	public void run() {
        		while(true) {
        			gareen.recover();
        			System.out.printf("t2 为%s 回血1点,增加血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
        			try {
        				Thread.sleep(100);
        			}catch(InterruptedException e) {
        				e.printStackTrace();
        			}
        		}
        	}
        };
        t2.start();
        
        
		
	}
}
