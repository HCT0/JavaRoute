package LOL;

public class Item {
	/*private Item() {};//�����캯��˽�л�
	private static Item itemInstance;
	public static Item getInstance() {
		if(null == itemInstance)//����ʽ
			itemInstance = new Item();
		return itemInstance;
	}*/
	String name;
	int price;
	public Item(String name){
	        this.name = name;
	    }
	public Item(){
       }
	     
	
	//public abstract boolean disposable();//����һ�����󷽷�
	
	//��дitem��toString ����
	public String toString(){
		return name+price;
	}
	//��дitem��finalize����
	public void finalize() {
		System.out.println("��ǰ�������ڱ�����");
	}
	public boolean equals(Object o) {
		if(o instanceof Item) {//�ж�����
			Item i =(Item) o;
			return i.price == this.price;//ͨ���۸�����ж�
		}else
		return false;
	
	}
	
	
	
	public void buy() {
		System.out.println("����");
	}
	
	public void effect() {
		System.out.println("��Ʒʹ���Ժ�,������Ч��");
	}

public static void mian(String args[]) {
	Item bloodBottem = new Item();
	Item shose = new Item();
	Item longKnife = new Item();
	bloodBottem.name = "Ѫƿ";
	bloodBottem.price = 50;
	shose.name = "��Ь";
	shose.price = 300;
	longKnife.name = "����";
	longKnife.price  = 350;
	
}
}

