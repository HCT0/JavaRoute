package j2ee;
/**
 * �쳯��һ����ؤ�պ飬ȥ����ҪǮ
 * ��һ��Ҫ��1��Ǯ
 * �ڶ���Ҫ��2��Ǯ
 * ������Ҫ��4��Ǯ
 * ������Ҫ��8��Ǯ
 * �Դ�����
 *
 * ���⣺ ����ؤ��10�죬�����Ƕ��٣�
 */
public class ForBeger {
public static void main(String[] args) {
	int  sum=0;
	for(int i=0;i<=9;i++) {
		sum=(int) Math.pow(2, i)+sum;
	}
	System.out.print(sum);
}
}