package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestInsert {
	
	
	public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		
		
        Connection conn      =  DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");	
        
         PreparedStatement ps=conn.prepareStatement("insert into marksheet values(19,115,'muskaan',80,70,80)");
         
		int i=ps.executeUpdate();
		
		System.out.println("inserted"+i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
