package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePage {

	By itemName = By.xpath("//div[@class='inventory_item_name']");
	By itemPrice = By.xpath("//div[@class='inventory_item_price']");
	By Tax = By.xpath("//div[@class='summary_tax_label']");
	By totalAmount = By.xpath("//div[@class='summary_total_label']");
	By Finishbutton = By.id("finish");

	public PaymentPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}

	public void FinalPrice() {
		// System.out.println(getText(tax));
		String taxamount = getText(Tax); // Tax: $2.40
		String ProductPrice = getText(itemPrice); // $29.99
		float finalPrice = Float.parseFloat(taxamount.substring(6, taxamount.length()))
				+ Float.parseFloat(ProductPrice.substring(1, ProductPrice.length()));
		System.out.println("Total price of the Product:" + "$" + finalPrice);

		// if (taxamount > 0) {

		// System.out.println(taxamount+ "is greater than zero");
//	        }
//    else {
//		System.out.println(taxamount+ "is not greater than zero");
//	}

	}

	String productName = "//div[@class='inventory_item_name']";

	public boolean verifyItemNameIsCorrect(String expectedUsername) {
		By productNameFullXpath = By.xpath(String.format(productName, expectedUsername));

		return isElementPresent(productNameFullXpath);

	}

	String prodPrice = "//div[@class='inventory_item_price']";

	public boolean verifyItemPriceIsCorrect(String expectedUsername) {
		By productpriceXpath = By.xpath(String.format(prodPrice, expectedUsername));

		return isElementPresent(productpriceXpath);
	}

	public void clickFinishButton() {
		clickElement(Finishbutton);
	}

}
