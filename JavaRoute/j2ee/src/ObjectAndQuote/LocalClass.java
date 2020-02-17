package ObjectAndQuote;

public abstract class LocalClass {
	String name;
	public abstract void getName();
	
	public static void main(String[] args) {
		
		class Lc extends LocalClass{//本地类的实现
			public void getName() {//实例化父类方法
				System.out.println("本地类");
			}
		}
		Lc lc = new Lc();
		lc.getName();
		System.out.println("本地类的主函数");
	}
}
