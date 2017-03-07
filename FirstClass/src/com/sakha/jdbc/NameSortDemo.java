package com.sakha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NameSortDemo {
	Connection con = null;
	public void connectDataBase() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","tiger");
	}
    public void sortStudents() throws SQLException {
    	
		Statement stmt = con.createStatement();
	
        String query = "Insert into STUDENT_INFO values(?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to insert a row in table (Y/N) ?");
        String a = scan.nextLine();
        int i=0;
        while(a.equalsIgnoreCase("Y")) {
        	System.out.println("Enter SID : ");
        	ps.setInt(1, scan.nextInt());
        	System.out.println("Enter Name :");
        	ps.setString(2, scan.next());
        	i+=ps.executeUpdate();
        	System.out.println("Do you want to insert a row in table (Y/N) ?");
        	a = scan.next();
        }
        System.out.println("Rows Inserted : " + i);
        con.close();
   }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NameSortDemo nsd = new NameSortDemo();
		nsd.connectDataBase();
		nsd.sortStudents();

	}

}
