package StringSet;

public class CreateString {
	public static void main(String[] args) {
		String str1 = "����";//�������������д���
		String str2 = new String("��Ī");//���ù��캯������
		String str3 = str1 + str2;//ʹ��+ �������
		char [] cs = {'a','b','d'};
		String str4 = new String(cs);//ͨ���ַ�������д���
		String str5 ="";//������
		System.out.println(str4.length());

		System.out.println(str4.charAt(1));
		
	}
}
