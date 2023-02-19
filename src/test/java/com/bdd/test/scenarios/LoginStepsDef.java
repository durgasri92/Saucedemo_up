package com.bdd.test.scenarios;

import java.util.List;
import java.util.Map;

import org.testng.AssertJUnit;

import io.cucumber.core.api.Scenario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testcases.BaseTest1;

public class LoginStepsDef extends BaseTest1 {

	@Before
	public void setUpDriverAndPageObjects(Scenario scenario) {
		setup();

	}

	@After
	public void performCleanUp(Scenario scenario) {
		cleanupActivities();

	}

	@When("The user enter the {string} in username field and {string} in password field and clicks on login button")

	public void login(String user, String pass) {

		loginPage.logintoApplication(user, pass);

	}

	@Then("Login should be successful and user is on product page with name as {string}")
	public void verifyLogin(String pagename) {

		AssertJUnit.assertEquals(productpage.verifyPageDisplayedIsCorrect(pagename), true);
	}

	@When("Product page is displayed select the first product from the list of items")

	public void Addproduct() {

		productpage.addtheproduct();

	}

	@And("click on the cart Icon")

	public void Additemtocart() {

		productpage.clickoncart();
	}

	@When("Product added to cart and proceed further by clicking checkout button")

	public void Clickcheckoutbutton() {
		checkoutpage.clickoncheckout();

	}

	@Then("In personal info page the user fills registration form with following information")
	public void personalinfo(DataTable dt) {

		List<Map<String, String>> registerData = dt.asMaps(String.class, String.class);

		String uniqueIdentier = String.valueOf(System.currentTimeMillis());

		personalinfopage.PersonalInformation(uniqueIdentier + registerData.get(0).get("FirstName"),
				uniqueIdentier + registerData.get(0).get("LastName"), registerData.get(0).get("Postalcode"));

	}

	@And("The payment page is diplayed with final cost of item click on finish button to place order")
	public void CheckoutPayment() {
		paymentpage.clickFinishButton();
	}

	@Then("we should get a confirmation message as {string}")
	public void verifyMsg(String Msg) {

		AssertJUnit.assertEquals(productpage.verifyPageDisplayedIsCorrect(Msg), true);
	}

}
