package DesignPattern;
/*
 * ��̬����ģʽ
 *�������
 * 
 * */
public class PrivateCar implements Moveable {
	
	//����Ŀ�����
	private Moveable target;
	public PrivateCar(Moveable target) {
		this.target = target;
	}
	//ʵ�ֽӿڷ���
	public void move(){
		target.move();
	}
	
}
