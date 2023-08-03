package com.lumen.inheritdemos;

public class Current extends Account {
		public Current(double balance) {
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
				System.out.println("Insufficient ");
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



