package DesignPattern;
/*
 * 
 * 单例模式中的对象为什么是static
 * 1 为了让类名+方法来返回实例，不能使用创建对象来调用方法，因为单例不能在创建，否则就不是单例模式了
 * 2 为了让类名+方法访问，方法为static
 * 3 方法为static ，只有对象为static,方法才能使用
 * 
 * **/
/*
 * 第一种方式
 *饿汉式，在加载类的时候创建实例，加载的时候较慢，但是获取对象块，线程安全
 * */
public class SingletonPattern {
	private SingletonPattern() {};//构造函数私有化
	private  static SingletonPattern instance =  new SingletonPattern();
	public SingletonPattern getInstance() {
		return instance;
	}	
}
/*
*
*第二种，饱汉式
*
*在类的记载的时候不创建对象,加载类的时候较快，但是获取对象的时候较慢，线程不安全，在多线程的情况下，还是会传概念多个对象
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
*第三种，双重检测，加入了对类的代码块的同步
*
*
public class SingletonPattern{

	private SingletonPattern(){};
	private static SingletonPattern instance;
	public static SingletonPattern getInstance (){
		if( null == instance){
			synchronized(SingletonPattern.class){
				instance = new SingletonPattern();//在对象为空的时候，进行方法的同步，然后再返回对象
			}
			return instance;
		}
	}	
}
*/

/*
 
 * 静态内部类
	通过在静态内部了实现，然后在返回方法进行调用
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
 * 第五种，静态块的方法
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
 * 第六种为饱汉式去掉syschronized
 * 
 * */






















