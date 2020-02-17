package GenericParadigm;
import java.util.*;

/*
 * 根据数字类的知识，设计一个集合，这个集合里即可以放整数，也可以放浮点数，但是不能放字符串
 * 
 * 
 * 
 * */
public class GenericParadigm {
	public static void main(String[] args) {
		ArrayList<Number> al = new ArrayList<Number>();
		//可与存放整数
		al.add(1);
		//存放浮点数
		al.add(1.2f);
		//无法存储字符串】
		//al.add("asdf");
	}
}
