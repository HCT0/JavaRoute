package LOL;

public class Armor extends Item {
	int ac;//护甲的等级
	public static void main(String[] args) {
		Armor clothArmor = new Armor();
		Armor lockArmor = new Armor();
		clothArmor.price = 300;
		clothArmor.ac = 15;
		lockArmor.price = 500;
		lockArmor.ac = 40;
	}
}
