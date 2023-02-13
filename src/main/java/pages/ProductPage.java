package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

	String Pagename = "//span[@class='title']";

	By prodname = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");
	By prodprice = By.xpath("//div[@class='inventory_item_price']");

	By Addtocart = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
	By cart = By.xpath("//a[@class='shopping_cart_link']");

	public ProductPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}

	public boolean verifyPageDisplayedIsCorrect(String expectedUsername) {
		By pageNameFullXpath = By.xpath(String.format(Pagename, expectedUsername));

		return isElementPresent(pageNameFullXpath);
	}

	public String getProductname() {
		return getText(prodname);

	}

	public String priceofproduct() {
		return getText(prodprice);
	}

	public void addtheproduct() {
		clickElement(Addtocart);
	}

	public void clickoncart() {
		clickElement(cart);
	}
}