package Thread;
import LOL.*;
/*
 * ����
 * 
 * */
public class Deathlock {
	public static void main(String[] args) {
		 final Hero ahri = new Hero();
	     ahri.name = "��β����";
	     final Hero annie = new Hero();
	     annie.name = "����";
	     Thread t1 = new Thread() {
	    	public void run() {
	    		synchronized(ahri) {
	    			System.out.println("t1 �Ѿ�ռ�� �˾�β���� ");
	    			try {
	    				Thread.sleep(1000);
	    			}catch(InterruptedException e) {
	    				e.printStackTrace();
	    			}
	    			System.out.println("t1 ���Ի�ȡ  ����");
	    			System.out.println("�ȴ���");
	    			
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
		    			System.out.println("t2 �Ѿ�ռ�� �˰��� ");
		    			try {
		    				Thread.sleep(1000);
		    			}catch(InterruptedException e) {
		    				e.printStackTrace();
		    			}
		    			System.out.println("t2���Ի�ȡ��β����");
		    			System.out.println("�ȴ���");
		    			
		    			synchronized(ahri) {
		    				System.out.println(" do something !");
		    			}
		    		}
		    	}
		     };
		     t2.start();
	}
}