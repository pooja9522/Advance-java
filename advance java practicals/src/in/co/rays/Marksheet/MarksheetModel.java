package in.co.rays.Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarksheetModel {
	
	
	
	public Integer nextPk() throws Exception {
		
		int pk=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("mysql:jdbc://localhost:3306/Advance_practical","root","root");
		
		PreparedStatement ps=conn.prepareStatement("select max(id) from marksheet");
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			pk=rs.getInt(1);
		}
		return pk+1;
	}
	
	
	
	public void add(MarksheetBean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		
		PreparedStatement ps=conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?) ");
		
		ps.setInt(1, bean.getId());
		ps.setInt(2, bean.getRollno());
		ps.setString(3, bean.getName());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		
	int i=	ps.executeUpdate();
	System.out.println("data added"+i);
	}
	
	public  void  update(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		
		PreparedStatement ps=conn.prepareStatement("update marksheet set roll_no=?,name=?,physics=?,chemistry=?,maths=? where id=?");
		
		ps.setInt(1, bean.getRollno());
		ps.setString(2,bean.getName() );
		ps.setInt(3, bean.getPhysics());
		ps.setInt(4, bean.getChemistry());
		ps.setInt(5, bean.getMaths());
		ps.setInt(6, bean.getId());
		
		
		int i=ps.executeUpdate();
		
		System.out.println("data updated"+i);
		
		
		
	}
	
	public void delete(int id)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		PreparedStatement ps=conn.prepareStatement("delete from marksheet where id=?");
		ps.setInt(1, id);
		
	int i=	ps.executeUpdate();
		
		System.out.println("data deleted"+i);
		
		
		
		}
	public void search() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		PreparedStatement ps=conn.prepareStatement("select*from marksheet");
		ResultSet rs=  ps.executeQuery();
		
		while(rs.next()) {
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getInt(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("\t"+rs.getInt(4));
			System.out.print("\t"+rs.getInt(5));
			System.out.println("\t"+rs.getInt(6));
		}
		
	}
	
	public List searchSimple()throws Exception{
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		PreparedStatement ps=conn.prepareStatement("select*from marksheet");
		ResultSet rs=  ps.executeQuery();
		
		List list=new ArrayList();
		
		
		while(rs.next()) {
			
		MarksheetBean bean=new MarksheetBean();
		
		bean.setId(rs.getInt(1));
		bean.setRollno(rs.getInt(2));
		bean.setName(rs.getString(3));
		bean.setPhysics(rs.getInt(4));
		bean.setChemistry(rs.getInt(5));
		bean.setMaths(rs.getInt(6));
		
		list.add(bean);
		
		}
		return list;
		
	}

		
		public MarksheetBean findByPk(int id) throws  Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager .getConnection("jdbc:mysql://localhost:3306/advance_practical","root","root");
		
		PreparedStatement ps=conn.prepareStatement("select*from marksheet where id=?");
		
		ps.setInt(1, id);
		
		ResultSet rs=ps.executeQuery();
		
		MarksheetBean bean= new  MarksheetBean();
		
		while (rs.next()) {
			
		bean.setId(rs.getInt(1));
		bean.setRollno(rs.getInt(2));
		bean.setName(rs.getString(3));
		bean.setPhysics(rs.getInt(4));
        bean.setChemistry(rs.getInt(5));
        bean.setMaths(rs.getInt(6));
			
			
			}
		
		return bean;
	}
		public List search1(MarksheetBean bean, int pageNo, int pageSize) throws Exception{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_Practical","root","root");
			
			StringBuffer sql=new StringBuffer("select*from marksheet where 1=1");
			
			if(bean!=null) {
				//if(bean.getId()>0) {
				//	sql.append("and id="+ bean.getId());
				
				//}
				
			   if (bean.getName()!=null && bean.getName().length()>0) {
				   sql.append("and name like'"+bean.getName()+ "% '");
			   }
			}
			
			if(pageSize>0) {
				pageNo=(pageNo-1)*pageSize;
			sql.append	("limit" +  pageNo +",  "+ pageSize);
				
				
				}
			System.out.println("sql=>"  +sql);
			
			PreparedStatement ps= conn.prepareStatement(sql.toString());
			
			ResultSet rs=ps.executeQuery();
			
			List list = new ArrayList();

			while (rs.next()) {
				bean = new MarksheetBean();
				bean.setId(rs.getInt(1));
				bean.setRollno(rs.getInt(2));
				bean.setName(rs.getString(3));
				bean.setPhysics(rs.getInt(4));
				bean.setChemistry(rs.getInt(5));
				bean.setMaths(rs.getInt(6));
				list.add(bean);
			}

			return list;

		}
		
		


}
	
