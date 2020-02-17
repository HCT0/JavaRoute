package LOL;
public class HeroTypeSwitch {
	public static void main(String[] args) {
		HeroType heroTypeSwitch =  HeroType.ASSASSIN;
		switch(heroTypeSwitch) {
			case TANK:
				System.out.println("坦克");
				break;
			case WIZARD:
				System.out.println("法师");
				break;
			case ASSASSIN:
				System.out.println("刺客");
				break;
			case ASSIST:
				System.out.println("辅助");
				break;
			case RANGED:
				System.out.println("远程");
				break;
			case WARRIOR:
				System.out.println("近战");
				break;
			case PUSH:
				System.out.println("推进");
			case FARMING:
				System.out.println("打野");
			default:
				System.out.println("输出错误");
				
	}
	}
}
