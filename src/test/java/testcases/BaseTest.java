package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.LoginPage;
import pages.ProductPage;

public abstract class BaseTest {

	protected static WebDriver driver;
	protected LoginPage loginPage;
	protected ProductPage productpage;

	@BeforeMethod(alwaysRun = true)
	protected void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		initializePageObjects();
	}

	private void initializePageObjects() {

		loginPage = new LoginPage(driver);
		productpage = new ProductPage(driver);
		// searchPage = new SearchPage(driver);
	}

	@AfterMethod(alwaysRun = true)
	protected void cleanupActivities() {
		// quit the chrome session
		driver.quit();

	}

}
