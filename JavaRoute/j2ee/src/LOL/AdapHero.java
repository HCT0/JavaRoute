package LOL;

public class AdapHero extends Hero implements AP,AD,Mortal {
	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}
	@Override
	public void physicAttack() {
		System.out.println("����������");
	}
	@Override
	public void die() {
	System.out.println("Adaphero ����");
		
	}
	@Override
	public void attack() {
		System.out.println("Adaphero �Խӿڵ���ͬ����������д");
		//AD.super.attack();
	}
	
	
}	
