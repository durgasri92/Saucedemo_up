package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	protected static WebDriver driver2;

	public BasePage(WebDriver driver) {
		driver2 = driver;
	}

	protected void clickElement(By element) {
		driver2.findElement(element).click();
	}

	protected void setText(By element, String textToType) {
		driver2.findElement(element).sendKeys(textToType);
	}

	protected String getText(By element) {
		return driver2.findElement(element).getText();
	}

	protected boolean isElementPresent(By element) {
		return driver2.findElement(element).isDisplayed();
	}

}
