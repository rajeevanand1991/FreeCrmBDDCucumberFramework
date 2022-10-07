/*package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

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

	@Then("^user enters \"(.*)\" and \"(.*)\"$") //use this regular expression for Data driven approach \"(.*)\" (or) \"([^\"]*)\"
	public void user_enters_username_and_password(String userName, String password) {
		driver.findElement(By.name("email")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
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
	
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() throws InterruptedException {
		//Creating object of an Actions class
		Actions action = new Actions(driver);
				
		//Performing the mouse hover action on the contactsLink element.
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[@href='/contacts']//following-sibling::button[contains(@class,'ui mini basic icon button')]")).click(); //click + icon in webpage
				
		//Performing the mouse hover action on the other element to make menu close automatically.
		action.moveToElement(driver.findElement(By.xpath("//b[contains(text(),'Hireteks India Private Limited')]"))).build().perform();
		Thread.sleep(3000); 
	}
	
	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_contacts_details(String firstname, String lastname, String position) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("first_name")).sendKeys(firstname);
		Thread.sleep(2000);
		driver.findElement(By.name("last_name")).sendKeys(lastname);
		Thread.sleep(2000);
		driver.findElement(By.name("position")).sendKeys(position);
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	    Thread.sleep(3000);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
	    driver.quit();
	}
}*/