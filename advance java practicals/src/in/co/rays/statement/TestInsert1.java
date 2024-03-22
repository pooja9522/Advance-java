package in.co.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert1 {
	
	public static void main (String[]args) throws Exception {
		
	Class.forName("com.mysql.jc.jdbc.Driver");
	
	
	     Connection conn=DriverManager .  getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
	     
	      Statement stmt=  conn.createStatement();
	      
	             int i  =  stmt.executeUpdate("insert into marksheet values (13,113,'meena' ,80,90,60)");
	             
	             System.out.println(i);
			
	}
	}