package com.lumen.inheritdemos;

public class Account {
	double balance;

	 public Account(double balance) {
		 super();
		 this.balance = balance;

	    }
	 	void withdraw(double amount){
	 		if(amount>0 && amount<=balance) {
	 			balance-=amount;
	 			System.out.println(balance);

	            }
	 		else {
	 			System.out.println("Insufficient Balance");

	        }
	 		}
	 	void deposit(double amount){
	 		if(amount>0) {
	 			balance+=amount;
	 			System.out.println("Deposited Successfully");
	 			}
	 		else {
	 			System.out.println("Invalid");
	 		}
	 		}
	 	double getBalance(){

	        return balance;

	                }

	 

	}

	 


