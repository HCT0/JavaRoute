package ObjectAndQuote;

public abstract class AnonymousClass {
	public abstract void attack();
	
	public static void main(String[] args) {
		
		
		final int test =10;
		AnonymousClass ac = new AnonymousClass() {//�������ʵ����
			public void attack() {
				System.out.println("�µ�����");
				System.out.printf("%d",test);//������ʹ���ⲿ�ľֲ�����
			}
		};
		ac.attack();
	}
}
