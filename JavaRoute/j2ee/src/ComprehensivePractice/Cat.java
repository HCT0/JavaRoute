package ComprehensivePractice;

public class Cat extends Animal implements pet {
	String name;
	
	public Cat() {
		this(null);
	}
	public  Cat(String name) {
		super(4);
		this.name = name;
	}
	
	
	@Override
	public String  getName() {
		return name;
	}

	@Override
	public void SetName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println(" Ã¨ Íæ ");
	}

	@Override
	protected void eat() {
		System.out.println("Ã¨ ³Ô");
		
	}
	

}
