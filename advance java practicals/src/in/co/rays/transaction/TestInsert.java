package in.co.rays.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {
	public static void main(String[]args) throws Exception {
		Connection conn=null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		Statement stmt=conn.createStatement();
		conn.setAutoCommit(false);
		int i=stmt.executeUpdate("insert into marksheet values(300,3000,'priya',80,81,82)");
		    i=stmt.executeUpdate("insert into marksheet values(301,3001,'poonam',66,78,90)");
		    i=stmt.executeUpdate("insert into marksheet values(301,3001,'poonam',66,78,90)");
		    
		    conn.commit();
		    System.out.println("data inserted="+i);
		
		}catch (Exception e) {
			conn.rollback();
			System.out.println(e.getMessage());
		}  finally {
			conn.close();
		}
		
		
	}

}
