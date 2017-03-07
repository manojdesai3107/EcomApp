package com.sakha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
	          //Step 1 and 2 Loading and Registering
              Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sakha.manoj");
              Statement stmt = conn.createStatement();
              String query = "select * from EMPLOYEE";
              //System.out.println("test");
              ResultSet rs = stmt.executeQuery(query);
              while (rs.next())
              {
            	  System.out.println(rs.getString(1) + "\t" + rs.getInt(2) + "\t" + rs.getInt(3) + "\t" + rs.getInt(4));
              }
              conn.close();
	}

}
