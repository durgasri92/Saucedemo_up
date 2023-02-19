package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.CheckoutPage;
import pages.ConfirmationPage;
import pages.LoginPage;
import pages.PaymentPage;
import pages.PersonalinfoPage;
import pages.ProductPage;
import utils.DataUtils;

public abstract class BaseTest1 {

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	protected LoginPage loginPage;
	protected ProductPage productpage;
	protected PersonalinfoPage personalinfopage;
	protected CheckoutPage checkoutpage;
	protected PaymentPage paymentpage;
	protected ConfirmationPage confirmpage;

	@BeforeMethod(alwaysRun = true)
	protected void setup() {
		driver.set(new ChromeDriver());
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");// Bypass OS security model
//		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//		options.addArguments("-–no-sandbox");
//		options.addArguments("window-size=1200,1100");

		// driver.set(new ChromeDriver(options));
//		try {
//			driver.set(new RemoteWebDriver(new URL(" http://localhost:4444/wd/hub"), options));
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		;
		// driver.get().get("https://www.saucedemo.com/");
		driver.get().get(DataUtils.getTestData("config", "BaseUrl"));
		initializePageObjects();
	}

	private void initializePageObjects() {

		loginPage = new LoginPage(driver);
		productpage = new ProductPage(driver);
		personalinfopage = new PersonalinfoPage(driver);
		checkoutpage = new CheckoutPage(driver);
		paymentpage = new PaymentPage(driver);
		confirmpage = new ConfirmationPage(driver);

	}

	@AfterMethod(alwaysRun = true)
	protected void cleanupActivities() {
		// quit the chrome session
		driver.get().quit();

	}

}
