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
		
		//�����ķ�ʽ
		List list1 = getList(s);
		
		//Lambda �ķ�ʽ
		List list2 = getList(()->new ArrayList());
		
		//���ù�����
		List list3 = getList(ArrayList::new);
		
		
	}
	//static �����ڷ�����ֱ��ʹ����������
	private static  List getList(Supplier<List> s) {
		return s.get();
	}
}
