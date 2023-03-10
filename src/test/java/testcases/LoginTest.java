package testcases;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import utils.DataUtils;

public class LoginTest extends BaseTest1 {

	@Test
	public void Login() {
		String Username = DataUtils.getTestData("config", "Username");
		String Password = DataUtils.getTestData("config", "Password");

		loginPage.logintoApplication(Username, Password);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String PageName = driver.get().findElement(By.xpath("//span[@class='title']")).getText();
		AssertJUnit.assertEquals(productpage.verifyPageDisplayedIsCorrect(PageName), true);

	}

}
