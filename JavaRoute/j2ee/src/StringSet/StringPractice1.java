package StringSet;

public class StringPractice1 {
	public static void main(String[] args) {
	char [] c = new char[5];//定义一个字符数组
	//0 是48-57 A 是65-90 a 是97-122
	for(int i=0;i<5;i++){
		char c2 = (char) (Math.random()*122);
		if(Character.isLowerCase(c2)||Character.isDigit(c2)|| Character.isUpperCase(c2)){
			c[i] = c2;
		}
	}
	String str = new String(c);
	}
}
