package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	By userNameTextbox = By.id("user-name");
	By passwordTextbox = By.id("password");
	By loginbtn = By.id("login-button");

	public LoginPage(WebDriver driver) {
		super(driver);
		// PageFactory.initElements(driver, this);
	}

	public void logintoApplication(String Username, String Password) {
		setText(userNameTextbox, Username);
		setText(passwordTextbox, Password);
		clickElement(loginbtn);
	}

}
