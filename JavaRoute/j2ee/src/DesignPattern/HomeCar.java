package DesignPattern;
/*
 * ��̬�����ʵ��=== �̳е�ʵ�־�̬����
 * ����һ���ӿ� interface
 * ʵ��һ���ӿ� ���� car
 * �̳������ car ==���������
 * 
 * 
 * */
public class HomeCar extends Car{

	public void move() {
		System.out.println("HomeCar��д����car��move����");		
		super.move();//���ø����move����
	}
	
	public static void main(String[] args) {
		HomeCar m = new HomeCar();
		m.move();
	}
	
}
