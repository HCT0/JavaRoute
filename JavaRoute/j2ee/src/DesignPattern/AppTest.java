package DesignPattern;

public class AppTest {
	public static void main(String[] args) {
		
		//创建目标对象
		Car target = new Car();
		//创建代理对象,并且建立代理关系
		PrivateCar proxy = new PrivateCar(target);
		proxy.move();//调用 代理对象的方法，代理对象的方法又在代理类中调用目标对象的方法
	}
}
/*
 * 
   静态代理的缺点：
 * 	一旦接口增加新的方法，那么，目标对象和代理对象都需要进行修改
  因为代理对象和目标对象实现相同的方法，会有很多的代理类
 * 
 * 
 * 
 * */