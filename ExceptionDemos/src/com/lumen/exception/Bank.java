package com.lumen.exception;

public class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) throws Exception {
		try {
		System.out.println("In Bank");
		if (amount > 1000)
			throw new  Exception("Exceeding Limit");
		balance = amount;

		System.out.println("Balance" + balance);
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
		
		throw e;
	}
	finally {
		System.out.println("close");
		
	}
		System.out.println("completed");

	}


}
