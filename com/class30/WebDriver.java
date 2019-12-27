package com.class30;

public interface WebDriver {
	void openBrowser();
	void closeBrowser(); 
	void maximizeWindow(); 
	void findElement(); 
}

class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Opening chrome browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing chrome browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing chrome window");
		
	}

	@Override
	public void findElement() {
		System.out.println("Finding an element in Chrome");
		
	}
	
}

class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Opening firefox browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing firefox browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing firefox window");
		
	}

	@Override
	public void findElement() {
		System.out.println("Finding an element in Firefox");	
	}
	
}
