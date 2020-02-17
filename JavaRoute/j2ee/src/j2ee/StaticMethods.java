package j2ee;

public class StaticMethods {
	public static void test(int i) {
		System.out.println(i);
	}
	public void test1() {
		test(10);
	}
	
	
	
	public static void main(String[] args) {
		StaticMethods sm  = new StaticMethods();
		sm.test1();
	}
}
