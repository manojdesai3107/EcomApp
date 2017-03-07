package com.sakha.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class callableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","tiger");
		
		CallableStatement cs = conn.prepareCall("{call GETNAME(?,?)}");
		cs.setInt(1, 2);
		cs.registerOutParameter(2, java.sql.Types.VARCHAR);
		cs.execute();
		String studentname = cs.getString(2);
		System.out.println("Student name is : " + studentname + " for id = 2 ");
		cs.close();
		conn.close();

	}

}
