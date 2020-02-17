package ObjectAndQuote;

public class AbstractTeatSon extends AbstractTest {

	@Override
	public void attack() {
		System.out.println("子类对父类的抽象进行实例化");
	
	}
	public boolean disposition() {
		return false;
	}

}
