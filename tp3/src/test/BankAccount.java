package test;

public class BankAccount {
	private int acctNum ;
	private int balance ;
	private int lastTransaction;
	public BankAccount(int acctNum){
		this.acctNum = acctNum ;
	}
	protected int getAccountNum () {
		return acctNum ;
	}
	protected boolean deposit(int amount){
		if(amount <= 0)
			return false;
		balance += amount ;
		lastTransaction = amount ;
		return true ;
	}
	protected boolean withdraw(int amount) {
		if( amount>0 && balance>=amount) {
			balance -= amount ;
			lastTransaction = -amount ;
			return true ;
		}
		else
			return false;
	}
	protected int getBalance(){
		return balance ;
	}
	protected int getLastTransAmount(){
		return lastTransaction;
	}
	@Override
	public String toString(){
		return String.format("Account %d (balance $%d)", acctNum, balance);
	}
}
