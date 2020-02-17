package j2ee;
//多态
//操作符多态
//类多态
public class Polymorphic {
public static void main(String[] args) {
	//操作符多态
	int i=5;
	int y=10;
	int k = i + y;//在+号两侧都是int类型数数据的时候，则是加法
	System.out.println(k);
	String s = "sdfa";
	String c = s+i;//在+号一侧有字符串，则编程的字符串连接
	System.out.println(c);

}
}
