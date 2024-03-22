package in.co.rays.Marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {

		// testSearch();
		// // testDelete();
		// testAdd();
		// testUpdate();
		// testFindByPk();
		// testSearchSimple();

		testSearch1();

	}

	public static void testNextPk() throws Exception {
		MarksheetModel model = new MarksheetModel();

		Integer pk = model.nextPk();

		System.out.println("pk =" + pk);
	}

	public static void testFindByPk() throws Exception {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = model.findByPk(1);
		System.out.print("\t" + bean.getId());
		System.out.print("\t" + bean.getRollno());
		System.out.print("\t" + bean.getName());
		System.out.print("\t" + bean.getPhysics());
		System.out.print("\t" + bean.getChemistry());
		System.out.println("\t" + bean.getMaths());
	}

	public static void testSearchSimple() throws Exception {
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

	public static void testSearch() throws Exception {
		MarksheetModel model = new MarksheetModel();
		model.search();
	}

	public static void testDelete() throws Exception {
		MarksheetModel model = new MarksheetModel();
		model.delete(2);
	}

	public static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setId(5);
		bean.setRollno(50);
		bean.setName("BhanuMati");
		bean.setPhysics(70);
		bean.setChemistry(80);
		bean.setMaths(100);

		MarksheetModel model = new MarksheetModel();
		model.update(bean);
	}

	public static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setId(100);
		bean.setRollno(1000);
		bean.setName("Ravdi");
		bean.setPhysics(60);
		bean.setChemistry(90);
		bean.setMaths(27);

		MarksheetModel model = new MarksheetModel();
		model.add(bean);

	}

	private static void testSearch1() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		// bean.setId(2);
		bean.setName("p");

		MarksheetModel model = new MarksheetModel();

		List list = model.search1(null, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (MarksheetBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRollno());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());
		}

	}
}