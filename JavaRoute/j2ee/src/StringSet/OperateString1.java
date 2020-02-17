package StringSet;
/**
 * 
 *每个单词的首字母都转换为大写 
 */
public class OperateString1 {
	public static void main(String[] args) {
		String str = "let there be light";
		String []strs =str.split(" ");//根据空格进行划分
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
