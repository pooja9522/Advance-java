package in.co.rays.test;
        
        import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

import in.co.rays.Marksheet.MarksheetBean;
import in.co.rays.Marksheet.MarksheetModel;
import in.co.rays.util.JDBCDataSource;

		public class TestJDBC {
			
			
		    public static void main(String[] args) throws Exception {

				for (int i = 1; i <= 30; i++) {

					System.out.println("Connection = " + i);

					//testSearchSimple();
					 testAdd() ;
				}

			}
			  
		    public static void testAdd() throws Exception {
		    		
		    		
		    	Connection conn = JDBCDataSource.getConnection();

		    		MarksheetBean bean = new MarksheetBean();

		    		bean.setId(107);
		    		bean.setRollno(1000);
		    		bean.setName("Ravdi");
		    		bean.setPhysics(60);
		    		bean.setChemistry(90);
		    		bean.setMaths(27);

		    		MarksheetModel model = new MarksheetModel();
		    		model.add(bean);
		    		
		    	
				conn.close();
		    	}
		    
		
		public static void testSearchSimple() throws Exception {
			
			
	    	Connection conn = JDBCDataSource.getConnection();

			MarksheetModel model = new MarksheetModel();
			List list = model.searchSimple();
			Iterator it = list.iterator();

			while (it.hasNext()) {
				MarksheetBean bean = (MarksheetBean) it.next();

				System.out.println(bean.getId());
				System.out.println(bean.getRollno());
				System.out.println(bean.getName());
				System.out.println(bean.getPhysics());
				System.out.println(bean.getChemistry());
				System.out.println(bean.getMaths());
			}

		}

		}

