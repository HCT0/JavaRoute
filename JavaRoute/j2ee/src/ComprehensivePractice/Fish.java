package ComprehensivePractice;

public class Fish extends Animal implements pet {
	private String name;
	
	public Fish() {
		this.name = name;
	}
	
	@Override
	protected void eat() {
		System.out.println("���");	
	}
	public void walk() {
		System.out.println("��û����,�޷�����");
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
		System.out.println("����");
		
	}
	
	

}
