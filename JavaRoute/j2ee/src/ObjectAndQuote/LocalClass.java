package ObjectAndQuote;

public abstract class LocalClass {
	String name;
	public abstract void getName();
	
	public static void main(String[] args) {
		
		class Lc extends LocalClass{//�������ʵ��
			public void getName() {//ʵ�������෽��
				System.out.println("������");
			}
		}
		Lc lc = new Lc();
		lc.getName();
		System.out.println("�������������");
	}
}
