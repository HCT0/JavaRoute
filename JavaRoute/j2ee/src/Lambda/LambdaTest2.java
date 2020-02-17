package Lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import LOL.*;
import java.util.*;

public class LambdaTest2 {
	
	public static void main(String[] args) {
	
		Supplier<List> s = new Supplier<List>() {
			public List get() {
				return new ArrayList();
			}
		};
		
		//正常的方式
		List list1 = getList(s);
		
		//Lambda 的方式
		List list2 = getList(()->new ArrayList());
		
		//引用构造器
		List list3 = getList(ArrayList::new);
		
		
	}
	//static 可以在方法中直接使用类名调用
	private static  List getList(Supplier<List> s) {
		return s.get();
	}
}
