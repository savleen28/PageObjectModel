package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.config.Configuration;

public class SelectDressesPage {
	WebDriver driver;

	public SelectDressesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = Configuration.dress1)
	public WebElement dress1;
	
	@FindBy(xpath = Configuration.dress2)
	public WebElement dress2;
	
	@FindBy(xpath = Configuration.continueshoping)
	public WebElement continueshoping;
	
	@FindBy(xpath = Configuration.proceedtocheckout)
	public WebElement proceedtocheckout;
	
	public SummaryPage selectDresses() throws InterruptedException{
		dress2.click();
		Thread.sleep(3000L);
		continueshoping.click();
		dress1.click();
		Thread.sleep(3000L);
		proceedtocheckout.click();
		return PageFactory.initElements(driver, SummaryPage.class);
	}
	
	

}
