package DesignPattern;
/*
 * 静态代理模式
 * 实现接口的一个类  目标对象
 * 
 * 
 * */
public class Car implements Moveable {
	
	//重写接口的ove方法
	@Override
	public void move() {
		System.out.println("目标对象 Car 实现接口moveable 的move方法");
	}

}
