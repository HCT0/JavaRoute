package ComprehensivePractice2;

public class Account {
 double balance;
 
 Account(double inittest){
	this.balance = inittest;
 }
 public double getBalance() {
	 return balance;
 }
 public void deposit(double amt) {
	 System.out.println("���д�Ǯ����");
 }
 public void withdraw(double amt) throws OverdraftException {
	 balance -= amt;
	 if(balance < 0 )
		 throw new OverdraftException("���Ѿ�͸֧ ",-balance);
 }
 
 
 
}

