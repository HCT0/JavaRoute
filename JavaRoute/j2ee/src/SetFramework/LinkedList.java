package SetFramework;
import java.util.*;
import LOL.*;

public class LinkedList {
	public static void main(String[] args) {
		LinkedList ll =new LinkedList();
		//在后面加入数据
		ll.addLast(new Hero("hero1"));
	    ll.addLast(new Hero("hero2"));
	    ll.addLast(new Hero("hero3"));
	    System.out.println(ll);
	    //在前面加入数据
	    ll.addFirst(new Hero("heroX"));
	    //查看最前面的英雄
        System.out.println(ll.getFirst());
        //查看最后面的英雄
        System.out.println(ll.getLast());
        
        //取出会删除这个数据
        //取出最前面的英雄
        System.out.println(ll.removeFirst());
        //取出最后面的英雄
        System.out.println(ll.removeLast());
         
	    
	    
	}

	
	
	
	
	
	
	private char[] removeLast() {
		// TODO Auto-generated method stub
		return null;
	}







	private char[] removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}







	private char[] getLast() {
		// TODO Auto-generated method stub
		return null;
	}







	private char[] getFirst() {
		// TODO Auto-generated method stub
		return null;
	}







	private void addFirst(Hero hero) {
		// TODO Auto-generated method stub
		
	}

	private void addLast(Hero hero) {
		// TODO Auto-generated method stub
		
	}
	
}
