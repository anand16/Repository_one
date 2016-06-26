package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {

	
		// TODO Auto-generated method stub
FirefoxDriver driver=null;
		@Given("^launch the browser and navigate to gmail$")
		public void launch_the_browser_and_navigate_to_gmail() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  driver=new FirefoxDriver();
		  driver.get("http://gmail.com");
		}

		@When("^we enter username$")
		public void we_enter_username() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("Email")).sendKeys("reach.seleniumprogramme");
		}

		@When("^click on the next button$")
		public void click_on_the_next_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("next")).click();
		}

		@Then("^Webpage is shown$")
		public void webpage_is_shown() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   String URL= driver.getCurrentUrl();
		   System.out.println(URL);
		}


	

}
