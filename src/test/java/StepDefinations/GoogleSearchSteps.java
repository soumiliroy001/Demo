package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

public GoogleSearchSteps(){}
	
	WebDriver driver1;
	String url="https://www.google.com/";
	WebElement search;
	@Given("Browser is open")
	public void browser_is_open() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  driver.get(url);
	}

	@And("User is on google search page")
	public void user_is_on_google_search_page() {
	   search=driver.findElement(By.name("q"));
	}

	@When("User enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		search.sendKeys("Selenium");
	}

	@And("hits enter")
	public void hits_enter() {
	  search.sendKeys(Keys.ENTER);
	}

	@Then("User is navigate to search result")
	public void user_is_navigate_to_search_result() {
	    
	}

	@Then("User is navigate to search result")
	public void user_is_navigate_to_search_result() {
	    
	}

}
