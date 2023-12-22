package com.atm.project;
import java.util.Scanner;

public class AtmMiniProject {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int balance=200000, deposit, withdraw, amount;
		long accountNum;
		String userId, userName, bankName;
		
		System.out.print("Enter user id :- ");
		userId = sc.next();
		System.out.print("Enter password :- ");
		userName = sc.next();
		System.out.println("*************************************");
		System.out.println();
		while(true) {
			System.out.println("1. Transaction history");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Transfer");
			System.out.println("5. Quit");
			System.out.println();
			System.out.println("Please select 1 operation");
			
			int option = sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Your account balance is : "+balance);
				System.out.println("*************************************");
				break;
			case 2:
				System.out.println("Enter amount to be withdraw ");
				withdraw = sc.nextInt();
				if(withdraw<=balance) {
				balance = balance - withdraw;
			   System.out.println(withdraw+" debited in your account and available balance is "+balance);
				}else {
					System.out.println("Insufficient balance");
				}
				System.out.println("*************************************");
				break;
			case 3:
				System.out.print("Enter amount to be deposited : ");
				deposit = sc.nextInt();
				balance = deposit+balance;
				System.out.println(deposit+" credited to your account  and available balance is "+balance);
				System.out.println("*************************************");
				break;
			case 4:
				System.out.print("Enter account number to be transfer amount:- ");
				accountNum = sc.nextLong();
				System.out.print("Enter bank name:-");
				bankName = sc.next();
				System.out.print("Enter amount :- ");
				amount= sc.nextInt();
				if(amount<=balance) {
					balance = balance - amount;
					System.out.println(amount +" credited "+accountNum+ " in this account number and available balance is "+balance);
					}else {
						System.out.println("Insufficient balance");
					}				
				System.out.println("*************************************");
			    break;
			case 5:
				System.exit(0);				 
		}

	}

  }
	}
