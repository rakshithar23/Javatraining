package com.ammu.cart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	private static Delete delete = null;
  
	public void user() {
      try {	
      String Url = "jdbc:mysql://localhost:3306/ammunition_store";
      Connection connection = DriverManager.getConnection(Url, "root", "admin123");
      System.out.println("Connection established......");
      Statement statement = connection.createStatement();
      String query = "Truncate table my_cart";
      statement.execute(query);
   }
      catch (SQLException e) {

  		e.printStackTrace();
  	}
	}
	public static Delete getInstance() {
		if (delete == null) {
			delete = new Delete();
		}
		return delete;
	}
}