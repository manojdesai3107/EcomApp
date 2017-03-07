package com.sakha.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBMDDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	     Class.forName("oracle.jdbc.driver.OracleDriver");
	     Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","tiger");
         
	     DatabaseMetaData dbmd = conn.getMetaData();
	     
	    /* System.out.println("DB Prodcut Name : " + dbmd.getDatabaseProductName());
	     System.out.println("DB Prodcut Version : " + dbmd.getDatabaseProductVersion());
	     System.out.println("DB URL : " + dbmd.getURL());
	     System.out.println("DB Max Row Size : " + dbmd.getMaxRowSize());
	     System.out.println("DB SQL Keywords : " + dbmd.getSQLKeywords());*/
	     
	     Statement stmt = conn.createStatement();
	     
	     String query = "Select * from STUDENT_INFO";
	     ResultSet rs = stmt.executeQuery(query);
	     ResultSetMetaData rsmd = rs.getMetaData();
	     
	     int ccount = rsmd.getColumnCount();
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("Enter table Name : ");
	     String table = sc.next();
	     String query1 = "Select * from " + table;
	     System.out.println("Records of the Table : " + table);
	     System.out.println("_______________________________________________");
	     for (int i = 0; i <= ccount; i++) {
			System.out.println(rsmd.getColumnName(i) + "\t");
		}
	     System.out.println("\n");	     
	     /*System.out.println("Total columns available : " + rsmd.getColumnCount());
	     System.out.println("Schema Name : " + rsmd.getSchemaName(1));
	     System.out.println("Datatype of column1 : " + rsmd.getColumnTypeName(1));
	     System.out.println("Datatype of column2 : " + rsmd.getColumnType(2));
	     
	     System.out.println("First Column");*/
	     while (rs.next()) {
	    	 for (int i = 1; i <= ccount; i++) {
				System.out.println(rs.getString(i) + "\t");
			}
	    	 System.out.println("\n");
	     }
	     
	     conn.close();
	}

}
