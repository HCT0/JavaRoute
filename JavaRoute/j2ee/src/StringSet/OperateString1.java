package StringSet;
/**
 * 
 *ÿ�����ʵ�����ĸ��ת��Ϊ��д 
 */
public class OperateString1 {
	public static void main(String[] args) {
		String str = "let there be light";
		String []strs =str.split(" ");//���ݿո���л���
		for(String str2:strs) {
			System.out.println(str2);
		}
		for(int i=0;i<strs.length;i++) {
			char [] chars =strs[i].toCharArray();
			chars[0] = (char) (chars[0]-32);
			strs[i] = new String(chars);
		}
		for(String str2:strs) {
			System.out.print(str2+" ");
		}
	}
}
