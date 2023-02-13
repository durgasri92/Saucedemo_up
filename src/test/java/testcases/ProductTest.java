package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import utils.DataUtils;

public class ProductTest extends BaseTest {

	@Test

	public void Productpg() {
		

		String ProductName = productpage.getProductname();
		System.out.println("ProductName is" + ProductName);
		String ProductPrice = productpage.priceofproduct();
		System.out.println("ProductPrice is" + ProductPrice);

//	  // conversion to rupees
//	  
//	     int Productrate = Interger.parseint("ProductPrice");
		// double ProductinRupee = (Productrate * 81.53);
		// System.out.println("ProductinRupee" +ProductinRupee);float dollars;

		productpage.addtheproduct();
		productpage.clickoncart();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
