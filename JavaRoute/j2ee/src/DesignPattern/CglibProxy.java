package DesignPattern;

import java.lang.reflect.Method;

import java.lang.reflect.*;
/*
 * 
 * CGLIB动态代理
 * 
 * 
 * */
public class CglibProxy implements MethodInterceptor {
	//维护目标对象
	private Object target;
	public CglibProxy(Object target) {
		this.target = target;
	}
	
	//给目标函数创建代理对象
	public Object getProxyInstance() {
		//工具类
		Enhancer en = new Enhancer();
		//设置父类
		en.setSuperclass(target.getClass());
		//设置回调函数
		en.setCallback(this);
		return en.create();	
	}
	
	//@Override
	public Object intercept(Object obj,Method method,Object[] args,Method proxy) throws Throwable{
		//执行目标对象的方法
		//Object returnValue = new method.invoke(target , args);
		Object returnValue = null ; 
		return returnValue;
	}
	
	
	
}
