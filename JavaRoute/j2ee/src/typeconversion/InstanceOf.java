package typeconversion;
import LOL.*;
public class InstanceOf {
	public static void main(String[] args) {
		Hero timo = new Hero();
		Adhero missFortune = new Adhero();
		System.out.println( timo instanceof Hero);
		System.out.println( missFortune instanceof Hero);//Adhero ºÃ≥– Hero£¨À˘“‘ «true
		System.out.println( missFortune instanceof Adhero);
		System.out.println( timo instanceof Adhero);
	
	}
}
