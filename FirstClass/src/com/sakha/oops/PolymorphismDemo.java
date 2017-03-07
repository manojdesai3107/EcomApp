package com.sakha.oops;

public class PolymorphismDemo {
	public static void main(String[] args) {
		Account a1 = new Account(1000, 0.08f, 1000, 15000);
		a1.deposite(100);
		a1.withdraw(500);
		System.out.println("Accumalted Interest: " + a1.calculateinterest());
		FDAccount fd1 = new FDAccount(1001, 0.07f, 150000, 0, 5);
		System.out.println("Interest for Deposite Account :" + fd1.calculateinterest());
	}

}
class Account {
	private long accountnumber;
	private float interestrate;
	private float balance;
	private int dailylimit;
	public Account(long accountnumber, float interestrate, float balance, int dailylimit) {
		super();
		this.accountnumber = accountnumber;
		this.interestrate = interestrate;
		this.balance = balance;
		this.dailylimit = dailylimit;
	}
	public Account() {
		super();
	}
	public void deposite(int amount){
		System.out.println("Available balance :" + balance);
		balance += amount;
		System.out.println("New Balance is :" + balance);
	}
	public void withdraw(int amount) {
		if (balance > amount)
		{
			balance -= amount;
		}
			else
				System.out.println("Insufficient Balance");
	}
	public float calculateinterest () {
		float interest = 0;
		interest = interestrate * balance;
		balance += interest;
		return interest;
	}
}
class FDAccount extends Account {
	
	public FDAccount(long accountnumber, float interestrate, float balance, int dailylimit, int term) {
		super(accountnumber, interestrate, balance, dailylimit);
		this.term = term;
	}
	private int term;
	public float rateofinterest () {
		float interest = 0;
		interest = super.calculateinterest();
		return interest * term;
	}
}