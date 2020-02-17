package ObjectAndQuote;

public class equalsTest {
public String name;
int hp;
public boolean equals(Object o){//第一层返回结果是判断是不是这个类型
	//先判断类型
	if(o instanceof equalsTest){
		equalsTest et = (equalsTest)o;//将object 的数据类型进行转换，父类对象转子类，需强制转换
		return this.hp == et.hp;//然后直接返回的对比结果
		
	}else
	return false;
}
public static void main(String[] args) {
	equalsTest et1 = new equalsTest();
	equalsTest et2 = new equalsTest();
	equalsTest et3 = new equalsTest();
	et1.hp = 300;
	et2.hp = 400;
	et3.hp = 300;
	System.out.println(et1.equals(et2));
	System.out.println(et1.equals(et3));
	System.out.println(et1==et2);
	System.out.println(et3==et2);//对象判地址,变量判断内容
	
}
}
