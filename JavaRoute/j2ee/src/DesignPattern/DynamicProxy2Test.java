package DesignPattern;

public class DynamicProxy2Test {
	public static void main(String[] args) {
		//创建目标对象
		UserDao target = new UserDao();
		//创建代理对象，并且建立代理
		UserDao proxy = (UserDao) new CglibProxy(target).getProxyInstance();
		proxy.save();//调用方法
	}
}
