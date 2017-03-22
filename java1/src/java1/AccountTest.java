package java1;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		CheckingAccount Account1 = new CheckingAccount(100.00, -100, 0.01, 0.07);
		CheckingAccount Account2 = new CheckingAccount(100.00, -100, 0.01, 0.07);
		
		System.out.printf("Account1 balance: $%f", Account1.getBalance());
		System.out.printf("Account2 balance: $%f", Account2.getBalance());
		
		System.out.print("Enter deposit amount for Account1: ");
		Scanner s = new Scanner(System.in);
		double num = s.nextDouble();
		
		Account1.credit(num);
		
		System.out.printf("Account1 balance: $%f", Account1.getBalance());
		System.out.printf("Account2 balance: $%f", Account2.getBalance());
		
		System.out.print("Enter deposit amount for Account2: ");
		Scanner s = new Scanner(System.in);
		double num2 = s.nextDouble();
		
		Account2.credit(num2);
		
		System.out.printf("Account1 balance: $%f", Account1.getBalance());
		System.out.printf("Account2 balance: $%f", Account2.getBalance());
		
		System.out.println("next month!");
		Account1.nextMonth();
		Account2.nextMonth();
		
		System.out.printf("Account1 balance: $%f", Account1.getBalance());
		System.out.printf("Account2 balance: $%f", Account2.getBalance());
	}

}
