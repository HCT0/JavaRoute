package StringSet;

import Exception.IndexIsNagetiveException;
import Exception.IndexLsOutOfRangeException;

public interface MyStringBuffer {
	 public void append(String str); //׷���ַ���
	    public void append(char c);  //׷���ַ�
	    public void insert(int pos,char b) throws IndexLsOutOfRangeException, IndexIsNagetiveException; //ָ��λ�ò����ַ�
	    public void insert(int pos,String b) throws IndexIsNagetiveException, IndexLsOutOfRangeException; //ָ��λ�ò����ַ���
	    public void delete(int start); //�ӿ�ʼλ��ɾ��ʣ�µ�
	    public void delete(int start,int end) throws IndexIsNagetiveException, IndexLsOutOfRangeException; //�ӿ�ʼλ��ɾ������λ��-1
	    public void reverse(); //��ת
	    public int length(); //���س���
}
