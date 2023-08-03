package com.lumen.inheritdemos;

import java.util.Scanner;

public class AtmMain {

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
		      System.out.println("Enter account type");
		      String accountType=scanner.next();
		      System.out.println("Enter  method type");
		      String methodType=scanner.next();
		      System.out.println("Enter Savings Amount");
		      double balance1=scanner.nextInt();
		      System.out.println("Enter amount you want"); 
		      double money=scanner.nextInt();
		      
		      
		      if(accountType.equals("savings")) {
		    	  if(methodType.equals("withdraw")) {
		    		  Account account=new AccountSavings(balance1);
		    		  account.withdraw(money);
		    		  System.out.println("available balance " +account.getBalance());
		    	  }
		    	  else
		    	  {
		    		  Account account=new AccountSavings(balance1);
		    		  account.deposit(money);
		    	  }
		      }
		      else if(accountType.equals("current")) {
		    	  if(methodType.equals("withdraw")) {
		    		  Account account=new AccountSavings(balance1);
		    		  account.withdraw(money);
		    	  
		    		  
		    	  }else {
		    		  Account account=new AccountSavings(balance1);
		    		  account.deposit(money);
		    	  
		   
		    	  }
		    	  scanner.close();
		      }
		      

		}

	}



