package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends BasePage {

	String confirmMsg = "//h2[text()='THANK YOU FOR YOUR ORDER']";

	By cnfmsg = By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]");

	public ConfirmationPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}

	public boolean validatesuccessMsg(String expectedMessage) {
		By messageFullXpath = By.xpath(String.format(confirmMsg, expectedMessage));
		return isElementPresent(messageFullXpath);
	}

	public String getsuccessmsg() {
		return getText(cnfmsg);
	}
}