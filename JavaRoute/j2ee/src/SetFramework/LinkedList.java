package SetFramework;
import java.util.*;
import LOL.*;

public class LinkedList {
	public static void main(String[] args) {
		LinkedList ll =new LinkedList();
		//�ں����������
		ll.addLast(new Hero("hero1"));
	    ll.addLast(new Hero("hero2"));
	    ll.addLast(new Hero("hero3"));
	    System.out.println(ll);
	    //��ǰ���������
	    ll.addFirst(new Hero("heroX"));
	    //�鿴��ǰ���Ӣ��
        System.out.println(ll.getFirst());
        //�鿴������Ӣ��
        System.out.println(ll.getLast());
        
        //ȡ����ɾ���������
        //ȡ����ǰ���Ӣ��
        System.out.println(ll.removeFirst());
        //ȡ��������Ӣ��
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