package StringSet;

public class StringPractice2 {
	public static void main(String[] args) {
		char [] c = new char[5];//定义一个字符数组
		//0 是48-57 A 是65-90 a 是97-122
		String []str = new String[8];
		
		for(int n=0;n<8;n++){
			for(int i=0;i<5;i++){
				char c2 = (char) (Math.random()*122);
				if(Character.isLowerCase(c2)||Character.isDigit(c2)|| Character.isUpperCase(c2)){
					c[i] = c2;
				}
			}
			str[n] = new String(c);
		}
		
		for(int i=8;i>=0;i--) {
	        for(int j=0;j<=i;j++){
	            if(Character.toLowerCase(str[j].charAt(0))>Character.toLowerCase(str[j+1].charAt(0))){
	                String temp =null;
	                temp = str[j];
	                str[j]=str[j+1];
	                str[j+1]=temp;
	            }
	        }
	    }
		
		
	}
}
