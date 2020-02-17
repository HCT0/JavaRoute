package SetFramework;
import java.util.*;
import LOL.*;

public class ArrayListGeneric {
	public static void main(String[] args) {
		//没有使用泛型的情况
		
		ArrayList heros = new ArrayList();
		heros.add(new Hero("gailun"));
		heros.add(new Item("LongKnife"));
		//存在的问题:太多的数据,无法识别每一个对象的类型
		//在进行对象的转型的时候,会出现问题
		
		//使用泛型的情况
		ArrayList<Hero> generic = new ArrayList();
		generic.add(new Hero("timo"));
		//可与保存泛型的子类
		generic.add(new Adhero());
	}
}
