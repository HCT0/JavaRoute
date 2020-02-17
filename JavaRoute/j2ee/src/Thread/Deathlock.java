package Thread;
import LOL.*;
/*
 * 死锁
 * 
 * */
public class Deathlock {
	public static void main(String[] args) {
		 final Hero ahri = new Hero();
	     ahri.name = "九尾妖狐";
	     final Hero annie = new Hero();
	     annie.name = "安妮";
	     Thread t1 = new Thread() {
	    	public void run() {
	    		synchronized(ahri) {
	    			System.out.println("t1 已经占有 了九尾妖狐 ");
	    			try {
	    				Thread.sleep(1000);
	    			}catch(InterruptedException e) {
	    				e.printStackTrace();
	    			}
	    			System.out.println("t1 尝试获取  安妮");
	    			System.out.println("等待中");
	    			
	    			synchronized(annie) {
	    				System.out.println(" do something !");
	    			}
	    		}
	    	}
	     };
	     t1.start();
	     Thread t2 = new Thread() {
		    	public void run() {
		    		synchronized(annie) {
		    			System.out.println("t2 已经占有 了安妮 ");
		    			try {
		    				Thread.sleep(1000);
		    			}catch(InterruptedException e) {
		    				e.printStackTrace();
		    			}
		    			System.out.println("t2尝试获取九尾妖狐");
		    			System.out.println("等待中");
		    			
		    			synchronized(ahri) {
		    				System.out.println(" do something !");
		    			}
		    		}
		    	}
		     };
		     t2.start();
	}
}
