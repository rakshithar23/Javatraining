package com.ammu.cart;

 import java.util.Scanner;

import com.ammu.operations.CancelOrder;
 import com.ammu.operations.PlaceOrder;
    public class Actions {
	private static Actions actions = null;
	public void user() {
	  Scanner scanner = new Scanner(System.in);
	  System.out.printf("Welcome to our Ammunition store");
	    int status=0;
	  Scanner scanner1 = new Scanner(System.in);
	    do {
	     System.out.println("\nSelect an option:");
	     System.out.println("Place order");
	     System.out.println("Cancel order");
	 
	   int option = scanner1.nextInt();
	   if (option == 1) {
		   PlaceOrder placeorder = PlaceOrder.getInstance();
		   placeorder.user();

		} 
		else if(option==2) 
		{
			CancelOrder cancelorder = CancelOrder.getInstance();
			cancelorder.user();
		}
		System.out.println("Do you want to continue(press any number)");
		status = scanner.nextInt();
		
	} while (!(status == 0));
		        
	System.out.println("Thank you for choosing");
	        
	}
	public static Actions getInstance() {
		if (actions == null) {
			actions= new Actions();
		}
		return actions;
}
}