package StringSet;

public class StringPractice1 {
	public static void main(String[] args) {
	char [] c = new char[5];//����һ���ַ�����
	//0 ��48-57 A ��65-90 a ��97-122
	for(int i=0;i<5;i++){
		char c2 = (char) (Math.random()*122);
		if(Character.isLowerCase(c2)||Character.isDigit(c2)|| Character.isUpperCase(c2)){
			c[i] = c2;
		}
	}
	String str = new String(c);
	}
}
