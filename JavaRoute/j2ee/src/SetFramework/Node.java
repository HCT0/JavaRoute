package SetFramework;
/*
 * ������
 * ����˳���������
 * 
 * 
 * */
public class Node {
	public Node leftNode;
	public Node rightNode;
	public Object value;
	
	//ʵ�ֲ��뷽��
	public void add(Object v) {
		if(null == value)//���ֵ�ǿյ�
			value = v;
		else {
			if( (Integer)v >= (Integer)value ) {
				if(rightNode == null) 
					rightNode = new Node();
					rightNode.add(v);	
			}else {
				if(leftNode == null)
					leftNode =new Node();
				leftNode.add(v);
			}
		}
	}
	
	public static void main(String[] args) {
		int Random []  = new int[]{1,2,3,4,5,6,7,8,9,10};
		Node roots = new Node();
		
		for(int i=0;i<Random.length;i++) {
			roots.add(Random[i]);
		}
	}
}