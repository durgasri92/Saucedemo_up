package testcases;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import utils.DataUtils;

public class CheckoutTest extends BaseTest1 {

	@Test
	public void Paymentpg() {
		String Username = DataUtils.getTestData("config", "Username");
		String Password = DataUtils.getTestData("config", "Password");

		loginPage.logintoApplication(Username, Password);

		// ****product page and adding 1st item to cart
		String PageName = driver.get().findElement(By.xpath("//span[@class='title']")).getText();
		AssertJUnit.assertEquals(productpage.verifyPageDisplayedIsCorrect(PageName), true);

		String ProductName = productpage.getProductname();
		System.out.println("ProductName is" + ProductName);
		String ProductPrice = productpage.priceofproduct();
		System.out.println("ProductPrice is" + ProductPrice);

		// // conversion to rupees
		//
//		     int Productrate = Interger.parseint("ProductPrice");
		// double ProductinRupee = (Productrate * 81.53);
		// System.out.println("ProductinRupee" +ProductinRupee);

		productpage.addtheproduct();
		productpage.clickoncart();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ****product checkout to continue to personal details page
		checkoutpage.clickoncheckout();

		// ****personal details page

		String FName = DataUtils.getTestData("config", "FirstName");
		String LName = DataUtils.getTestData("config", "LastName");
		String PostCode = DataUtils.getTestData("config", "PostalCode");

		personalinfopage.PersonalInformation(FName, LName, PostCode);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String itemName = "//div[@class='inventory_item_name']";
		AssertJUnit.assertEquals(paymentpage.verifyItemNameIsCorrect(itemName), true);
		String itemPrice = "//div[@class='inventory_item_price']";
		AssertJUnit.assertEquals(paymentpage.verifyItemPriceIsCorrect(itemPrice), true);

		paymentpage.FinalPrice();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		paymentpage.clickFinishButton();

		// ****Confirmation message page
		String Msg = "//h2[text()='THANK YOU FOR YOUR ORDER']";

		AssertJUnit.assertEquals(confirmpage.validatesuccessMsg(Msg), true);

		System.out.println("The message is:" + confirmpage.getsuccessmsg());

	}
}
