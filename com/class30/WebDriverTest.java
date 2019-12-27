package com.class30;

public class WebDriverTest {
	public static void main(String[] args) {
		WebDriver ch = new ChromeDriver(); 
		ch.openBrowser();
		ch.closeBrowser();
		ch.maximizeWindow();
		ch.findElement();
		
		System.out.println("************************************");
		
		WebDriver ff = new FirefoxDriver(); 
		ff.openBrowser();
		ff.closeBrowser();
		ff.maximizeWindow();
		ff.findElement();
		
	}
}
