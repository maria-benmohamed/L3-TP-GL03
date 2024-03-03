package test;

public class BankAccount {
	private int acctNum ;
	private int balance ;
	private int lastTransaction;
	public BankAccount(int acctNum){
		this.acctNum = acctNum ;
	}
	private int getAccountNum () {
		return acctNum ;
	}
	private boolean deposit(int amount){
		if(amount <= 0)
			return false;
		balance += amount ;
		lastTransaction = amount ;
		return true ;
	}
	private boolean withdraw(int amount) {
		if( amount>0 && balance>=amount) {
		balance -= amount ;
		lastTransaction = -amount ;
		return true ;
		}
		else
			return false;
	}
	private int getBalance(){
		return balance ;
	}
	private int getLastTransAmount(){
		return lastTransaction;
	}
	@Override
	public String toString(){
		return String.format("Account %d (balance $%d)", acctNum, balance);
	}
}
