package LOL;

public class Aphero extends Hero implements AP,Mortal{
	public void magicAttack() {
		System.out.println("����ħ������");
	}

	@Override
	public void die() {
		System.out.println("Aphero ����");
		
	}

	
}
