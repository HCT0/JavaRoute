package StringSet;
/*
 * 
 * ���ַ�����ɴ�Сд�����ģʽ
 * 
 * */
public class OperateString3 {
	public static void main(String[] args) {
		String str = "lengendary";
		char [] chars  = str.toCharArray();
		for(int i=0;i<chars.length;i++) {
			if(i%2 == 0)
				chars[i] -= 32;
		}
		str = new String(chars);
		System.out.println(str);
	}
}
