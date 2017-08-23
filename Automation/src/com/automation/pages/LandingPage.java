package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.config.Configuration;

public class LandingPage {

	WebDriver driver;
	public LandingPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath = Configuration.women)
	public WebElement women;
	
	@FindBy(xpath = Configuration.dresses)
	public WebElement dresses;
	
	@FindBy(xpath = Configuration.tshirt)
	public WebElement tshirt;
	
	@FindBy(xpath = Configuration.myaddresses)
	public WebElement myaddresses;
	
	public void goToWomen(){
		women.click();
	}
	
	public SelectDressesPage goToDresses(){
		dresses.click();
		return PageFactory.initElements(driver, SelectDressesPage.class);
	}
	
	public void goToTshirt(){
		tshirt.click();
	}
	
	public AddNewAddress goToMyAddresses(){
		myaddresses.click();
		return PageFactory.initElements(driver, AddNewAddress.class);
	}
}
