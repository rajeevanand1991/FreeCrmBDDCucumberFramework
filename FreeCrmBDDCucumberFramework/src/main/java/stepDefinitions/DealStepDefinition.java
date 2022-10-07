/*package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DealStepDefinition {

	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.in.freecrm.com/");
		driver.manage().window().maximize();
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.println("Title of the WebPage is: " + title);
		Assert.assertEquals("Free CRM", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		//Naveen AutomationLabs code: ===> currently raw() method not supported to write, hence i used row() method
		//List<List<String>> data = credentials.raw();
		//driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		//driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		List<String> data = credentials.row(0);
		driver.findElement(By.name("email")).sendKeys(data.get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(1));
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Login']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home Page title :: " + title);
		Assert.assertEquals("Free CRM", title);
	}
	
	@Then("^user moves to new deals page$")
	public void user_moves_to_new_deals_page() throws InterruptedException {
		//Creating object of an Actions class
		Actions action = new Actions(driver);
				
		//Performing the mouse hover action on the Deals Link element.
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[@href='/deals']//following-sibling::button[contains(@class,'ui mini basic icon button')]")).click(); //click + icon in webpage
				
		//Performing the mouse hover action on the other element to make menu close automatically.
		action.moveToElement(driver.findElement(By.xpath("//b[contains(text(),'Hireteks India Private Limited')]"))).build().perform();
		Thread.sleep(3000); 
	}
	
	@Then("^user enters deal details$")
	public void user_enters_contacts_details(DataTable dealData) throws InterruptedException {
		//Naveen AutomationLabs code: ===> currently raw() method not supported to write, hence i used row() method
		//List<List<String>> dealValues = dealData.raw();
		//driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0)); 
		//driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
		//driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
		//driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
		List<String> dealValues = dealData.row(0);
		Thread.sleep(2000);
		driver.findElement(By.name("title")).sendKeys(dealValues.get(0));
		Thread.sleep(2000);
		driver.findElement(By.name("amount")).sendKeys(dealValues.get(1));
		Thread.sleep(2000);
		driver.findElement(By.name("probability")).sendKeys(dealValues.get(2));
		Thread.sleep(2000);
		driver.findElement(By.name("commission")).sendKeys(dealValues.get(3));
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	    Thread.sleep(3000);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
	    driver.quit();
	}
}*/