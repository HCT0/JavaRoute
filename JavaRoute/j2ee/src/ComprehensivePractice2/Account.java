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
	 System.out.println("进行存钱操作");
 }
 public void withdraw(double amt) throws OverdraftException {
	 balance -= amt;
	 if(balance < 0 )
		 throw new OverdraftException("您已经透支 ",-balance);
 }
 
 
 
}

