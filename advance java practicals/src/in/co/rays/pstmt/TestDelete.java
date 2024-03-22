package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestDelete {
	
	
	public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn  =     DriverManager .getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		
		PreparedStatement ps=  conn.prepareStatement("delete from marksheet where id=19");
		
		int i=ps.executeUpdate();
		
		System.out.println("deleted succsessfully"+i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	

}
