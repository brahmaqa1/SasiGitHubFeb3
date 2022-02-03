package CucumberBasics1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLoginStep {


	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("@Given - user_navigates_to_facebook_website");		

	}

	@When("^user validates the Home page title$")
	public void user_validates_the_Home_page_title() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("@When - user_validates_the_Home_page_title");	
	}

	@Then("^user entered the user name$")
	public void user_entered_the_user_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("@@Then - user_entered_the_user_name");
	}

	@Then("^user entered the password$")
	public void user_entered_the_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("@@Then - user_entered_the_password");
	}

	@Then("^user should be successfully logged in$")
	public void user_should_be_successfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("@@Then - user_should_be_successfully_logged_in");

	}
	
	@Then("^it should display user name on right side$")
	public void it_should_display_user_name_on_right_side() throws Throwable {
	  System.out.println("it_should_display_user_name_on_right_side");
	}
	

@Then("^it should display \"([^\"]*)\" on right side$")
public void it_should_display_on_right_side(String username) throws Throwable {
    System.out.println("my user="+username);
	
}

}
