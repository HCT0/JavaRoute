package DesignPattern;

public class DynamicProxy2Test {
	public static void main(String[] args) {
		//����Ŀ�����
		UserDao target = new UserDao();
		//����������󣬲��ҽ�������
		UserDao proxy = (UserDao) new CglibProxy(target).getProxyInstance();
		proxy.save();//���÷���
	}
}
