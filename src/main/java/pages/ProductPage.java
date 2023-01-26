package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

	String Pagename = "//span[@class='title']";
	By prodname = By.xpath("//div[@class='inventory_item_name'][1]");
	By prodprice = By.xpath("//div[@class='inventory_item_price'][1]");

	By Addtocart = By.name("add-to-cart-sauce-labs-backpack");

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor
	}

	public boolean verifyPageDisplayedIsCorrect(String expectedPagename) {
		By pageNameFullXpath = By.xpath(String.format(Pagename, expectedPagename));

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

}