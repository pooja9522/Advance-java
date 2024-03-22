package in.co.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestRead1 {
	
	public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.jc.jdbc.driver");
		
		
		Connection conn     =   DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		
		 Statement stmt=      conn.createStatement();
		 
		// ResultSet rs= stmt.executeQuery("select*from marksheet");
		 
		 ResultSet rs=stmt.executeQuery("select*from marksheet limit 0,5");
		 
		 
		 while(rs.next()) {
			 
			 
			 System.out.println("\t"+rs.getInt(1));
			// System.out.print("\t"+rs.getInt(2));
			 //System.out.print("\t"+rs.getString(3));
			// System.out.print("\t"+rs.getInt(4));
			// System.out.print("\t"+rs.getInt(5));
			// System.out.print("\t"+rs.getInt(6));
			// System.out.print("\t"+rs.getInt(7));
			// System.out.print("\t"+rs.getInt(8));
			// System.out.println("\t"+rs.getInt(9));
			 
			 
			 
	 }
		}
	}
