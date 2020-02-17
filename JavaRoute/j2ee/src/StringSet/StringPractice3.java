package StringSet;

public class StringPractice3 {
	public static void main(String[] args) {
		char [] c = new char[3];//定义一个字符数组
		for(int i=0;i<c.length;i++){
			char c2 = (char) (Math.random()*122);
			if(Character.isLowerCase(c2)||Character.isDigit(c2)|| Character.isUpperCase(c2)){
				c[i] = c2;
			}
		}
		String str = new String(c);
	
		char [] c2=  new char[3];
		char c3 ;
		for(int i=0;i<3;i++){
			c3 = (char)(Math.random()*122);
			while(true) {
				if(c3 == str.charAt(i) )
					c2[i] = c3;
				break;
			}
		}
	
	
	}
}
