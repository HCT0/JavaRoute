package ComprehensivePractice2;

public class OverdraftException extends Exception {
	double deficit;
	OverdraftException(String massage,double deficit){
		
	}
	public double getDeficit() {
		return deficit;
	}
}
