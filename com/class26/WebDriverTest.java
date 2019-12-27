package com.class26;

public class WebDriverTest {
	public static void main(String[] args) {
		ChromeDriver chrome = new ChromeDriver();
		chrome.refresh();
		chrome.open();
		
		FirefoxDriver firefox = new FirefoxDriver();
		firefox.refresh(); 
		firefox.open(); 
		System.out.println("**********************************");
		// creating an object of subclass(child) and give reference to the super class (parent)
		WebDriver driver = new FirefoxDriver(); 
		driver.open(); 
		driver.refresh();
		// driver.getTitle(); --> No access to child specific class through parent type
		
		
		

		
		
		
	}
}
