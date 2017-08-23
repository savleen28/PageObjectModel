package com.automation.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.config.Configuration;

public class SummaryPage {
	@FindBy(xpath = Configuration.continueshopping)
	public WebElement continueshopping;
	
	@FindBy(xpath = Configuration.proceed)
	public WebElement proceed;
	
	@FindBy(xpath = Configuration.deleteitem)
	public WebElement deleteitem;
	
	public void continueshopping(){
		continueshopping.click();
	}
	
	public void proceed(){
		proceed.click();
	}
	
	public void deleteitem(){
		deleteitem.click();
	}

}
