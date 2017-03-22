package java1;

public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	public CheckingAccount(double money, double c, double i, double l){
		super(money);
		this.credit_limit = c;
		this.interest = i;
		this.loan_interest = l;
	}
	
	@Override public void debit(double withdraw){
		if(withdraw > credit_limit){
			System.out.println("한도 초과");
		}
		else{
			setBalance(getBalance() - withdraw);
			if(getBalance() < 0){
				System.out.println("마이너스 통장");
			}
		}
	}
	
	public void nextMonth(){
		if(getBalance() >= 0){
			setBalance(getBalance() * (1 + interest));
		}else{
			setBalance(getBalance() * (1 + loan_interest));
		}
	}
}
