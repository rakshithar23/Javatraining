package com.ammu.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.ammu.cart.AdminPlace;
import com.ammu.cart.AdminView;
public class AdminLogin {
	private static AdminLogin Login_page = null;
	static String UserId;
	static String Password;
	public void user() {
		String JdbcURL = "jdbc:mysql://localhost:3306/ammunition_store";
		String Username = "root";
		String password = "admin123";
		Connection connection = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the UserId :");
		UserId = scanner.next();
		System.out.println("Enter the Password");
		Password = scanner.next();
		PreparedStatement preparestatement = null;
		ResultSet resultset = null;
		String myQuery = "select User_Id,Password from Admin where User_Id=? and Password=?";
		try {
			connection = DriverManager.getConnection(JdbcURL, Username, password);
			preparestatement = connection.prepareStatement(myQuery);
			preparestatement.setString(1, UserId);
			preparestatement.setString(2, Password);
			resultset = preparestatement.executeQuery();
			if (resultset.next()) {
				System.out.println("Login Successful");
				AdminView adminview = AdminView.getInstance();
 				 adminview.select(); 
 				AdminPlace adminplace = AdminPlace.getInstance();
				 adminplace.select();
			} else {
				throw new AdminDaoException("Invalid userid or password");
			}
			resultset.close();
			preparestatement.close();
			connection.close();
		}
		catch(AdminDaoException e)
		{
			System.out.println(e.getMessage());
		}
		catch (SQLException exec) {
			exec.printStackTrace();
		}
		
	}
	public static AdminLogin getInstance() {
		if (Login_page == null) {
			Login_page = new AdminLogin();
		}
		return Login_page;
	}
}