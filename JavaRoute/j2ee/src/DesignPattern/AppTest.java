package DesignPattern;

public class AppTest {
	public static void main(String[] args) {
		
		//����Ŀ�����
		Car target = new Car();
		//�����������,���ҽ��������ϵ
		PrivateCar proxy = new PrivateCar(target);
		proxy.move();//���� �������ķ������������ķ������ڴ������е���Ŀ�����ķ���
	}
}
/*
 * 
   ��̬�����ȱ�㣺
 * 	һ���ӿ������µķ�������ô��Ŀ�����ʹ��������Ҫ�����޸�
  ��Ϊ��������Ŀ�����ʵ����ͬ�ķ��������кܶ�Ĵ�����
 * 
 * 
 * 
 * */