package charactor1;

import LOL.*;

//������Ӣ��
public class Support extends Hero implements Healer {
	
 public void heal(Hero h1) {
	 System.out.println(name + "��" + h1.name +"����������");
 }
 public void heal(Hero h1,int hp) {
	 System.out.println(name+"Ϊ"+h1.name +"������"+hp+"��Ѫ��");
 }
 public static void main(String[] args) {
	 
	Hero h1 = new Hero();
	h1.name = "��Ī";
	
	Support suoLaKa = new Support();
	suoLaKa.name = "soLaKa";
	suoLaKa.heal(h1);
	suoLaKa.heal(h1,1000);
}
 public void heal() {
	 System.out.println("ʵ������");
}
}
