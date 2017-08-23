package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.config.Configuration;
import com.automation.utils.Utility;
import com.automation.utils.Xls_Reader;

public class TestBuyAProduct {
	
	@BeforeTest
	public void isSkip() {
		Xls_Reader excel = new Xls_Reader(
				"C:\\Users\\BEDI\\workspace\\POM\\Automation\\src\\com\\automation\\testdata\\testdata.xlsx");
		if (!Utility.isExecutable("loginPage", excel)) {
			throw new SkipException("Skipping the test case as the run mode is set to No");
		}
	}
	
	@Test(dataProvider = "getData")
	public static void buyProduct(String myUsername,String myPassword) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BEDI\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Configuration.testsite);
		loginPage lp = PageFactory.initElements(driver, loginPage.class);
		LandingPage landingpage = lp.doLogin(myUsername, myPassword);
		SelectDressesPage sd = landingpage.goToDresses();
		SummaryPage sp = sd.selectDresses();
		sp.continueshopping();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return Utility.getData("buyAProduct");
	}

}
