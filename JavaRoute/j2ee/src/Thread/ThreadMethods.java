package Thread;
import LOL.*;

public class ThreadMethods extends Thread{
	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread() {
			public void run() {
				int second =0;
				while(true) {
					try {
						Thread.sleep(1000);//线程暂停
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("总计玩了"+second++);
				}
			}
		};

		t.join();//在主线程中执行
			   	
		final Hero gareen = new Hero();
        gareen.name = "盖伦";
		gareen.hp = 6160;
		gareen.damage = 1;
		  
		final Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 3000;
		teemo.damage = 1;
		          
		final Hero bh = new Hero();
		bh.name = "赏金猎人";
		bh.hp = 5000;
		bh.damage = 1;
		          
		final Hero leesin = new Hero();
		leesin.name = "盲僧";
		leesin.hp = 4505;
		leesin.damage = 1;
		          
		Thread t1= new Thread(){
			public void run(){		 
				while(!teemo.isDead()){
					Thread.yield();//临时停止，可以让其他线程占用cpu
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
		         
		t1.setPriority(Thread.MAX_PRIORITY);//设置优先级
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
		
		//守护线程
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
