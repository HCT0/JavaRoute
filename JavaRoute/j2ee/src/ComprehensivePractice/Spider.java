package ComprehensivePractice;

public class Spider extends Animal {
	static int legs = 8;
	Spider(){
		super(legs);
	}

	@Override
	protected void eat() {
		System.out.println("Spider eat");
	}

}
