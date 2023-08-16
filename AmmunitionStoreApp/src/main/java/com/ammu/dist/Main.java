package com.ammu.dist;

import java.util.Scanner;

import com.ammu.admin.AdminLogin;
import com.ammu.customer.CustomerRegistration;
import com.ammu.customer.CustomerLogin;
import com.ammu.customer.CustomerRegistration;

    public class Main {
	public static void main(String[] args) {		
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to our ammunition store");
	       int status=0;
	        Scanner scanner1 = new Scanner(System.in);
	       do {
	        System.out.println("\nSelect an option:");
	       
	        System.out.println("Admin Login");
	        System.out.println("Admin Registration");
	        System.out.println("Customer Login");
	        System.out.println("Customer Registration");
	        int option = scanner1.nextInt();
		if (option == 1) {
			AdminLogin adminlogin = AdminLogin.getInstance();
			adminlogin.user();

		} 
		else if(option == 2) {
			CustomerRegistration adminregister = CustomerRegistration.getInstance();
			adminregister.register();		
		}
		else if(option==3) 
		{
			CustomerLogin customerlogin = CustomerLogin.getInstance();
			customerlogin.user();			 
		}
		else if(option==4) 
		{
			CustomerRegistration register = CustomerRegistration.getInstance();
			register.register();
		}
		System.out.println("Do you want to continue(press any number)");		
		status = scanner.nextInt();		
	} while (!(status == 0));		        
	System.out.println("Thank you for choosing");	        
	}	
}
