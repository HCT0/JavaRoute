package j2ee;
/*
 * replace �������޸�ԭ�ַ�������ΪStrig �ǲ����Ըı�ģ�ֻ�᷵��һ���޸�һ�еĽ��
 * */
public class StringReplaceTest {	
	public static void main(String[] args) {
	String str = "this a test line";
	str.replace('a','e');
	System.out.println(str);
	System.out.println(str.replace('a','e'));
	
	}
}
