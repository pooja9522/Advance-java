package in.co.rays.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestProcedureInput {
	
	public static void main(String[] args)  {
		
		try {
			
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical", "root", "root");
		
		CallableStatement cs =conn.prepareCall("{Call empIn(?)}");
		
		cs.setInt(1, 2);
		
		cs.execute();
		
		ResultSet rs =cs.getResultSet();
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getInt(4));
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}

}
}
