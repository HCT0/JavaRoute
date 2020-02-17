package SetFramework;
import java.util.*;

import LOL.Hero;
public class Queue {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		Queue q = new Queue();
		
		   
        //加在队列的最后面
        System.out.print("初始化队列：\t");
        q.offer(new Hero("Hero1"));
        q.offer(new Hero("Hero2"));
        q.offer(new Hero("Hero3"));
        q.offer(new Hero("Hero4"));
        
        //取出第一个Hero,FIFO,先进先出
        //取出会删除数据
         Hero h = q.poll();
        System.out.println(h);
        System.out.print("取出第一个元素之后的队列:\t");
        System.out.println(q);
         
        //把第一个拿出来看一看，但是不取出来
        //查看不会删除数据
        h=q.peek();
        System.out.print("查看peek()第一个元素:\t");
        System.out.println(h);
        System.out.print("查看并不会导致第一个元素被取出来:\t");
        System.out.println(q);
        
        
        
          
	}

	private Hero peek() {
		// TODO Auto-generated method stub
		return null;
	}

	private Hero poll() {
		// TODO Auto-generated method stub
		return null;
	}

	private void offer(Hero hero) {
		// TODO Auto-generated method stub
		
	}
}
