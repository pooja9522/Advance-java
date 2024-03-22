package in.co.rays.Marksheet;

import java.util.Iterator;
import java.util.List;

public class TestSMarksheet extends SMarksheetBean {
	
	
	public static void main(String[] args) throws Exception {
		
		testSearch();
		//testFindByPk();
		//testSearchSimple();
		//testSearch1();
		
		
		
		
		
	}
	
	public static void testSearch() throws Exception {
		
		SMarksheetModel model=new SMarksheetModel();
		model.search();
		
	}
	
	
	
	public static void testFindByPk() throws Exception {
		SMarksheetModel  model= new SMarksheetModel(); 
		SMarksheetBean bean=model.findByPk(5);
		
		System.out.print("\t"+bean.getId());
		System.out.print("\t"+bean.getRollno());
		System.out.print("\t"+bean.getName());
		System.out.print("\t"+bean.getPhysics());
		System.out.print("\t"+bean.getChemistry());
		System.out.println("\t"+bean.getMaths());
		
	}
	
	public static   void testSearchSimple() throws Exception {
		
		MarksheetModel model=new MarksheetModel();
		List list=model.searchSimple();
		
		Iterator it=list.iterator();
	while(it.hasNext())	{
		
	MarksheetBean bean=(MarksheetBean) it.next();
	
	System.out.print("\t"+bean.getId());
	System.out.print("\t"+bean.getRollno());
	System.out.print("\t"+(bean.getName()));
	System.out.print("\t"+bean.getPhysics());
	System.out.print("\t"+bean.getChemistry());
	System.out.println("\t"+bean.getMaths());
	}
		
		
		
	
	}
private static void testSearch1() throws Exception {

	SMarksheetBean bean = new SMarksheetBean();
    bean.setId(5);
	//bean.setName("p");

	SMarksheetModel model = new  SMarksheetModel();

	List list = model.search1(null, 5, 3);

	Iterator it = list.iterator();

	while (it.hasNext()) {
		bean = (SMarksheetBean) it.next();
		System.out.print(bean.getId());
		System.out.print("\t" + bean.getRollno());
		System.out.print("\t" + bean.getName());
		System.out.print("\t" + bean.getPhysics());
		System.out.print("\t" + bean.getChemistry());
		System.out.println("\t" + bean.getMaths());
	}
}
}