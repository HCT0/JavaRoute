package DesignPattern;
/*
 * 
 * ����ģʽ�еĶ���Ϊʲô��static
 * 1 Ϊ��������+����������ʵ��������ʹ�ô������������÷�������Ϊ���������ڴ���������Ͳ��ǵ���ģʽ��
 * 2 Ϊ��������+�������ʣ�����Ϊstatic
 * 3 ����Ϊstatic ��ֻ�ж���Ϊstatic,��������ʹ��
 * 
 * **/
/*
 * ��һ�ַ�ʽ
 *����ʽ���ڼ������ʱ�򴴽�ʵ�������ص�ʱ����������ǻ�ȡ����飬�̰߳�ȫ
 * */
public class SingletonPattern {
	private SingletonPattern() {};//���캯��˽�л�
	private  static SingletonPattern instance =  new SingletonPattern();
	public SingletonPattern getInstance() {
		return instance;
	}	
}
/*
*
*�ڶ��֣�����ʽ
*
*����ļ��ص�ʱ�򲻴�������,�������ʱ��Ͽ죬���ǻ�ȡ�����ʱ��������̲߳���ȫ���ڶ��̵߳�����£����ǻᴫ����������
*
*
public class SingletonPattern{ 

	private SingletonPattern(){};
	private static SingletonPattern instance;
	privete SingletonPattern synchronized getInstance(){
		if(instance == null){
			return new SingletonPattern;
		}	
	}
	*/
/*
 * 
*
*�����֣�˫�ؼ�⣬�����˶���Ĵ�����ͬ��
*
*
public class SingletonPattern{

	private SingletonPattern(){};
	private static SingletonPattern instance;
	public static SingletonPattern getInstance (){
		if( null == instance){
			synchronized(SingletonPattern.class){
				instance = new SingletonPattern();//�ڶ���Ϊ�յ�ʱ�򣬽��з�����ͬ����Ȼ���ٷ��ض���
			}
			return instance;
		}
	}	
}
*/

/*
 
 * ��̬�ڲ���
	ͨ���ھ�̬�ڲ���ʵ�֣�Ȼ���ڷ��ط������е���
public class SingletonPattern(){

	private SingletonPattern(){};
	private static class Hinder(){
		private static final SingletonPattern instance= new Singleton();
	}
	public SingletonPattern(){
		return Hinder.isntance;
	}
}
*/
/*
 * �����֣���̬��ķ���
 * 
 * 
 * 
 *
 
 public class SingletonPattern (){
 
 private SingletonPattern(){};
 private  static SingletonPattern instance;
 public SingletonPattern getInstance(){
 	return instace;
 }
 static {
 	instance = new SingletonPattern(); }
 
 }
  
 * */

/*
 * ������Ϊ����ʽȥ��syschronized
 * 
 * */






















