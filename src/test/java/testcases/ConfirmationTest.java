package testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class ConfirmationTest extends BaseTest {

	@Test(priority = 5)

	public void Cnfirmpage() {

		String Msg = "//h2[text()='THANK YOU FOR YOUR ORDER']";

		AssertJUnit.assertEquals(confirmpage.validatesuccessMsg(Msg), true);

		System.out.println("The message is:" + confirmpage.getsuccessmsg());

	}

}
