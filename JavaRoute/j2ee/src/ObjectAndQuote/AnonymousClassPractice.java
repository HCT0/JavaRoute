package ObjectAndQuote;

public abstract class AnonymousClassPractice {
	public abstract boolean test();
	public static void main(String[] args) {
		AnonymousClassPractice acp = new AnonymousClassPractice() {
			public boolean test() {//使用匿名类进行实例化
				return false;
			}
		};
		System.out.println(acp.test());//输出结果
	}
}
