package LOL;

public class Hero {
	/*
	 * private Hero();//����ʽ
	 * private static Hero heroInstance;
	 * public static Hero getHero(){
	 *     heroInstance = new Hero();
	 * 	   return heroInstance;
	 * }
	 * 
	 * 
	 * */
	public int id;
	static String copyRight;//���ж��󶼹��õ�
	public String name;//Ӣ�۵�����
	public int moveSpeed;//�ƶ��ٶ�
	public float hp;//Ӣ�۵�Ѫ��
	float armor;//Ӣ�۵Ļ���
	int dietNumber;//Ӣ������Ĵ���
	int killedNunber;//ɱ����
	int  helpKilled;//����
	int money;//��Ǯ
	int lasyHit;//������
	float attackSpeed;//�����ٶ�
	String afterKill;//ɱ���Ժ�˵�Ļ�
	String afterKilled;//��ɱ��˵�Ļ�
	public  int damage;
	
	
	public boolean match() {
		return this.hp>100 && this.damage<50;
	}
	public  static void  battleWin(){//ս��ʤ��
		System.out.println("Battle Win");
	}
	
	public synchronized void recover() {//��Ѫ�ķ���
		hp++;	
		this.notify();
	}
	public synchronized void hurt() {//��Ѫ��ͬ������
		if(hp == 1) {
			try{
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		hp--;
	}
	/*
	public void revive(Hero h1) {
		h1 = new Hero("��Ī",400);
	}
	 */
	public void useItem(Item i ) {
		System.out.println("Hero ʹ���� Item");
		i.effect();
	}
	public Hero(String name,float hp) {
		this.name = name;
		this.hp = hp;
	}
		//��ȡ����ֵ
	float getArmor() {
		return armor;
	}
	//���������Ĺ��캯��
	//public Hero(String name,float hp) {
	//	System.out.println("����Hero�����������Ĺ��캯��");
	//}
	
	public Hero(String name,float hp,float armor,int MoveSpeed) {
		this(name,hp);
		System.out.println("������ĸ������Ĺ��캯��");
	}
	
	public void showAddressInMemory() {
		System.out.println("��ӡthis�����������ַ"+this);
	}
	//�Ӷ���
	void keng() {
		System.out.println("�Ӷ���");
	}
	void addSpeed(int speed) 
	{
		moveSpeed = moveSpeed + speed;
	}
	//����
	void legendary() {
	}
	//��ȡѪ��
	float getHp() {
		return hp;
	}
	//Ѫ�Ļظ���
	void recovery(float blood) {
	}
	public void finalize() {
		System.out.println("����finalize�����󱻻���");
	}
	public Hero() {
		System.out.println("����Hero���޲ι��캯��");
	}
	public Hero (String name) {
		System.out.println(name+"����Hero��һ�������Ĺ��캯��");
	}
	
	public void kill(Mortal m) {
		m.die();//Hero ɱ��ĳһ��Ӣ�Ժ󣬵������������Ӣ�۵�die����
	}
	//this�������ҵ���˼�������������
	//this.name ��������name ��heroName �ǲ���
	/*public Hero(String heroName,float heroHp,float heroArmor,int heroMoveSpeed) {
		this.name = heroName;
		this.hp = heroHp;
		this.armor = heroArmor;
		this.moveSpeed = heroMoveSpeed;
	}*/
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		/*
		Adhero  aixi = new Adhero();
		AdapHero missFortune = new AdapHero();
		Aphero lax = new Aphero();
		
		Hero h = new Adhero();
		h.battleWin();//ת��Ϊ��������Ժ󣬶�ʧ����ķ���
		Hero timo = new Hero();
		timo.kill(aixi);
		timo.kill(lax);
		timo.kill(missFortune);
		timo.armor = 14f;  
		timo.hp = 383f;
		timo.moveSpeed = 330;
		timo.name = "��Ī";
		
		//�����ĸ������Ĺ��캯��ʹ�� this �������������Ĺ��캯��
		Hero testHero = new Hero("����",1000,1000,300);
		
		//�����Ĳ���
		timo.hp = timo.hp=400;
		timo.revive(timo);
		System.out.println("��Ī�����Ժ��Ѫ��Ϊ:"+timo.hp);
		
		
		Hero gailun = new Hero();
		gailun.armor = 27.536f;
		gailun.copyRight = "Blizzard Entertainment Enterprise";
		gailun.name = "����";
		gailun.hp = 616.28f;
		gailun.moveSpeed = 350;
		gailun.addSpeed(100);
		
		System.out.println("timo �İ�Ȩ��"+timo.copyRight);
		Hero.battleWin();
	*/
	}
	public void attackHero(Hero h) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		h.hp-= damage;
		if(h.isDead()) {
			System.out.println(h.name + "����");
		}
	}
	public boolean isDead() {
		return 0>hp?true:false;
	}
	
} 