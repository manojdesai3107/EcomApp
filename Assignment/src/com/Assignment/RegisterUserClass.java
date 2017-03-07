package com.Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class RegisterUserClass extends ConnectionManager {
	static String Uname;
	static String Pwd;
  
      public static void Insertrecord () throws SQLException, ClassNotFoundException {
    	  Class.forName("oracle.jdbc.driver.OracleDriver");
  		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","tiger");
    	  //ConnectionManager conn = new ConnectionManager();
    	 Statement stmt = conn.createStatement();
  		String qurey = "Insert into STUDENT values(?,?)";
  		PreparedStatement ps =  conn.prepareStatement(qurey);
  		
  		Scanner scan = new Scanner(System.in);
          System.out.println("Do you want to Register (Y/N) ?");
         
  		String a = scan.nextLine();
          int i=0;
          while(a.equalsIgnoreCase("Y")) {
          	System.out.println("Create Your Username : ");
          	ps.setString(1, scan.next());
          	System.out.println("Create Your Password :");
          	ps.setString(2, scan.next());
          	System.out.println("Enter Your Name : ");
          	/*ps.setString(3, scan.next());
          	System.out.println("Enter Your Email-ID : ");
          	ps.setString(4, scan.next());
          	System.out.println("Enter Your Mobile NO. :");
          	ps.setInt(5, scan.nextInt());*/
          	i+=ps.executeUpdate();
          	System.out.println("Do you want to Register For other user(Y/N) ?");
          	a = scan.next();
          	System.out.println("Registered Successfully");
          }
          //System.out.println("Registered Successfully"); 

      }
}
