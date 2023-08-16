package com.ammu.cart;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AdminPlace {
	private static AdminPlace adminplace = null;
	public void select() {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultset = null;

    try {
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ammunition_store", "root", "admin123");
      statement = connection.createStatement();
      Scanner scanner=new Scanner(System.in);
		System.out.print("Enter request id : ");
		String id=scanner.nextLine();
		String query="Select * from order_details where Request_id='"+id+"'";
		resultset=statement.executeQuery(query);
		if(resultset.next())
		{
			do
			{
	resultset = statement.executeQuery("SELECT * FROM order_details where Request_id='"+id+"'");
	 
      if (resultset.next()){
        String sql = "INSERT INTO confirmed_order (Request_id,Customer_name,Email_id,Quantity,Product_name,Requested_date,Address,User_id) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStmt = connection.prepareStatement(sql);
        preparedStmt.setString(1, resultset.getString("Request_id"));
        preparedStmt.setString(2, resultset.getString("Customer_name"));
        preparedStmt.setString(3, resultset.getString("Email_id"));
        preparedStmt.setString(4, resultset.getString("Quantity"));
        preparedStmt.setString(5, resultset.getString("Product_name"));
        preparedStmt.setString(6, resultset.getString("Requested_date"));
        preparedStmt.setString(7, resultset.getString("Address"));
        preparedStmt.setString(8, resultset.getString("User_id"));
        preparedStmt.execute();
      
        try {
            Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ammunation_store", "root", "admin123");
            PreparedStatement statement1 = connection1.prepareStatement("DELETE FROM order_details WHERE Request_id = ? ");
            statement1.setString(1, id);
            int rowsDeleted = statement1.executeUpdate();
            if (rowsDeleted > 0) {
            	  System.out.println("Order placed Successfully");
            } else {
                System.out.println("Failed to place order");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
      }
		}
			while(resultset.next());	
    } else
    {
    	System.out.println("Failed to place order");
    }
    }
		catch (SQLException e) {
      System.out.println(e);
    } finally {
     
      if (resultset != null) {
        try {
        	resultset.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
      }
      if (statement != null) {
        try {
			statement.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
      }
      if (connection != null) {
        try {
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
      } 
    }
    }
	public static AdminPlace getInstance() {
		if (adminplace == null) {
			adminplace= new AdminPlace();
		}
		return adminplace;
	}
}