package SetFramework;
import java.util.*;
import LOL.*;
public class ArrayListMethod {
	public static void main(String[] args) {
		ArrayList heros = new ArrayList();
		
		//ArrayList������
		heros.add(new Hero("gailun"));
		heros.add(1,new Hero("timo"));//��ָ��λ�����Ӷ���
		Hero h1 = new Hero("MissFortune");
		heros.add(h1);
		System.out.println(heros.contains(h1));
		Hero h2 = new Hero("timeMaker");
		System.out.println(heros.contains(h2));	
		
		//��ȡָ��λ�õĶ���,Խ��Ҳ�����
		System.out.println(heros.get(1));
		
		//��ȡ����ĵ�λ��
		System.out.println(heros.indexOf(h1));
		
		//ɾ������
		heros.remove(1);//����λ��ɾ��
		heros.remove(h1);//���ݶ���ɾ��
		System.out.println(heros.contains(h1));
		
		//�滻ָ��λ�õĶ���
		heros.set(0, h2);
		System.out.println(heros.contains(h2));
		
		//��ȡ��С
		System.out.println(heros.size());
		
		//ת��Ϊ����,��Ҫָ��toArray�Ĳ�����ʲô����
		Hero [] heroAll = (Hero[]) heros.toArray(new Hero[] {});
		
		//��������������ȫ���������� addAll
		ArrayList heros2 = new ArrayList();
		ArrayList heros3 = new ArrayList();
		for(int i=0 ; i<5;i++){
			heros2.add(new Hero("timo"+i));
		}
		System.out.println(heros3.size());
		heros3.addAll(heros2);
		System.out.println(heros3.size());
		
		//����������
		heros3.clear();
		System.out.println(heros3.size());
		
		
	}
}