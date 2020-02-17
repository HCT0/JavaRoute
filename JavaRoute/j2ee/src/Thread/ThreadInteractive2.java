package Thread;
import LOL.*;
/*
 * 
 * 采用 notify 和wait 的方式进行交互
 * */
public class ThreadInteractive2 {
	public static void main(String[] args) {
		 final Hero gareen = new Hero();
	     gareen.name = "盖伦";
	     gareen.hp = 616;
	     
	     
	        Thread t1 = new Thread() {
	        	public void run() {
	        		while(true) {
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
	        
	        
	        Thread t2 = new Thread(){
	            public void run(){
	                while(true){
	                    gareen.recover();
	   
	                    try {
	                        Thread.sleep(100);
	                    } catch (InterruptedException e) {
	                
	                        e.printStackTrace();
	                    }
	                    System.out.printf("t2 为%s 回血1点,增加血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
	                }
	   
	            }
	        };
	        t2.start();
	       
	}
}
