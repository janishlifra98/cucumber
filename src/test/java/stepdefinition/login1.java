package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login1 {
	@Given("open newtours application")
	public void open_newtours_application() {
	System.out.println("application is opened");
	}

	@When("user enter un as {string} and pwd as {string}")
	public void user_enter_un_as_and_pwd_as(String string, String string2) {
		System.out.println("user enters un as" +string+ "and pwd as" +string2);

	}

	@When("submit login form")
	public void submit_login_form() {
		System.out.println(" Click on submit ");

	}

	@Then("verify pass")
	public void verify_pass() {

		System.out.println(" verify as pass ");

	
	}

	@Then("verify failure")
	public void verify_failure() {

		System.out.println("verify as fail ");

	
	}


}
