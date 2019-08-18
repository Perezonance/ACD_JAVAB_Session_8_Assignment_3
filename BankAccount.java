package assignment_3;

public class BankAccount {
	
	private double balance;
	
	//Default Constructor
	public BankAccount(){
		this(10000);
	}
	public BankAccount(double bal){
		this.balance = bal;
	}
	
	public void withdraw(double amount){
		balance -= amount;
		System.out.println("$" + amount + " Withdrawn from the Account. New Balance: $" + balance);
	}
	
	public void deposit(double amount){
		balance += amount;
		System.out.println("$" + amount + " Deposited into the Account. New Balance: $" + balance);
	}
}
