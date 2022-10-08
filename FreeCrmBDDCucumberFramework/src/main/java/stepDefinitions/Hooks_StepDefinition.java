/*package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_StepDefinition {
	
	@Before
	public void setUp() {
		System.out.println("launch Firefox Browser");
		System.out.println("Enter URL for Free CRM APP");
	}
	
	@After
	public void tearDown() {
		System.out.println("close the browser");
	}
	
	@Given("user is on deal page")
	public void user_is_on_deal_page() throws Throwable{
	    System.out.println("user is on deal page");
	}
	
	@When("user fills the deals form")
	public void user_fills_the_deals_form() throws Throwable {
	    System.out.println("user fills the deals form");
	}
	
	@Then("deal is created")
	public void deal_is_created() throws Throwable {
	    System.out.println("deal is created");
	}
	//Output:
		//launch Firefox Browser
		//Enter URL for Free CRM APP
		//user is on deal page
		//user fills the deals form
		//deal is created
		//close the browser
	
	@Given("user is on contact page")
	public void user_is_on_contact_page() throws Throwable {
	    System.out.println("user is on contact page");
	}
	@When("user fills the contact form")
	public void user_fills_the_contact_form() throws Throwable {
	    System.out.println("user fills the contact form");
	}
	@Then("contact is created")
	public void contact_is_created() throws Throwable {
	    System.out.println("contact is created");
	}
	//Output:
		//launch Firefox Browser
		//Enter URL for Free CRM APP
		//user is on contact page
		//user fills the contact form
		//contact is created
		//close the browser

	@Given("user is on mail page")
	public void user_is_on_mail_page() {
		System.out.println("user is on mail page");
	}
	@When("user fills the mail form")
	public void user_fills_the_mail_form() {
	    System.out.println("user fills the mail form");
	}
	@Then("mail is created")
	public void mail_is_created() {
	    System.out.println("mail is created");
	}
	//Output:
		//launch Firefox Browser
		//Enter URL for Free CRM APP
		//user is on mail page
		//user fills the mail form
		//mail is created
		//close the browser
}*/