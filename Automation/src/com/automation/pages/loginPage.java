package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.config.Configuration;
import com.automation.utils.Utility;
import com.automation.utils.Xls_Reader;

public class loginPage {
	

	WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = Configuration.username)
	public WebElement username;

	@FindBy(xpath = Configuration.password)
	public WebElement password;

	@FindBy(xpath = Configuration.SignIn)
	public WebElement SignIn;

	
	public LandingPage doLogin(String myUsername, String myPassword) {
		username.sendKeys(myUsername);
		password.sendKeys(myPassword);
		SignIn.click();
		return PageFactory.initElements(driver, LandingPage.class);

	}
	
	

}
