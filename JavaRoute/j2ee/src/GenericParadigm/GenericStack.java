package GenericParadigm;
import LOL.*;
import java.util.*;
public class GenericStack<T> {
	LinkedList<T> ll = new LinkedList<T>();
	public void add(T t) {
		ll.add(t);
	}
	
	
	public static void main(String[] args) {
		Item i = new Item("dajian");
		Hero h1 = new Hero("����");
		// ���͵�T��ʹ��,��������ʱ����ʲô���ͣ�����ʲô����
		GenericStack <Hero> myStack = new GenericStack<Hero>(); 
		myStack.add(h1);
		//myStack.add(i);//���Ͳ�ͬ���޷�����
		
		GenericStack <Item> itemStack = new GenericStack<Item>();
		itemStack.add(i);
		
		//itemStack.add(h1);//���Ͳ�ƥ�䣬�޷�����
		
	}
}