package GenericParadigm;
import java.util.*;
import LOL.*;
public class SuperGeneric {
	public static void main(String[] args) {
		ArrayList<? super Hero > objects = new ArrayList();
		objects.add(new Hero("gailun"));
		
		//���Խ�����Ȳ����ȥ��ֻ��ȡ������ʱ�򣬲�����
		objects.add(new Hero("timo"));
		objects.add(new Aphero());//Hero ������
		
		//�������
		System.out.println(objects.get(0));
		
		
		//��Ҫǿ��ת������Ϊ��֪����hero ����Object
		//ArrayList<Object > object1 = (ArrayList<Object>) objects;
		
		
		
	}
}