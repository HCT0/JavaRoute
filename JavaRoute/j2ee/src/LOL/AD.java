package LOL;

public interface AD {
	public void physicAttack();
	
	default public void attack() {
		System.out.println("Ad��Ĭ�Ϲ�������");
	}
}
