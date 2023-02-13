package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	By userNameTextbox = By.id("user-name");
	By passwordTextbox = By.id("password");
	By loginbtn = By.id("login-button");

	public LoginPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}

	public void logintoApplication(String Username, String Password) {
		setText(userNameTextbox, Username);
		setText(passwordTextbox, Password);
		clickElement(loginbtn);
	}

}
