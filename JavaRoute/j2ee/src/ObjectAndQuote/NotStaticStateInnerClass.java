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
		nssic.name = "��һ�����";
		Nssic nssic2 =  nssic.new Nssic();//�Ǿ�̬�ڲ���Ĵ���
		nssic2.name = "�Ǿ�̬�ڲ��������";
	}
}
