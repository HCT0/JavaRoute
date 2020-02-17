package j2ee;

public class ActionScope {
	int i = 1;
	public void method1(int i) {
		System.out.print(i);
	}
	public static void main(String args[]) {
		new ActionScope().method1(5);
	}
}
