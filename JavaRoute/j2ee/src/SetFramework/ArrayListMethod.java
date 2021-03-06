package SetFramework;
import java.util.*;
import LOL.*;
public class ArrayListMethod {
	public static void main(String[] args) {
		ArrayList heros = new ArrayList();
		
		//ArrayList的增加
		heros.add(new Hero("gailun"));
		heros.add(1,new Hero("timo"));//在指定位置增加对象
		Hero h1 = new Hero("MissFortune");
		heros.add(h1);
		System.out.println(heros.contains(h1));
		Hero h2 = new Hero("timeMaker");
		System.out.println(heros.contains(h2));	
		
		//获取指定位置的对象,越界也会出错
		System.out.println(heros.get(1));
		
		//获取对象的的位置
		System.out.println(heros.indexOf(h1));
		
		//删除对象
		heros.remove(1);//根据位置删除
		heros.remove(h1);//根据对象删除
		System.out.println(heros.contains(h1));
		
		//替换指定位置的对象
		heros.set(0, h2);
		System.out.println(heros.contains(h2));
		
		//获取大小
		System.out.println(heros.size());
		
		//转换为数组,需要指定toArray的参数是什么类型
		Hero [] heroAll = (Hero[]) heros.toArray(new Hero[] {});
		
		//将其他的容器类全部加入其中 addAll
		ArrayList heros2 = new ArrayList();
		ArrayList heros3 = new ArrayList();
		for(int i=0 ; i<5;i++){
			heros2.add(new Hero("timo"+i));
		}
		System.out.println(heros3.size());
		heros3.addAll(heros2);
		System.out.println(heros3.size());
		
		//容器类的清空
		heros3.clear();
		System.out.println(heros3.size());
		
		
	}
}
