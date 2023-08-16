package com.ammu.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.ammu.cart.Actions;
import com.ammu.products.AmmoDao;

 public class CustomerLogin{
	private static CustomerLogin Login_page = null;
	static String User_id;
    static String Password;
    public void user() {

    String JdbcURL = "jdbc:mysql://localhost:3306/ammunation_store";
    String Username = "root";
    String password = "admin123";
    Connection connection = null;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the user id:");
    User_id = scanner.next();
    System.out.println("Enter the Password");
    Password = scanner.next();
    PreparedStatement preparestatement = null;
    ResultSet resultset = null;
    String myQuery = "select User_Id,Password from customer where User_Id=? and Password=?";
    try {
       connection = DriverManager.getConnection(JdbcURL, Username, password);
       preparestatement = connection.prepareStatement(myQuery);
       preparestatement.setString(1,User_id);
       preparestatement.setString(2,Password);		 
       resultset = preparestatement.executeQuery();
      if(resultset.next())
      {
      	System.out.println("Login Successful!!!");
      	int status=0;
      	Scanner scan=new Scanner(System.in);
	        Scanner scanner1 = new Scanner(System.in);
	        Scanner scanner2 = new Scanner(System.in);
      	do
      	{
      	System.out.println("\nSelect an option:");
    	System.out.println("Personal Use");
   	    System.out.println("For Others");
   	    System.out.println("Business");
   	    int option = scanner1.nextInt();
   	    if (option == 1) {
   		 do
   		 {
   			   	     	    	     	       
   	  System.out.println("Do you want to continue(press any number not)");   	     	    
  	  Actions actions = Actions.getInstance();
  	  actions.user();
   	  status = scan.nextInt();   	    		
   			}
   		while(!(status == 0));  		        
   		System.out.println("Thank you for choosing");
      	}
   			      }
      	while(!(status == 0));
      	System.out.println("Thank you for choosing");
      }
      else
      {
      	throw new CustomerDaoException("Invalid userid,password");
      }      
      resultset.close();
      preparestatement.close();
      connection.close();
    } 
    catch(CustomerDaoException e)
		{
			System.out.println(e.getMessage());
		}
    catch(Exception exec) {
       exec.printStackTrace();
    }
    
 }    
    public static CustomerLogin getInstance() {
	
	if(Login_page == null) {
		Login_page  = new CustomerLogin ();
	}
	return Login_page;
}
}