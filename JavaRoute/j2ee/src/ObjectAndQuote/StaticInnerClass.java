package ObjectAndQuote;

public class StaticInnerClass {
	private static void battleWin() {
		System.out.println("battle win");
	}
	//静态内部类
	static class Sic {
		public void sicTestMethod() {
			StaticInnerClass.battleWin();//使用外部类的静态方法
			System.out.println("static battle Win");
		}
	}
	public static void main(String[] args) {
		StaticInnerClass.Sic sic = new StaticInnerClass.Sic();//创建一个静态内部类的实例对象
		sic.sicTestMethod();//调用静态内部类的方法
	}
}
