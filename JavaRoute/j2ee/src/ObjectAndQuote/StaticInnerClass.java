package ObjectAndQuote;

public class StaticInnerClass {
	private static void battleWin() {
		System.out.println("battle win");
	}
	//��̬�ڲ���
	static class Sic {
		public void sicTestMethod() {
			StaticInnerClass.battleWin();//ʹ���ⲿ��ľ�̬����
			System.out.println("static battle Win");
		}
	}
	public static void main(String[] args) {
		StaticInnerClass.Sic sic = new StaticInnerClass.Sic();//����һ����̬�ڲ����ʵ������
		sic.sicTestMethod();//���þ�̬�ڲ���ķ���
	}
}
