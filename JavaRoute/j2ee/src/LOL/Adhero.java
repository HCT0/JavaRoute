package LOL;

public class Adhero extends Hero implements AD,Mortal{
	int moveSpeed = 300;
	public void physicAttack() {
		System.out.println("����������");
	}
	
	public void useItem(Item i) {
		System.out.println("Adhero ʹ���� Item");
		super.useItem(i);
	}
	//������û���޲ι��캯����ʱ��,ʹ��super��ʾ�ĵ��ø�����вι��췽��
	public Adhero() {//�����صĵ��ø�����޲ι��췽��
		System.out.println("Adhero �Ĺ��췽��");
	}
	public static  void battleWin() {//�����˸���ķ���,���Լ����Դ���ͬ���ĺ���
		System.out.println("Adhero battleWin");
	}
	@Override
	public void die() {
		System.out.println("Adhero ����");
	}
	public void attack() {
		System.out.println(name+"������һ�ν���");
	}
		
	public int getMoveSpeed1() {
		return super.moveSpeed;
	}

	public int getMoveSpeed2() {
		return this.moveSpeed;
	}
	
	//public void attack(Hero h1) {
//	System.out.println(name+"��"+h1.name+"������һ�ν���");
//	}
//	public void attack(Hero h1,Hero h2) {
//		System.out.println(name+"��"+h1.name+"��"+h2.name+"�����˹���");
//	}	
	public void attack (Hero ...heros) {
		for (int i = 0; i < heros.length; i++) {
			System.out.println(name+"��"+heros[i].name+"�����˹���");
		}
	}
	
	public static void main(String[] args) {
		Adhero missFortune = new Adhero();
		missFortune.name = "����С��";
		missFortune.moveSpeed = 360;
		Item i = new Item();
		missFortune.useItem(i);//ͨ��super ���ø���ķ���
		
		System.out.println(missFortune.getMoveSpeed1());
		System.out.println(missFortune.getMoveSpeed2());
		//��  Adhero �� moveSpeed û�����õ�ʱ�������moveSpeed Ҳ����������������ˣ���super��ֵΪ0
		
		
		
		/*
		 * 
		Hero timo = new Hero();
		timo.name = "��Ī";	
		Hero gailun = new Hero(); 
		gailun.name = "����";
		missFortune.attack(timo);
		missFortune.attack(timo,gailun);
		 */

}
	
}

