package StringSet;
import Exception.*;
public class MyStringBufferRealize implements MyStringBuffer{
	String mystr = new String();
	int length =10;

	@Override
	public void append(String str) {
		mystr+=str;	
	}
	@Override
	public void append(char c) {
		mystr+=c;		
	}
	@Override
	public void insert(int pos, char b){  
			
		
		String str1 = mystr.substring(0,pos);
		String str2 = mystr.substring(pos,mystr.length());
		mystr = str1 + b + str2; 
		
	}
	@Override
	public void insert(int pos, String b)  throws IndexIsNagetiveException,IndexLsOutOfRangeException {
		if(pos<0)
			throw new IndexIsNagetiveException();
		if(b=="null")
			throw new NullPointerException();
		if(pos >length){
			throw new IndexLsOutOfRangeException();
		}
		String str1 = mystr.substring(0,pos);
		String str2 = mystr.substring(pos,mystr.length());
		mystr = str1 + b + str2; 
		
	}

	@Override
	public void delete(int start) {
		String str1 = mystr.substring(0,start);
		mystr = str1;
	}

	@Override
	public void delete(int start, int end) throws IndexIsNagetiveException,IndexLsOutOfRangeException {
		
		if(start >length) {
			throw new IndexLsOutOfRangeException();
		}
		if(start < 0 ) {
			throw new NullPointerException();
		}

		if(end >length) {
			throw new IndexLsOutOfRangeException();
		}
		if(end < 0 ) {
			throw new NullPointerException();	
		}
		if(end <=start ) {
			throw new IndexLsOutOfRangeException();	
		}
		
		
		String str1 = mystr.substring(0,start);
		String str2 = mystr.substring(end,mystr.length());
		mystr = str1 + str2;	
	}
	
	@Override
	public void reverse() {
		char chars [] = mystr.toCharArray();
		char c;
		for(int i = 0;i<chars.length;i++) {
			c =chars[i];
			chars[i] = chars[chars.length-i];
			chars[chars.length-i] =c;
		}
		mystr = new String(chars);		
	}
	@Override
	public int length() {
		char chars [] = mystr.toCharArray();
		return chars.length;
	}
	

}
