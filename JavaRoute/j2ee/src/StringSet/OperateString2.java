package StringSet;
/*
 * ͳ��һ�仰�ж��ٸ�p��ͷ�ĵ���
 * 
 * 
 * 
 */
public class OperateString2 {
	public static void main(String[] args) {
		String str = "peter piper picked a peck of pickled peppers";
		int sum=0;
		
		String [] strs = str.split(" ");//�ȷֿ��ַ���
		for(int i=0;i<strs.length;i++) {
			char chars[] = strs[i].toCharArray();//��ÿһ���ַ���ת��Ϊ�ַ�����
			if(chars[0] == 'p')//���ַ�����ĵ�һ���ַ������ж�
				sum++;
		}
		System.out.printf("�ܹ���%d����p��ͷ�ĵ���",sum);
		}
		
}
