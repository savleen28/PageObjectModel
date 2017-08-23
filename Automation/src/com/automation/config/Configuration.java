package com.automation.config;

public class Configuration {
	public static String testsite = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	//loginPage
	public static final String username =  "//*[@id=\"email\"]";
	public static final String password =  "//*[@id=\"passwd\"]";
	public static final String SignIn =  "//*[@id=\"SubmitLogin\"]/span";
	
	//LandingPage
	public static final String women =  "//*[@id=\"block_top_menu\"]/ul/li[1]/a";
	public static final String dresses =  "//*[@id=\"block_top_menu\"]/ul/li[2]/a";
	public static final String tshirt =  "//*[@id=\"block_top_menu\"]/ul/li[3]/a";
	public static final String myaddresses =  "//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span";
	
	//AddNewAddress
	public static final String addaddress =  "//*[@id=\"center_column\"]/div[2]/a/span/i";
	
	//YourAddressForm
	public static final String address =  "//*[@id=\"address1\"]";
	public static final String city =  "//*[@id=\"city\"]";
	public static final String state =  "//*[@id=\"id_state\"]";
	public static final String postcode =  "//*[@id=\"postcode\"]";
	public static final String country =  "//*[@id=\"id_country\"]";
	public static final String phone =  "//*[@id=\"phone\"]";
	public static final String mobilephone =  "//*[@id=\"phone_mobile\"]";
	public static final String save =  "//*[@id=\"submitAddress\"]/span";
	public static final String aliasAddress =  "//*[@id=\"alias\"]";
	
	//SelectDressesPage
	public static final String dress1 = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span";
	public static final String dress2 = "//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[1]/span";
	public static final String continueshoping = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span";
	public static final String proceedtocheckout = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span";
	
	//SummaryPage
	public static final String continueshopping = "//*[@id=\"center_column\"]/p[2]/a[2]";
	public static final String proceed = "//*[@id=\"center_column\"]/p[2]/a[1]/span";
	public static final String deleteitem = "//*[@id=\"7_34_0_25535\"]/i";
	
	//Validations Xpath
	public static final String valx2 = "//*[@id=\"center_column\"]/div[1]/ol/li";
	public static final String valx3 = "//*[@id=\"create_account_error\"]/ol/li";
	public static final String valx4 = "//*[@id=\"center_column\"]/div/div/ol/li";
	
	//Validations
	public static String val1 = "An account using this email address has already been registered. Please enter a valid password or request a new one. ";
	public static String val2 = "Authentication failed.";
	public static String val3 = "Invalid email address.";
	public static String val4 = "Invalid email address.";
	
	

}
