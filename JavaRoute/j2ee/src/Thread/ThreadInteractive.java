package Thread;
/*
 * �߳�֮��Ľ���
 * 1 while �ȴ�ʽ����
 * ȱ�㣺ռ��cpu,Ӱ������
 * 
 * */
import LOL.*;
public class ThreadInteractive {
	public static void main(String[] args) {

        final Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 616;
        
        Thread t1 = new Thread() {
        	public void run() {
        		while(true) {
        			while(gareen.hp == 1) {
        				continue;
        			}
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
        
        Thread t2 = new Thread() {
        	public void run() {
        		while(true) {
        			gareen.recover();
        			System.out.printf("t2 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.name,gareen.name,gareen.hp);
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