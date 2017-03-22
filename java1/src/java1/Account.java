package java1;

public class Account {
	private double balance;
	
	public void credit(double add){
		balance += add;
	}
	
	public void debit(double withdraw){
		balance -= withdraw;
	}
	
	public double getBalance(){
		return balance;
	}
	
	protected void setBalance(double money){
		balance = money;
	}
	
	public Account(double money){
		this.balance = money;
	}
}
