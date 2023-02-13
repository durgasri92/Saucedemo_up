package testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest {

	@Test(priority = 4)
	public void Paymentpg() {

		String itemName = "//div[@class='inventory_item_name']";
		AssertJUnit.assertEquals(paymentpage.verifyItemNameIsCorrect(itemName), true);
		String itemPrice = "//div[@class='inventory_item_price']";
		AssertJUnit.assertEquals(paymentpage.verifyItemPriceIsCorrect(itemPrice), true);
		String Tax = "//div[@class='summary_tax_label']";
		AssertJUnit.assertEquals(paymentpage.verifyTaxIsCorrect(Tax), true);
		String totalAmount = "//div[@class='summary_total_label']";
		AssertJUnit.assertEquals(paymentpage.verifyTotalAmountIsCorrect(totalAmount), true);
		paymentpage.clickFinishButton();

	}

}
