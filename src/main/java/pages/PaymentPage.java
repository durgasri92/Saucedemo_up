package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePage {

	String itemName = "//div[@class='inventory_item_name']";
	String itemPrice = "//div[@class='inventory_item_price']";
	String Tax = "//div[@class='summary_tax_label']";
	String totalAmount = "//div[@class='summary_total_label']";
	By Finishbutton = By.id("finish");

	public PaymentPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}

	public boolean verifyItemNameIsCorrect(String expectedItemName) {
		By itemNameFullXpath = By.xpath(String.format(itemName, expectedItemName));
		return isElementPresent(itemNameFullXpath);
	}

	public boolean verifyItemPriceIsCorrect(String expectedItemPrice) {
		By itemPriceFullXpath = By.xpath(String.format(itemPrice, expectedItemPrice));
		return isElementPresent(itemPriceFullXpath);
	}

	public boolean verifyTaxIsCorrect(String expectedTax) {
		By itemNameFullXpath = By.xpath(String.format(Tax, expectedTax));
		return isElementPresent(itemNameFullXpath);
	}

	public boolean verifyTotalAmountIsCorrect(String expectedTotalAmount) {
		By itemNameFullXpath = By.xpath(String.format(totalAmount, expectedTotalAmount));
		return isElementPresent(itemNameFullXpath);
	}

	public void clickFinishButton() {
		clickElement(Finishbutton);
	}

}
