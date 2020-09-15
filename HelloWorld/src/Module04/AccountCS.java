package Module04;

import java.util.Random;
import java.util.Scanner;



abstract class Account{
	abstract void createAcc();
	abstract void deposit(int acc_num, float amt);
	abstract void withdraw(int acc_num, float amt);
}

class SBAccount extends Account{
	int acc_num;
	String name;
	float amount = 10000;
	Scanner s = new Scanner(System.in);
	
	@Override
	void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Enter your name: ");
		name = s.nextLine();
		Random generator = new Random();
		int acc_num = generator.nextInt(899999) + 100000;
		System.out.println("Savings Account number for "+name+" is: "+acc_num);
	}
	
	@Override
	void deposit(int acc_num, float amt) {
		// TODO Auto-generated method stub
		amount += amt;
		System.out.println("Balance after depositing Rs."+amt+" for account number "+acc_num+" is: "+amount);
	}

	@Override
	void withdraw(int acc_num, float amt) {
		// TODO Auto-generated method stub
		amount += amount*4/100 - amt;
		System.out.println("Balance after withdrawing Rs."+amt+" for account number "+acc_num+" is: "+amount);
	}
}

class CurrAccount extends Account{
	int acc_num;
	String name;
	float amount = 10000;
	Scanner s = new Scanner(System.in);
	
	@Override
	void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Enter your name: ");
		name = s.nextLine();
		Random generator = new Random();
		int acc_num = generator.nextInt(899999) + 100000;
		System.out.println("Current Account number for "+name+" is: "+acc_num);
	}
	
	@Override
	void deposit(int acc_num, float amt) {
		// TODO Auto-generated method stub
		amount += amt;
		System.out.println("Balance after depositing Rs."+amt+" for account number "+acc_num+" is: "+amount);
	}

	@Override
	void withdraw(int acc_num, float amt) {
		// TODO Auto-generated method stub
		amount -= amt;
		System.out.println("Balance after withdrawing Rs."+amt+" for account number "+acc_num+" is: "+amount);
	}
}

public class AccountCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the task to go with: \n1. Create new account \n2. Operate into existing account");
		int c1 = s.nextInt();
		switch(c1) {
		case 1: System.out.println("Enter which type of account to be created: ");
				System.out.println("1. Savings Account \n2. Current Account");
				int c2 = s.nextInt();
//				String name;
				switch(c2) {
				case 1: SBAccount obj_SB = new SBAccount();
						obj_SB.createAcc(); break;
				case 2: CurrAccount obj_Curr = new CurrAccount();
						obj_Curr.createAcc(); break;
				default: System.out.println("Choose the correct option!"); break;
				}
				break;
		case 2: System.out.println("Enter which type of account to be used: ");
				System.out.println("1. Savings Account \n2. Current Account \n3. Exit");
				int c3 = s.nextInt();
				switch(c3) {
				case 1: SBAccount obj_SB = new SBAccount();
						System.out.println("Enter the choice: \n1.Deposit \n2. Withdraw");
						int c4 = s.nextInt();
						if(c4==1) {
							System.out.println("Enter the account number:");
							int acc_num = s.nextInt();
							System.out.println("Enter the amount to be deposited:");
							float amount = s.nextFloat();
							obj_SB.deposit(acc_num, amount);
						}
						else {
							System.out.println("Enter the account number:");
							int acc_num = s.nextInt();
							System.out.println("Enter the amount to be withdrawn:");
							float amount = s.nextFloat();
							obj_SB.withdraw(acc_num, amount);
						}
						
				case 2: CurrAccount obj_Curr = new CurrAccount();
						System.out.println("Enter the choice: \n1.Deposit \n2. Withdraw");
						int c5 = s.nextInt();
						if(c5==1) {
							System.out.println("Enter the account number:");
							int acc_num = s.nextInt();
							System.out.println("Enter the amount to be deposited:");
							float amount = s.nextFloat();
							obj_Curr.deposit(acc_num, amount);
						}
						else {
							System.out.println("Enter the account number:");
							int acc_num = s.nextInt();
							System.out.println("Enter the amount to be withdrawn:");
							float amount = s.nextFloat();
							obj_Curr.withdraw(acc_num, amount);
						}
				case 3: break;
				default: System.out.println("Choose the correct option!"); break;
				}
				break;
			default: System.out.println("Choose the correct option!"); break;
		}
		s.close();
	}

}
