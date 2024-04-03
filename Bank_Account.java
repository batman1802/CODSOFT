package com.ATM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//importing scanner class to take user input data.
import java.util.Scanner;

class ATM {
	
	Scanner sc = new Scanner(System.in);
	public double amount;
	public double currentBalance = 500;

	public void withdraw() {
		
		System.out.println("Total balance " + currentBalance);
System.out.println("Enter amount you want to withdraw");
Double withdrawn = sc.nextDouble();
		currentBalance = currentBalance - withdrawn;
		System.out.println("You have withdrawn total of " + withdrawn);
		System.out.println("Total balance in your account is " + currentBalance );
		
	}
	
	public void deposit() {
		System.out.println("Total Balance is "+ currentBalance);
		System.out.println("Enter the amount to deposit");
		int deposited = sc.nextInt();
		System.out.println("Thanks for depositing  " + deposited + " to your account. ");
		currentBalance = currentBalance+ deposited;
		System.out.println("Total balance in your account is " + currentBalance);
		

	}
	
	public void account_Balance() {
		System.out.println("Current Balance is " + currentBalance);
	}
	
	public void userInformation() {
		String name = "Vihari";
		int accountNumber = 1098453;
	String city = "Hyderabad";
	String branch = "Kukkatpally";
	
	System.out.println("Name is " + name);
	System.out.println("account number is " + accountNumber);
	System.out.println("Branch and address details " + branch + "," + city);
	}


}



public class Bank_Account {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructor Invoked.
ATM atm = new ATM();

Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Welcome to Bank of Citi Chase ATM.");

		System.out.println("Click 1 to View menu");
		System.out.println("Click 2 to Exit");
		
		int choice = sc.nextInt();
		
		homePage(choice);
		
		while(true) {
		int option = sc.nextInt();
		

		if(option == 1) {
			atm.account_Balance();
		}
		
		if(option == 2) {
			atm.deposit();
			System.out.println("Thanks for using our services.");
	
		}
		
		if(option == 3) {
			atm.withdraw();
		}
		if(option ==4) {
			
			System.out.println("Account Details :) ");
			atm.userInformation();
			
		}
		
		if(option == 5) {
			homePage(1);
		}
	
		}
		

	}
	

	private static void homePage(int choice) {
		if(choice==1) {
			System.out.println("1) View Account Balance");
			System.out.println("2) Deposit Amount");
			System.out.println("3) Withdraw Amount");
			System.out.println("4) View Account Information");
			System.out.println("5) Go back to main menu");
			
		}
		else {
			System.out.println("Thanks for visiting :)");
			System.exit(0);
		}
	}


}
