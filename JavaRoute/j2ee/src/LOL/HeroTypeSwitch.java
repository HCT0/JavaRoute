package LOL;
public class HeroTypeSwitch {
	public static void main(String[] args) {
		HeroType heroTypeSwitch =  HeroType.ASSASSIN;
		switch(heroTypeSwitch) {
			case TANK:
				System.out.println("̹��");
				break;
			case WIZARD:
				System.out.println("��ʦ");
				break;
			case ASSASSIN:
				System.out.println("�̿�");
				break;
			case ASSIST:
				System.out.println("����");
				break;
			case RANGED:
				System.out.println("Զ��");
				break;
			case WARRIOR:
				System.out.println("��ս");
				break;
			case PUSH:
				System.out.println("�ƽ�");
			case FARMING:
				System.out.println("��Ұ");
			default:
				System.out.println("�������");
				
	}
	}
}
