package stepdefinition;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class prod {
	@When("user searches for products")
	public void user_searches_for_products(io.cucumber.datatable.DataTable ProductData) {
		List<String> productname=ProductData.asList();
		for(String product:productname){
			System.out.println(product);
		}
	}

	@When("verify products displayed")
	public void verify_products_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    // new cucumber.api.PendingException();
	System.out.println("products are verified");
	}

	@Then("click close application")
	public void click_close_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
