package NumberAndString;

public class NumberAndStringPractice {
	public static void main(String[] args) {
		float f = 3.14f;
		String str = String.valueOf(f);//����ת��Ϊ�ַ���
		f = Float.parseFloat(str);
		
		String str2 = "3.14";
		//String str3 = "3.1a4";//�ᱨ��
		
		System.out.println(Float.parseFloat(str2));
	}
}