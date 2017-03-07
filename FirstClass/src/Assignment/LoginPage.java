/*package Assignment;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginPage {
	static ArrayList Uname = new ArrayList();
	static ArrayList Pwd = new ArrayList();
	

   public static void Login() throws ClassNotFoundException, SQLException {
	   System.out.println("If you are already registered please select N as Option");
	  RegisterUserClass.Insertrecord();
	  System.out.println("Login with above registered credentials ");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Username : ");
	String un = sc.nextLine();
	System.out.println("Enter Password: ");
	String pswd = sc.nextLine();
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","tiger");
	
	java.sql.Statement stmet = conn.createStatement();
	ResultSet rs = stmet.executeQuery("select * from STUDENT");
	
	while(rs.next()) {
		Uname.add(rs.getString(1));
		Pwd.add(rs.getString(2));
	}
	if(Pwd.contains(pswd)&&un.contains(un))
	System.out.println("Login Successful");
	else 
		System.out.println("User not Found");
}
   public static void main(String[] args) throws ClassNotFoundException, SQLException {
	LoginPage lp = new LoginPage();
	lp.Login();  
}
}*/