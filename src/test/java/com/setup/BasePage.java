package com.setup;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	public BasePage() {	}
	
	
	public BasePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

}
