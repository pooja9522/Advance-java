package in.co.rays.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestProcedureOutput {
	
	public static void main(String[] args)  {
		
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical", "root", "root");
		
		CallableStatement cs =conn.prepareCall("{Call empOut(?)}");
		
		cs.setInt(1, 1);
		
		// when we shall decide first give input in my sql cmd then we will no change input in class always 
		 //get result same as my input id
		cs.execute();
		
		cs.registerOutParameter(1, Types.INTEGER);
		
		int result =cs.getInt(1);
		
		System.out.println("show result "+"="+ result);
		}catch(Exception e) {
			
			e.getMessage();
		}
		
		
		
		
		
		
		
	}

}
