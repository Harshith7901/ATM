package ATM;

import java.util.Scanner;

class ATM {
	float Balance;
	int PIN = 9632;

	public void checkPin() {
		System.out.println("Enter your Pin: ");
		Scanner scan = new Scanner(System.in);
		int enteredPin = scan.nextInt();
		if (enteredPin == PIN) {
			menu();
		} else {
			System.out.println("Enter a valid Pin");
			menu();
		}
	}

	public void menu() {
		System.out.println("Enter your Choice: ");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. EXIT");

		Scanner scan = new Scanner(System.in);
		int opt = scan.nextInt();

		if (opt == 1) {
			checkBalance();
		} else if (opt == 2) {
			withdrawMoney();
		} else if (opt == 3) {
			depositMoney();
		} else if (opt == 4) {
			return;
		} else {
			System.out.println("Enter the Valid Choice");
		}
	}

	private void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance: " + Balance);
		menu();
	}

	private void withdrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("Enter Amount to Withdraw");
		Scanner scan = new Scanner(System.in);
		float amount = scan.nextFloat();
		if (amount > Balance) {
			System.out.println("Insufficient Balance");
		} else {
			Balance = Balance - amount;
			System.out.println("Money Withdrawl Successful");
		}
		menu();
	}

	private void depositMoney() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Amount: ");
		Scanner scan = new Scanner(System.in);
		float amount = scan.nextFloat();
		Balance += amount;
		System.out.println("Money depositd Successfilly");
		menu();
	}
}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM obj = new ATM();
		obj.checkPin();

	}

}