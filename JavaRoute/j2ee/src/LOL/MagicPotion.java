package LOL;

public class MagicPotion extends Item {
	public void effect() {
		System.out.println("使用蓝瓶，可以恢复魔法");
	}
public static void main(String[] args) {
	MagicPotion mp = new MagicPotion();
	mp.effect();
}

}
