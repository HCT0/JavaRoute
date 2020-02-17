package ObjectAndQuote;

public class ObjectMethods {

	public String name ;
	public String toString() {
		return name;
	}
	public void finalize() {
		System.out.println("调用finalize，对象被回收");
	}
	public static void main(String[] args) {
		ObjectMethods om = new ObjectMethods();
		om.name = "盖伦";
		System.out.println(om.toString());
		//直接打印对象就是打印对象的toString()的返回值
		System.out.println(om);
		
		for(int i=0;i<1000;i++){//不断的创建对象，就会回收，则会调用finalize 方法 
			om = new ObjectMethods();
		}
	}
}
