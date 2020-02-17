package LOL;

public class Item {
	/*private Item() {};//将构造函数私有化
	private static Item itemInstance;
	public static Item getInstance() {
		if(null == itemInstance)//懒汉式
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
	     
	
	//public abstract boolean disposable();//定义一个抽象方法
	
	//重写item的toString 方法
	public String toString(){
		return name+price;
	}
	//重写item的finalize方法
	public void finalize() {
		System.out.println("当前对象正在被回收");
	}
	public boolean equals(Object o) {
		if(o instanceof Item) {//判断类型
			Item i =(Item) o;
			return i.price == this.price;//通过价格进行判断
		}else
		return false;
	
	}
	
	
	
	public void buy() {
		System.out.println("购买");
	}
	
	public void effect() {
		System.out.println("物品使用以后,可以有效果");
	}

public static void mian(String args[]) {
	Item bloodBottem = new Item();
	Item shose = new Item();
	Item longKnife = new Item();
	bloodBottem.name = "血瓶";
	bloodBottem.price = 50;
	shose.name = "草鞋";
	shose.price = 300;
	longKnife.name = "长剑";
	longKnife.price  = 350;
	
}
}

