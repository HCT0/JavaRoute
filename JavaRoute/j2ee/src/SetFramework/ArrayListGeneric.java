package SetFramework;
import java.util.*;
import LOL.*;

public class ArrayListGeneric {
	public static void main(String[] args) {
		//û��ʹ�÷��͵����
		
		ArrayList heros = new ArrayList();
		heros.add(new Hero("gailun"));
		heros.add(new Item("LongKnife"));
		//���ڵ�����:̫�������,�޷�ʶ��ÿһ�����������
		//�ڽ��ж����ת�͵�ʱ��,���������
		
		//ʹ�÷��͵����
		ArrayList<Hero> generic = new ArrayList();
		generic.add(new Hero("timo"));
		//���뱣�淺�͵�����
		generic.add(new Adhero());
	}
}