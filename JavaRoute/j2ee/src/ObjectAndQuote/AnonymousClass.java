package ObjectAndQuote;

public abstract class AnonymousClass {
	public abstract void attack();
	
	public static void main(String[] args) {
		
		
		final int test =10;
		AnonymousClass ac = new AnonymousClass() {//匿名类的实例化
			public void attack() {
				System.out.println("新的内容");
				System.out.printf("%d",test);//匿名类使用外部的局部变量
			}
		};
		ac.attack();
	}
}
