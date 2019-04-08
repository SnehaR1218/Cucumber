package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddCustomerStepDefinition {

	static WebDriver driver;

		@Given("The user is in add customer page")
		public void the_user_is_in_add_customer_page() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sneha\\eclipse-workspace1\\Cucumber1\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/telecom/addcustomer.php");
			
		    
		}

		@When("The user fill in customer details")
		public void the_user_fill_in_customer_details() {
		driver.findElement(By.xpath("//label[text()='Done']"));
		driver.findElement(By.id("fname")).sendKeys("guru");
		driver.findElement(By.id("lname")).sendKeys("prasad");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("Chennai");
		driver.findElement(By.name("telephoneno")).sendKeys("69465415");
		
		}

		@When("the user clicks submit button")
		public void the_user_clicks_submit_button() {
		    driver.findElement(By.name("submit")).click();
		}

		@Then("the user should see the Customer ID.")
		public void the_user_should_see_the_Customer_ID() {
        driver.findElement(By.tagName("h3")).isDisplayed();

		}

	
		
	}


