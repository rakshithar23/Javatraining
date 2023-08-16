package com.ammu.products;

import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GunsDao {
private static GunsDao guns = null;
 public void select() {
	 String JdbcURL = "jdbc:mysql://localhost:3306/ammunation_store";
	 String Username = "root";
	 String password = "admin123";
	 Connection con = null;
	 PreparedStatement pstm = null;
	 ResultSet rst = null;
	 String myQuery = "select Product_id,Product_name,Quantity from guns_management";
	  try {
	     con = DriverManager.getConnection(JdbcURL, Username, password);
	     pstm = con.prepareStatement(myQuery);
	     rst = pstm.executeQuery();
	     System.out.println("Product_id\tProduct_name\t\tQuantity");
	   while(rst.next()) {
	         System.out.print(rst.getInt(1));
	         System.out.print("\t\t"+rst.getString(2));
	         System.out.print("\t\t"+rst.getInt(3));
	         System.out.println();
	         }
	 } catch(Exception exec) {
	         exec.printStackTrace();
	   }
	  try{
	    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ammunation_store","root","admin123");
	    Statement smt=cn.createStatement();
		DataInputStream KB=new DataInputStream(System.in);
		System.out.print("Enter product id: ");
	    String id=KB.readLine();
				
	 System.out.print("Enter product name: ");
	 String name=KB.readLine();
	 String q="Select * from guns_management where Product_id='"+id+"' and Product_name='"+name+"'";
	 ResultSet rs=smt.executeQuery(q);
		
		if(rs.next())
		{
		{do{
		System.out.print("Enter Quantity: ");
		String Quantity=KB.readLine();
		System.out.print("Enter User id: ");
		String User_id=KB.readLine();
		String query = "INSERT INTO my_cart(Product_id, Product_name, Quantity,User_id)" + "VALUES (?, ?, ?,?)";
		PreparedStatement pstmt = null;
		
		  pstmt = cn.prepareStatement(query);
		  pstmt.setString(1,id);
		  pstmt.setString(2, name);
		  pstmt.setString(3, Quantity);
		  pstmt.setString(4, User_id);
		  int status = pstmt.executeUpdate();
		  if(status > 0) {
		  System.out.println("Successfully added to cart");
		  String Product_id = rs.getString("Product_id");
		  String quantity = rs.getString("Quantity");
		  int newQuantity = Integer.parseInt(quantity) - Integer.parseInt(Quantity); }
 }while(rs.next());
					}}
	else
	{
	System.out.println("Record Not Found...");
	}
	cn.close();
	  }
	catch(Exception e)
	{
	System.out.println(e);
	}
		
	   } 
	public static GunsDao getInstance() {
	 if (guns == null) {
		 guns = new GunsDao();
			}
			return guns;
		}
	}


