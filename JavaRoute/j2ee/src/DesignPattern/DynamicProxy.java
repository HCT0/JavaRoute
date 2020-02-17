package DesignPattern;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//导入实现动态代理的API
import java.lang.reflect.Proxy;
/*动态代理 代理对象
 * 实现的思路，使用api，进行对目标对象的方法的调用
 * 使用getProxyInstance 的 proxy.newProxyInstance的返回值进行调用
 * 
 * 
 * */
public class DynamicProxy {
	private Object target;//维护目标对象
	public DynamicProxy(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),//newProxyInstace 的参数1
				target.getClass().getInterfaces(), //newProxrInstance 的参数2
				new InvocationHandler() {
					@Override
					public Object invoke(Object arg0, Method method, Object[] args) throws Throwable {
						//利用反射执行目标对象的方法
						Object returnValue = method.invoke(target, args); 
						return returnValue;
					}
				} 
		);//newProxyInstance 的参数3
	}
	
	
}
