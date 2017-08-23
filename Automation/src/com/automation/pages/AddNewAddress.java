package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddress {
	WebDriver driver;
	public AddNewAddress(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div[2]/a/span/i")
	WebElement addaddress;
	
	public YourAddressForm addAddress(){
		addaddress.click();
		return PageFactory.initElements(driver, YourAddressForm.class);
	}

}
