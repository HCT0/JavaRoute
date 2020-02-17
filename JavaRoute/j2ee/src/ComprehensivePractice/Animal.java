package ComprehensivePractice;

public abstract class Animal {
	protected int legs;
	protected Animal() {};
	protected Animal(int legs) {
		this.legs = legs;
	}
	protected abstract void eat();
	public void walk() {
		System.out.println("Animal Walk With"+legs);
	}
}
