package testcases;

import org.testng.annotations.Test;

import utils.DataUtils;

public class PersonalinfoTest extends BaseTest {

	@Test(priority = 3)

	public void login() {
		String FName = DataUtils.getTestData("config", "FirstName");
		String LName = DataUtils.getTestData("config", "LastName");
		String PostCode = DataUtils.getTestData("config", "PostalCode");

		personalinfopage.PersonalInformation(FName, LName, PostCode);
		personalinfopage.clickcontinuebutton();

	}
}
