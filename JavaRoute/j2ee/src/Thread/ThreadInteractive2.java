package Thread;
import LOL.*;
/*
 * 
 * ���� notify ��wait �ķ�ʽ���н���
 * */
public class ThreadInteractive2 {
	public static void main(String[] args) {
		 final Hero gareen = new Hero();
	     gareen.name = "����";
	     gareen.hp = 616;
	     
	     
	        Thread t1 = new Thread() {
	        	public void run() {
	        		while(true) {
	        			gareen.hurt();
	        			System.out.printf("t1 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.name,gareen.name,gareen.hp);
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
	                    System.out.printf("t2 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.name,gareen.name,gareen.hp);
	                }
	   
	            }
	        };
	        t2.start();
	       
	}
}
