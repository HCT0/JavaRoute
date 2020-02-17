package DesignPattern;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//����ʵ�ֶ�̬�����API
import java.lang.reflect.Proxy;
/*��̬���� �������
 * ʵ�ֵ�˼·��ʹ��api�����ж�Ŀ�����ķ����ĵ���
 * ʹ��getProxyInstance �� proxy.newProxyInstance�ķ���ֵ���е���
 * 
 * 
 * */
public class DynamicProxy {
	private Object target;//ά��Ŀ�����
	public DynamicProxy(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),//newProxyInstace �Ĳ���1
				target.getClass().getInterfaces(), //newProxrInstance �Ĳ���2
				new InvocationHandler() {
					@Override
					public Object invoke(Object arg0, Method method, Object[] args) throws Throwable {
						//���÷���ִ��Ŀ�����ķ���
						Object returnValue = method.invoke(target, args); 
						return returnValue;
					}
				} 
		);//newProxyInstance �Ĳ���3
	}
	
	
}
