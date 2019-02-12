package course;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number: ");
		int number = sc.nextInt();
		System.out.println("Enter the account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n) ?" );
		char test = sc.next().charAt(0);
		double deposit = 0;
		
		if (Character.toLowerCase(test) == 'y') {
			System.out.println("Enter a deposit value: ");
			deposit = sc.nextDouble();	
		}
		
		Account account_holder = new Account(number,name,deposit);
		System.out.println(account_holder.accountData());
		System.out.println("Enter a deposit value: ");
		deposit = sc.nextDouble();
		account_holder.deposit(deposit);
		System.out.println(account_holder.accountData());
		
		System.out.println("Enter a withdraw value: ");
		deposit = sc.nextDouble();
		account_holder.withdraw(deposit);
		System.out.println(account_holder.accountData());
		
	}
}
