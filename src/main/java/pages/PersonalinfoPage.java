package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PersonalinfoPage extends BasePage {

	By FNameTextbox = By.name("firstName");
	By LNameTextbox = By.name("lastName");
	By PCodeTextbox = By.id("postal-code");
	By Cntinue = By.xpath("//input[@id='continue']");

	public void PersonalInformation(String FirstName, String LastName, String PostalCode) {
		setText(FNameTextbox, FirstName);
		setText(LNameTextbox, LastName);
		setText(PCodeTextbox, PostalCode);
		clickElement(Cntinue);
	}

	public PersonalinfoPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}

	public void clickcontinuebutton() {
		clickElement(Cntinue);

	}

}
