package StringSet;

public class StringBuffer {
	public static void main(String[] args) {
		String str1 = new String("abc");
		//����String ����StringBuffer����
		StringBuffer str2 = new StringBuffer();
		str2.append("a");
		str2.delete(1,100);//ɾ��a ��b ֮�� a��b��
		str2.insert(3,10);//���뵽ĳ��λ�ã����Ǹ���
		str2.reverse();//��ת�ַ���
		System.out.println(str2.length());//�ַ����ĳ���
		System.out.println(str2.capacity());//ά����������ܳ���
		
	}

	private char[] capacity() {
		// TODO Auto-generated method stub
		return null;
	}

	private char[] length() {
		// TODO Auto-generated method stub
		return null;
	}

	private void reverse() {
		// TODO Auto-generated method stub
		
	}

	private void insert(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void delete(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	void append(String string) {
		// TODO Auto-generated method stub
		
	}
}	
