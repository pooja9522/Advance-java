package in.co.rays.test;


	
	import java.util.Locale;

	import java.util.ResourceBundle;

	public class TestResourceBundleApp_hi {

		public static void main(String[] args) {

		
			 ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.app");
			ResourceBundle rb1 = ResourceBundle.getBundle("in.co.rays.bundle.app_hi");

			 ResourceBundle rb2 = ResourceBundle.getBundle("in.co.rays.bundle.app", new
			Locale("hi"));

				


			
			System.out.println(rb2.getString("greeting"));

		}

	}


