package com.ammu.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

class Demo {
	private String User_id;
    private String Password;
    private String Email_id;
    private String Contact;
    private String City;
    private String State;
    private String Pincode;
    
    
  public Demo(String User_id, String Password, String Email_id, String Contact, String City, String State,String Pincode) {
	  this.User_id =User_id;
      this.Password = Password;
      this.Email_id = Email_id;
      this.Contact = Contact;
      this.City = City;
      this.State = State;
      this.Pincode = Pincode;
      
  }

  public String getUser_id() {
      return User_id;
  }

  public void setUser_id(String User_id) {
      this.User_id = User_id;
  }

  public String getPassword() {
      return Password;
  }


  public void setPassword(String Password) {
      this.Password = Password;
  }

  public String getEmail_id() {
      return Email_id;
  }

  public void setEmail_id(String Email_id) {
    this.Email_id = Email_id;
 }

  public String getContact() {
    return Contact; 
  }
  public void setContact(String Contact) {
    this.Contact = Contact;
  }


  public String getCity() {
    return City;
  }
  public void setCity(String City) {
    this.City = City;
  }

  public String getState() {
    return State;
  }
  public void setState(String State) {
    this.State = State;
  }

  public String getPincode() {
    return Pincode;
  }
  public void setPincode(String Pincode) {
    this.Pincode = Pincode;
  }
 

	}
	public class CustomerRegistration {
	 private static CustomerRegistration Registration_page = null;

	public void register() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter User_id: ");
    String User_id = scanner.next();

    System.out.print("Enter Password: ");
    String Password = scanner.next();

    System.out.print("Enter email id: ");
    String Email_id = scanner.next();
    
    System.out.print("Enter Age: ");
    String Age = scanner.next();
    
    System.out.print("Enter Contact: ");
    String Contact = scanner.next();
    
    System.out.print("Enter City: ");
    String City = scanner.next();
    
    System.out.print("Enter State: ");
    String State = scanner.next();
    
    System.out.print("Enter Pincode: ");
    String Pincode = scanner.next();
    
    System.out.print("Enter Role id: ");
    String Role_id = scanner.next();

    Demo demo = new Demo(User_id, Password, Email_id, Contact, City, State, Pincode);

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ammunition_store", "root", "admin123");
      PreparedStatement statement = connection.prepareStatement("INSERT INTO customer(User_Id, Password, Email_Id, Contact, City, State, Pincode,)" + "VALUES (?,?,?,?,?,?,?,?,?)");
      statement.setString(1,demo.getUser_id());
      statement.setString(2,demo.getPassword());
      statement.setString(3,demo.getEmail_id());
      statement.setString(5,demo.getContact());
      statement.setString(6,demo.getCity());
      statement.setString(7,demo.getState());
      statement.setString(8,demo.getPincode());
    
      statement.executeUpdate();
      System.out.println("Registered successfully");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  public static CustomerRegistration getInstance() {
		
		if(Registration_page ==null) {
			Registration_page  = new CustomerRegistration ();
		}
		return Registration_page;
  }
}