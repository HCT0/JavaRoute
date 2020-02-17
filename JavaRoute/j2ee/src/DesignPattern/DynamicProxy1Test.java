package DesignPattern;

public class DynamicProxy1Test {
	public static void main(String[] args) {
		//目标对象
		Moveable target  = new Car();
		System.out.println(target.getClass());
		//创建代理对象,并且建立代理关系
		Moveable proxy = (Moveable) new DynamicProxy(target).getProxyInstance();
		System.out.println(target.getClass());
		//代理对象调用目标对象的方法
		proxy.move();
	}
}