package SetFramework;
import LOL.*;
import java.util.*;
public class ConllectionsMethods {
	public static void main(String[] args) {
		List l = new List();
		for(int i =0;i<10;i++) {
			l.add(i);
		}
		//使List的数据反转
		//Conllections.reverse(l);
		//使List 的数据混淆
		//Conllections。shuffle(l);
		
		//使List 的数据排序
		//Conllection.sort(l);
		
		//交换list 的两个位置的数据
		//Conllections.swap(l,1,2);
		
		//使list 的数据进行指定长度的移动
		//Conllections.rotate(l,2);
		
		//使list 线程安全化,
		//List synchronizedl = Conllections。synchronizedList(l);
	}
}
