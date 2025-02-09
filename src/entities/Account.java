package entities;

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Account(int accountNumber, String accountHolder) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	public Account(int accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	
	public void balanceDeposit(double deposit) {
		this.balance+=deposit;
	}
	
	public void balanceWithdraw(double withdraw) {
		this.balance=this.balance-withdraw-5.00;
	}
	
	
	public void print() {
		System.out.println("-------------------");
		System.out.println("Dados da conta:");
		System.out.println("Conta: "+ getAccountNumber());
		System.out.println("Nome: "+ getAccountHolder());
		System.out.println("Valor disponível: R$ "+ getBalance());
		System.out.println("-------------------");
	}

	
	
	
	
}
