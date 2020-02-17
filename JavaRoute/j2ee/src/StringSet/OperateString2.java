package StringSet;
/*
 * 统计一句话有多少个p开头的单词
 * 
 * 
 * 
 */
public class OperateString2 {
	public static void main(String[] args) {
		String str = "peter piper picked a peck of pickled peppers";
		int sum=0;
		
		String [] strs = str.split(" ");//先分开字符串
		for(int i=0;i<strs.length;i++) {
			char chars[] = strs[i].toCharArray();//将每一个字符串转换为字符数组
			if(chars[0] == 'p')//对字符数组的第一个字符进行判断
				sum++;
		}
		System.out.printf("总共有%d个以p开头的单词",sum);
		}
		
}
