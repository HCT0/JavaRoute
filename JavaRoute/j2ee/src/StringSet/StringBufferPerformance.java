package StringSet;

public class StringBufferPerformance {
	public static void main(String[] args) {
		char chars[] =new char[10];
		for(int i=0;i<chars.length;i++) {
			char c = (char) (Math.random()*122);
			if(Character.isDigit(c) || Character.isLowerCase(c) || Character.isUpperCase(c) )
				chars[i] = c ;
		}
		String str = new String(chars);
		StringBuffer sb = new StringBuffer();
		float t1 = System.currentTimeMillis();
		for(int n = 0;n<1000;n++) {
			str+=str;
		}
		float t2 = System.currentTimeMillis()-t1;
		System.out.println("使用字符串+的时间为："+ t2);
		t1 =System.currentTimeMillis();
		for(int n = 0;n<1000;n++) {
			sb.append(str);
		}
		t2 = System.currentTimeMillis();
		System.out.println("使用StringBuffer appaend的时间为："+ t2);
	}
}
