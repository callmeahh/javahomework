package helloworld;

import java.util.Date;

class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	Account() {
		this.dateCreated = new Date();
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withDraw(double amount) {
		setBalance(getBalance() - amount);
	}

	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}
}

public class HW3_02 {
	public static void main(String[] args) {
		Account test1 = new Account(1122, 20000);
		test1.setAnnualInterestRate(4.5);
		test1.withDraw(2500);
		test1.deposit(3000);
		System.out.println("Balance of test1 is: " + test1.getBalance());
		System.out.println("Monthly Interest of test1 is: " + test1.getMonthlyInterest());
		System.out.println("Date Created of test1 is: " + test1.getDateCreated());
	}
}
