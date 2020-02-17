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
		Hero h1 = new Hero("盖伦");
		// 泛型的T的使用,在声明的时候是什么类型，就是什么类型
		GenericStack <Hero> myStack = new GenericStack<Hero>(); 
		myStack.add(h1);
		//myStack.add(i);//类型不同，无法插入
		
		GenericStack <Item> itemStack = new GenericStack<Item>();
		itemStack.add(i);
		
		//itemStack.add(h1);//类型不匹配，无法插入
		
	}
}
