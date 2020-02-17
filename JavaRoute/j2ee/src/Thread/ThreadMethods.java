package Thread;
import LOL.*;

public class ThreadMethods extends Thread{
	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread() {
			public void run() {
				int second =0;
				while(true) {
					try {
						Thread.sleep(1000);//�߳���ͣ
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("�ܼ�����"+second++);
				}
			}
		};

		t.join();//�����߳���ִ��
			   	
		final Hero gareen = new Hero();
        gareen.name = "����";
		gareen.hp = 6160;
		gareen.damage = 1;
		  
		final Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 3000;
		teemo.damage = 1;
		          
		final Hero bh = new Hero();
		bh.name = "�ͽ�����";
		bh.hp = 5000;
		bh.damage = 1;
		          
		final Hero leesin = new Hero();
		leesin.name = "äɮ";
		leesin.hp = 4505;
		leesin.damage = 1;
		          
		Thread t1= new Thread(){
			public void run(){		 
				while(!teemo.isDead()){
					Thread.yield();//��ʱֹͣ�������������߳�ռ��cpu
					gareen.attackHero(teemo);
		        }              
			}
		};
		          
		Thread t2= new Thread(){
			public void run(){
				while(!leesin.isDead()){
					bh.attackHero(leesin);
				}              
			}
		};
		         
		t1.setPriority(Thread.MAX_PRIORITY);//�������ȼ�
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
		
		//�ػ��߳�
		Thread daemon1= new Thread() {
			public void run() {
				int second =0;
				while(true) {
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		daemon1.setDaemon(true);
		daemon1.start();
		    
	}
}