package DesignPattern;

import java.lang.reflect.Method;

import java.lang.reflect.*;
/*
 * 
 * CGLIB��̬����
 * 
 * 
 * */
public class CglibProxy implements MethodInterceptor {
	//ά��Ŀ�����
	private Object target;
	public CglibProxy(Object target) {
		this.target = target;
	}
	
	//��Ŀ�꺯�������������
	public Object getProxyInstance() {
		//������
		Enhancer en = new Enhancer();
		//���ø���
		en.setSuperclass(target.getClass());
		//���ûص�����
		en.setCallback(this);
		return en.create();	
	}
	
	//@Override
	public Object intercept(Object obj,Method method,Object[] args,Method proxy) throws Throwable{
		//ִ��Ŀ�����ķ���
		//Object returnValue = new method.invoke(target , args);
		Object returnValue = null ; 
		return returnValue;
	}
	
	
	
}
