package com.ammu.admin;

public class AdminLoginTest {
	  
	   public void testLoginFailure() {
	      AdminLogin adminLogin = AdminLogin.getInstance();
	      adminLogin.UserId = "testuser";
	      adminLogin.Password = "testpassword";
	      adminLogin.user();
	      assert Equals("Invalid userid or password", "Invalid userid or password");
	   }

		private boolean Equals(String string, String string2) {
		// TODO Auto-generated method stub
		return false;
	}
		   public void testLoginSuccess() {
		      AdminLogin adminLogin = AdminLogin.getInstance();
		      adminLogin.UserId = "test";
		      adminLogin.Password = "test";
		      adminLogin.user();
		      assert Equals("Login Successful!", "Login Successful");
		   }
		}