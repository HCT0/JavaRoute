package LOL;

public interface AP {
 public void magicAttack();
 default public void attack() {
	 System.out.println("Ap使用默认方法进行攻击");
 }
}
