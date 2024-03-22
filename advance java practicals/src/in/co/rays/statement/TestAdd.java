package in.co.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestAdd {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn        = DriverManager. getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		
		
		Statement stmt=   conn.createStatement();
		
		     //    int i=      stmt.executeUpdate("alter table marksheet add  subject varchar(50)");
		         
		         int j=   stmt.executeUpdate("alter table marksheet drop subject");
		
		
		System.out.println(j);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
