package testcases;

import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

	@Test
	public void Productpg() {

		String ProductName = productpage.getProductname();
		System.out.println("ProductName");
		String ProductPrice = productpage.priceofproduct();
		System.out.println("ProductPrice");

		// conversion to rupees

		int Productrate = Integer.parseInt(ProductPrice);
		double ProductinRupee = (Productrate * 81.53);
		System.out.println("ProductinRupee");
		productpage.addtheproduct();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
