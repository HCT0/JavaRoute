package StringSet;

import Exception.IndexIsNagetiveException;
import Exception.IndexLsOutOfRangeException;

public interface MyStringBuffer {
	 public void append(String str); //追加字符串
	    public void append(char c);  //追加字符
	    public void insert(int pos,char b) throws IndexLsOutOfRangeException, IndexIsNagetiveException; //指定位置插入字符
	    public void insert(int pos,String b) throws IndexIsNagetiveException, IndexLsOutOfRangeException; //指定位置插入字符串
	    public void delete(int start); //从开始位置删除剩下的
	    public void delete(int start,int end) throws IndexIsNagetiveException, IndexLsOutOfRangeException; //从开始位置删除结束位置-1
	    public void reverse(); //反转
	    public int length(); //返回长度
}
