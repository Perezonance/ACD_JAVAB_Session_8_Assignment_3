package assignment_3;

public class DepositThread extends Thread{
	
	private double transactionAmount;
	private BankAccount acc;
	
	public DepositThread(BankAccount acc, double amount){
		this.acc = acc;
		this.transactionAmount = amount;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		acc.deposit(transactionAmount);
		
	}
}
