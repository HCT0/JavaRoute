package DesignPattern;

public class DynamicProxy1Test {
	public static void main(String[] args) {
		//Ŀ�����
		Moveable target  = new Car();
		System.out.println(target.getClass());
		//�����������,���ҽ��������ϵ
		Moveable proxy = (Moveable) new DynamicProxy(target).getProxyInstance();
		System.out.println(target.getClass());
		//����������Ŀ�����ķ���
		proxy.move();
	}
}