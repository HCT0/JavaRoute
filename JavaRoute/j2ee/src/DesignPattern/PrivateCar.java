package DesignPattern;
/*
 * 静态代理模式
 *代理对象
 * 
 * */
public class PrivateCar implements Moveable {
	
	//接收目标对象
	private Moveable target;
	public PrivateCar(Moveable target) {
		this.target = target;
	}
	//实现接口方法
	public void move(){
		target.move();
	}
	
}
