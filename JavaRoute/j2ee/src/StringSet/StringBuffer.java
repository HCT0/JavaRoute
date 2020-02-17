package StringSet;

public class StringBuffer {
	public static void main(String[] args) {
		String str1 = new String("abc");
		//根据String 创建StringBuffer对象
		StringBuffer str2 = new StringBuffer();
		str2.append("a");
		str2.delete(1,100);//删除a 到b 之间 a闭b开
		str2.insert(3,10);//加入到某个位置，不是覆盖
		str2.reverse();//反转字符串
		System.out.println(str2.length());//字符串的长度
		System.out.println(str2.capacity());//维护的数组的总长度
		
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
