package com.ammu.cart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminView {
	private static AdminView adminview = null;
	public void select() {
      String JdbcURL = "jdbc:mysql://localhost:3306/ammunition_store";
      String Username = "root";
      String password = "admin123";
      Connection connection = null;
      PreparedStatement preparestatement = null;
      ResultSet resultset = null;
      String myQuery = "select Request_id,Customer_name,Email_id,Quantity,Product_name,Requested_date,Address,User_id from order_details";
      try {
         connection = DriverManager.getConnection(JdbcURL, Username, password);
         preparestatement = connection.prepareStatement(myQuery);
         resultset = preparestatement.executeQuery();
         System.out.println("Request_id\tCustomer_name\tEmail_id\tQuantity\tProduct_name\tRequested_date\tAddress\t\tUser_id");
         while(resultset.next()) {
            System.out.print(resultset.getInt(1));
            System.out.print("\t\t"+resultset.getString(2));
            System.out.print("\t\t"+resultset.getString(3));
            System.out.print("\t"+resultset.getString(4));
            System.out.print("\t\t"+resultset.getString(5));
            System.out.print("\t"+resultset.getString(6));
            System.out.print("\t"+resultset.getString(7));
            System.out.println();
            
         }
      }
       catch(Exception exec) {
         exec.printStackTrace();
      }
	}
	public static AdminView getInstance() {
		if (adminview == null) {
			adminview = new AdminView();
		}
		return adminview;
	}
}