package ObjectAndQuote;

public class NotStaticStateInnerClass {
	String  name;
	public String getName() {
		return name;
	};
	class Nssic{
		String name;
		public String getName() {
			return name;
		}
	}
	public static void main(String[] args) {
		NotStaticStateInnerClass nssic = new NotStaticStateInnerClass();
		nssic.name = "第一层的类";
		Nssic nssic2 =  nssic.new Nssic();//非静态内部类的创建
		nssic2.name = "非静态内部类的名字";
	}
}
