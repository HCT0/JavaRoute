package LOL;

public class LifePotion extends Item {
	public void effect() {
		System.out.println("Ѫƿʹ���Ժ󣬿��Ի�Ѫ");
	}
	public static void  main(String args[]) {
		Item i = new Item();
		i.effect();
		LifePotion lp = new LifePotion();
		lp.effect();
	}
}
