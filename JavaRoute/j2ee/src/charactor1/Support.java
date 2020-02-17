package charactor1;

import LOL.*;

//辅助类英雄
public class Support extends Hero implements Healer {
	
 public void heal(Hero h1) {
	 System.out.println(name + "对" + h1.name +"进行了治疗");
 }
 public void heal(Hero h1,int hp) {
	 System.out.println(name+"为"+h1.name +"治疗了"+hp+"的血量");
 }
 public static void main(String[] args) {
	 
	Hero h1 = new Hero();
	h1.name = "提莫";
	
	Support suoLaKa = new Support();
	suoLaKa.name = "soLaKa";
	suoLaKa.heal(h1);
	suoLaKa.heal(h1,1000);
}
 public void heal() {
	 System.out.println("实现治疗");
}
}
