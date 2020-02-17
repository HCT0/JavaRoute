package ComprehensivePractice;

public class Fish extends Animal implements pet {
	private String name;
	
	public Fish() {
		this.name = name;
	}
	
	@Override
	protected void eat() {
		System.out.println("鱼吃");	
	}
	public void walk() {
		System.out.println("鱼没有腿,无法行走");
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
		System.out.println("鱼玩");
		
	}
	
	

}
