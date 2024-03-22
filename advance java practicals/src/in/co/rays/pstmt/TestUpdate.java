package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestUpdate {
	
	public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
          Connection conn    =      DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
          				
		
		PreparedStatement ps= conn.prepareStatement("update  marksheet set name='manoj' where id=5");
		
		  int i= ps.executeUpdate();
		  
		  System.out.println("updated in database"+i);
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	
		

}
