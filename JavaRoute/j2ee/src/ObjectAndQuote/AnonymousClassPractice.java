package ObjectAndQuote;

public abstract class AnonymousClassPractice {
	public abstract boolean test();
	public static void main(String[] args) {
		AnonymousClassPractice acp = new AnonymousClassPractice() {
			public boolean test() {//ʹ�����������ʵ����
				return false;
			}
		};
		System.out.println(acp.test());//������
	}
}
