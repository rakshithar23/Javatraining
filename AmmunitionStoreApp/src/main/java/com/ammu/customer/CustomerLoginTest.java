package com.ammu.customer;

public class CustomerLoginTest {
	  
	public void testLoginFailure() {
	   CustomerLogin customerlogin = CustomerLogin.getInstance();			
	   customerlogin.User_id = "test";
	   customerlogin.Password = "test";
	   customerlogin.user();
	   assert Equals("Invalid userid or password", "Invalid userid or password");
	   }   
		  
	 public void testLoginSuccess() {
		 CustomerLogin customerlogin = CustomerLogin.getInstance();
		 customerlogin.User_id = "test";
		 customerlogin.Password = "test";
		 customerlogin.user();
		 assert Equals("Login Successful!", "Login Successful!");
		   }

	private boolean Equals(String string, String string2) {
		// TODO Auto-generated method stub
		return false;
	}
		}