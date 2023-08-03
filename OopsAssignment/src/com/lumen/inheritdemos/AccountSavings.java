package com.lumen.inheritdemos;

public class AccountSavings extends Account {

		public AccountSavings(double balance) {
			super(balance);
		}

		@Override
		void withdraw(double amount) {
			if(amount>0 && amount<=balance) {
				if(getBalance()-amount>=1000)
					balance=balance-amount;
				System.out.println("Withdraw Success");
			}
			else {
				System.out.println("Insufficient Balance");
			}
		}

		@Override
		void deposit(double amount) {
			if(amount>0) {
				balance=balance+amount;
				System.out.println("Deposited Successfully");
			}
			else {
				System.out.println("Invalid");
			}
		}

	}



