package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test

	public void login() {
		String Username = "standard_user";
		String Password = "secret_sauce";

		loginPage.logintoApplication(Username, Password);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		String PageName = driver.findElement(By.xpath("//span[@class='title']")).getText();
		AssertJUnit.assertEquals(productpage.verifyPageDisplayedIsCorrect(PageName), true);

	}

}
