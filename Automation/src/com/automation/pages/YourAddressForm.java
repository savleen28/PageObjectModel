package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.automation.config.Configuration;

public class YourAddressForm {
	@FindBy(xpath = Configuration.address)
	WebElement address;
	
	@FindBy(xpath =Configuration.city)
	WebElement city;
	
	@FindBy(xpath =Configuration.state)
	WebElement state;
	
	@FindBy(xpath =Configuration.postcode)
	WebElement postcode;
	
	@FindBy(xpath =Configuration.country)
	WebElement country;
	
	@FindBy(xpath =Configuration.phone)
	WebElement phone;
	
	@FindBy(xpath =Configuration.mobilephone)
	WebElement mobilephone;
	
	@FindBy(xpath = Configuration.save)
	WebElement save;
	
	@FindBy(xpath = Configuration.aliasAddress)
	WebElement aliasAddress;
	
	public void enterDetails(String myAdd, String myCity, String myState, String myPostCode,String myCountry,String myPhone, String myMobile, String myAliasAddress){
		address.sendKeys(myAdd);
	    city.sendKeys(myCity);
	    Select select1 = new Select(state);
		select1.selectByValue(myState);
	    postcode.sendKeys(myPostCode);
	    Select select2 = new Select(country);
	    select2.selectByValue(myCountry);
	    phone.sendKeys(myPhone);
	    mobilephone.sendKeys(myMobile);
	    aliasAddress.clear();
	    aliasAddress.sendKeys(myAliasAddress);
	    save.click();
	}
	
	

}
