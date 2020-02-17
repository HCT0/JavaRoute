package LOL;

public class AdapHero extends Hero implements AP,AD,Mortal {
	@Override
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}
	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	@Override
	public void die() {
	System.out.println("Adaphero 死亡");
		
	}
	@Override
	public void attack() {
		System.out.println("Adaphero 对接口的相同方法进行重写");
		//AD.super.attack();
	}
	
	
}	
