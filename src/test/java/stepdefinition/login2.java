package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login2 {
	@Given("user open signup page")
	public void user_open_signup_page() {
		System.out.println("Open signup");
	}

	@When("user enters fn as {string}")
	public void user_enters_fn_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	System.out.println("User enters firstname" +string);
	}

	@When("user enters ln as {string}")
	public void user_enters_ln_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User enters lastname" +string);

	}

	@When("user enters db as {string}")
	public void user_enters_db_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    // new cucumber.api.PendingException();
		System.out.println("User enters dob" +string);

	}

	@When("user enters pwd as {string}")
	public void user_enters_pwd_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    // new cucumber.api.PendingException();
		System.out.println("User enters pwd" +string);

	}

	@When("user enters cpwd as {string}")
	public void user_enters_cpwd_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // new cucumber.api.PendingException();
		System.out.println("User enters cpwd" +string);

	}


	@Then("click signup button")
	public void click_signup_button() {
	}

	@Then("verify signup success message")
	public void verify_signup_success_message() {
	}

	
}
