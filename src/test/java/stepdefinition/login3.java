package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class login3 {
	@Given("application displays welcome message")
	public void application_displays_welcome_message() {
	    // Write code here that turns the phrase above into concrete actions
	   // new cucumber.api.PendingException();
	System.out.println("Welcome");
	}

	@Given("users un and pwd")
	public void users_un_and_pwd() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters uname and pwd");
	}

	@Given("click signin")
	public void click_signin() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("user clicks on signin");

	}

	@When("user seraches for speaker")
	public void user_seraches_for_speaker() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user searches for speaker");

	}

	@When("user adds the product to the cart")
	public void user_adds_the_product_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user adds the product into the cart");
	}

	@When("user does the payment")
	public void user_does_the_payment() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user does the payment");

	}

	@When("user logs out")
	public void user_logs_out() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user logs out");
	}


}
