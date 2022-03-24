package com.step1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.setup.BasePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GitHubSteps extends BasePage{
	
		public GitHubSteps() {}
		public GitHubSteps(WebDriver driver) {
			super(driver);
		}
		
		
		@FindBy(xpath = "//a[@class='HeaderMenu-link flex-shrink-0 no-underline']") 
		public WebElement signUp;
		@FindBy(id = "login_field")
		public WebElement loginField;
		@FindBy(id = "password") 
		public WebElement password;
		@FindBy(name = "commit") 
		public WebElement loginBtn;
		

		@Before
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver =new ChromeDriver();
			PageFactory.initElements(driver, this);

		}
		@After
		public void teardown() {
			//driver.close();
		}
		@Given("user is on github login")
		public void user_is_on_github_login() {
			 driver.get("https://github.com/");
			 signUp.click();
		}

		@When("user enter username or email")
		public void user_enter_username_or_email() {
			loginField.sendKeys("asdfgh");
		}

		@When("user enter password")
		public void user_enter_password() {
			password.sendKeys("sdfgh");
		}

		@When("click on SignIn button")
		public void click_on_sign_in_button() {
			loginBtn.click();
		}

		@Then("verify the title {string} of page")
		public void verify_the_title_of_page(String string) {
			String expectedTitle = string;
			String actualTitle =driver.getTitle();
			Assert.assertEquals(expectedTitle, actualTitle);
		}

}
