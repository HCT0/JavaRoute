package LOL;

public class Adhero extends Hero implements AD,Mortal{
	int moveSpeed = 300;
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	
	public void useItem(Item i) {
		System.out.println("Adhero 使用了 Item");
		super.useItem(i);
	}
	//当父类没有无参构造函数的时候,使用super显示的调用父类的有参构造方法
	public Adhero() {//会隐藏的调用父类的无参构造方法
		System.out.println("Adhero 的构造方法");
	}
	public static  void battleWin() {//隐藏了父类的方法,则自己可以创建同名的函数
		System.out.println("Adhero battleWin");
	}
	@Override
	public void die() {
		System.out.println("Adhero 死亡");
	}
	public void attack() {
		System.out.println(name+"进行了一次进攻");
	}
		
	public int getMoveSpeed1() {
		return super.moveSpeed;
	}

	public int getMoveSpeed2() {
		return this.moveSpeed;
	}
	
	//public void attack(Hero h1) {
//	System.out.println(name+"对"+h1.name+"进行了一次进攻");
//	}
//	public void attack(Hero h1,Hero h2) {
//		System.out.println(name+"对"+h1.name+"和"+h2.name+"进行了攻击");
//	}	
	public void attack (Hero ...heros) {
		for (int i = 0; i < heros.length; i++) {
			System.out.println(name+"对"+heros[i].name+"进行了攻击");
		}
	}
	
	public static void main(String[] args) {
		Adhero missFortune = new Adhero();
		missFortune.name = "厄运小姐";
		missFortune.moveSpeed = 360;
		Item i = new Item();
		missFortune.useItem(i);//通过super 调用父类的方法
		
		System.out.println(missFortune.getMoveSpeed1());
		System.out.println(missFortune.getMoveSpeed2());
		//当  Adhero 的 moveSpeed 没有设置的时候，则父类的moveSpeed 也被设置了如果设置了，则super的值为0
		
		
		
		/*
		 * 
		Hero timo = new Hero();
		timo.name = "提莫";	
		Hero gailun = new Hero(); 
		gailun.name = "盖伦";
		missFortune.attack(timo);
		missFortune.attack(timo,gailun);
		 */

}
	
}

