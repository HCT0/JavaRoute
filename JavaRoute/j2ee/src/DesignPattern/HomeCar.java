package DesignPattern;
/*
 * 静态代理的实现=== 继承的实现静态代理
 * 创建一个接口 interface
 * 实现一个接口 的类 car
 * 继承这个类 car ==代理对象类
 * 
 * 
 * */
public class HomeCar extends Car{

	public void move() {
		System.out.println("HomeCar重写父类car的move方法");		
		super.move();//调用父类的move方法
	}
	
	public static void main(String[] args) {
		HomeCar m = new HomeCar();
		m.move();
	}
	
}
