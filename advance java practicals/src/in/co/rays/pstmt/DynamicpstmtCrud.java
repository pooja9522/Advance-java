package in.co.rays.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DynamicpstmtCrud {
	
	public static void main(String[]args) throws Exception {
		
	    testRead();
		//testInsert(30,303,"lucky",70,80,90);
		//testUpdate("pooja",2);
		//testDelete(19);
		
		
		
	}
		
		public static void testInsert(int id,int rollno,String name,int physics,int chemistry,int maths)throws Exception {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		
		   PreparedStatement ps=conn.prepareStatement("insert into marksheet values (?,?,?,?,?,?)");
		   
		   ps.setInt(1, id);
		   ps.setInt(2, rollno);
		   ps.setString(3, name);
		   ps.setInt(4, physics);
		   ps.setInt(5, chemistry);
		   ps.setInt(6, maths);
		   
	      int i = ps.executeUpdate();
	      
	      System.out.println("data inserted"+i);
			
			
			
			
		}
		
		public static void testUpdate(String name,int id) throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
			
			PreparedStatement ps= conn.prepareStatement("update marksheet set name=? where id=?");
			
			ps.setString(1,name);
			ps.setInt(2, id);
			
		int i=	ps.executeUpdate();
		
		System.out.println("data updated"+i);
			
		
}
		
		public static void testDelete(int id) throws Exception {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
			
			PreparedStatement ps=conn.prepareStatement("delete from marksheet where id=?");
			
			ps.setInt(1,id);
			
	  int i=	ps.executeUpdate();
	  
	  System.out.println("data deleted"+i);
	  
	  
}
		
       public static void testRead() throws Exception {
    	    
    	  Class.forName("com.mysql.cj.jdbc.Driver");
    	  
    	  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
    	  
    	  PreparedStatement ps=conn.prepareStatement("select*from marksheet");
    	  
    	 ResultSet rs= ps.executeQuery();
    	 
    	 while (rs.next()) {
    		 System.out.print("\t"+rs.getInt(1));
    		 System.out.print("\t"+rs.getInt(2));
    		 System.out.print("\t"+rs.getString(3));
    		 System.out.print("\t"+rs.getInt(4));
    		 System.out.print("\t"+rs.getInt(5));
    		 System.out.println("\t"+rs.getInt(6));
    	 
    	 
    	// System.out.println("data Read"+rs);
    	  
    	 }   
       }


		
		
		
	}
