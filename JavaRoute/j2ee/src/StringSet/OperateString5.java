package StringSet;
/*
 * �����һ���ַ��������ĸ��д
 * 
 * */
public class OperateString5 {
	public static void main(String[] args) {
		String str = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
		int location = str.lastIndexOf("two");
		System.out.println(location);
		char chars [] = str.toCharArray();
		chars[location] -=32;//Сд��ɴ�д
		System.out.println(new String(chars));
	
	}

}
