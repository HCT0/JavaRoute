package ObjectAndQuote;

public class equalsTest {
public String name;
int hp;
public boolean equals(Object o){//��һ�㷵�ؽ�����ж��ǲ����������
	//���ж�����
	if(o instanceof equalsTest){
		equalsTest et = (equalsTest)o;//��object ���������ͽ���ת�����������ת���࣬��ǿ��ת��
		return this.hp == et.hp;//Ȼ��ֱ�ӷ��صĶԱȽ��
		
	}else
	return false;
}
public static void main(String[] args) {
	equalsTest et1 = new equalsTest();
	equalsTest et2 = new equalsTest();
	equalsTest et3 = new equalsTest();
	et1.hp = 300;
	et2.hp = 400;
	et3.hp = 300;
	System.out.println(et1.equals(et2));
	System.out.println(et1.equals(et3));
	System.out.println(et1==et2);
	System.out.println(et3==et2);//�����е�ַ,�����ж�����
	
}
}
