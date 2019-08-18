package assignment_3;

public class WithdrawThread extends Thread{
	
	private double transactionAmount;
	private BankAccount acc;
	
	public WithdrawThread(BankAccount acc, double amount) {
		// TODO Auto-generated constructor stub
		this.transactionAmount = amount;
		this.acc = acc;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		acc.withdraw(transactionAmount);
		
	}
}
