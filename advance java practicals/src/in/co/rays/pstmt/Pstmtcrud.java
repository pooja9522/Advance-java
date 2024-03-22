package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Pstmtcrud {
	
	public static void main(String[] args) throws Exception  {
		
		//testInsert();
		testRead();
	}
	
		public static void testInsert () throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			
	        Connection conn      =  DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");	
	        
	         PreparedStatement ps=conn.prepareStatement("insert into marksheet values(21,115,'muskaan',80,70,80)");
	         
			int i=ps.executeUpdate();
			
			System.out.println("inserted"+i);
			
			
			
			
			
			
		}
		
		
	public static void testUpdate() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
        Connection conn    =      DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
        				
		
		PreparedStatement ps= conn.prepareStatement("update  marksheet set name='manoj' where id=5");
		
		  int i= ps.executeUpdate();
		  
		  System.out.println("updated in database"+i);
		
			
		
	}
		
		
		
	public  static void testDelete() throws Exception {
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn  =     DriverManager .getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		
		PreparedStatement ps=  conn.prepareStatement("delete from marksheet where id=19");
		
		int i=ps.executeUpdate();
		
		System.out.println("deleted succsessfully"+i);
			
		
		
	}
		
	public  static  void testRead() throws Exception {
		
		
	Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection conn    = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		
	PreparedStatement ps        =   conn.prepareStatement("select*from marksheet");
	
	ResultSet rs= ps.executeQuery() ;
	
	
	while(rs.next()) {
		
		
		System.out.print("\t"+rs.getInt(1));
		System.out.print("\t"+rs.getInt(2));
		System.out.print("\t"+rs.getString(3));
		System.out.print("\t"+rs.getInt(4));
		System.out.print("\t"+rs.getInt(5));
		System.out.println("\t"+rs.getInt(6));
		
	}
		
		
	}
		
}	
		
	
	

