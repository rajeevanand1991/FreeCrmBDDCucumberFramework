package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooksStepDefinition {
	
	//Global Hooks
	@Before(order=0) //Same like before class in TestNG Framework and order is same like priority in TestNG Framework
	public void setUP(){
		System.out.println("launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}

	@After(order=0) //Same like after class in TestNG Framework and order is same like priority in TestNG Framework
	public void tearDown(){
		System.out.println("close the browser");
	}
	
	@Before(order=1) //Same like before class in TestNG Framework and order is same like priority in TestNG Framework
	public void setUP1(){
		System.out.println("launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}

	@After(order=1) //Same like after class in TestNG Framework and order is same like priority in TestNG Framework
	public void tearDown1(){
		System.out.println("close the browser");
	}
	
	//local - only for first scenario
	@Before("@First") //same like before first method in TestNG Framework
	public void beforeFirst() {
		System.out.println("before only for first scenario");
	}
	
	//local - only for first scenario
	@After("@First") //same like after first method in TestNG Framework
	public void afterFirst() {
		System.out.println("after only for first scenario");
	}
	
	@Before("@Second") //same like before second method in TestNG Framework
	public void beforeSecond() {
		System.out.println("before only for second scenario");
	}
	
	//local - only for second scenario
	@After("@Second") //same like after second method in TestNG Framework
	public void afterSecond() {
		System.out.println("after only for second scenario");
	}
	
	@Before("@Third") //same like before third method in TestNG Framework
	public void beforeThird() {
		System.out.println("before only for third scenario");
	}
	
	//local - only for third scenario
	@After("@Third") //same like after third method in TestNG Framework
	public void afterThird() {
		System.out.println("after only for third scenario");
	}

	@Given("this is the first step")
	public void this_is_the_first_step() throws Throwable {
	    System.out.println("1st step");
	}
	@When("this is the second step")
	public void this_is_the_second_step() throws Throwable{
		System.out.println("2nd step");
	}
	@Then("this is the third step")
	public void this_is_the_third_step() throws Throwable{
		System.out.println("3rd step");
	}

//	Output:
//		launch FF
//		Enter URL for Free CRM APP
//		launch FF
//		Enter URL for Free CRM APP
//		before only for first scenario
//		1st step
//		2nd step
//		3rd step
//		after only for first scenario
//		close the browser
//		close the browser
//		---
//		launch FF
//		Enter URL for Free CRM APP
//		launch FF
//		Enter URL for Free CRM APP
//		before only for second scenario
//		1st step
//		2nd step
//		3rd step
//		after only for second scenario
//		close the browser
//		close the browser
//		---
//		launch FF
//		Enter URL for Free CRM APP
//		launch FF
//		Enter URL for Free CRM APP
//		before only for third scenario
//		1st step
//		2nd step
//		3rd step
//		after only for third scenario
//		close the browser
//		close the browser
}