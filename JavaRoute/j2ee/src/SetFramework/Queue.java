package SetFramework;
import java.util.*;

import LOL.Hero;
public class Queue {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		Queue q = new Queue();
		
		   
        //���ڶ��е������
        System.out.print("��ʼ�����У�\t");
        q.offer(new Hero("Hero1"));
        q.offer(new Hero("Hero2"));
        q.offer(new Hero("Hero3"));
        q.offer(new Hero("Hero4"));
        
        //ȡ����һ��Hero,FIFO,�Ƚ��ȳ�
        //ȡ����ɾ������
         Hero h = q.poll();
        System.out.println(h);
        System.out.print("ȡ����һ��Ԫ��֮��Ķ���:\t");
        System.out.println(q);
         
        //�ѵ�һ���ó�����һ�������ǲ�ȡ����
        //�鿴����ɾ������
        h=q.peek();
        System.out.print("�鿴peek()��һ��Ԫ��:\t");
        System.out.println(h);
        System.out.print("�鿴�����ᵼ�µ�һ��Ԫ�ر�ȡ����:\t");
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
