package com.class31;

interface TakesScreenshot {
	//public static final 
	String $FILE_EXTENSION=".png";
	void takesScreen();
	//added from jdk 1.8
	static void takeSelfie() {
		System.out.println("I am defined static method of TakesScreenshot interface");
	}
	
	default void takePictures() {
		System.out.println("I am default defined method of TakesScreenshot interface");
	}
}

interface Application{
	void applicationTest();
}

public interface WebDriver extends TakesScreenshot {
	
	void openBrowser();

	void closeBrowser();

	void maximazeWindow();

	void findElement();
}

abstract class Browser {

	String name;
	public abstract void refresh();
}

class ChromeDriver extends Browser implements WebDriver, Application {
	@Override
	public void openBrowser() {
		System.out.println("Open Chrome Browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Chrome Browser");
	}

	@Override
	public void maximazeWindow() {
		System.out.println("Maximize window in Chrome Browser");
	}

	@Override
	public void findElement() {
		System.out.println("Find Element by XPath in Chrome Browser");
	}

	@Override
	public void refresh() {
		System.out.println("Refresh Chrome Browser");
	}

	@Override
	public void takesScreen() {
		System.out.println("Take screenshot in Chrome Browser");
	}

	@Override
	public void applicationTest() {
		System.out.println("Application test in Chrome Browser");
	}
}

class FirefoxDriver extends Browser implements WebDriver, Application {
	@Override
	public void openBrowser() {
		System.out.println("Open FireFox Browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Firefox Browser");
	}

	@Override
	public void maximazeWindow() {
		System.out.println("Maximize window in Firefox Browser");
	}

	@Override
	public void findElement() {
		System.out.println("Find Element by CCS selector");
	}

	@Override
	public void refresh() {
		System.out.println("Refresh Firefox Browser");
	}

	@Override
	public void takesScreen() {
		System.out.println("Take screenshot in Firefox Browser");
	}

	@Override
	public void applicationTest() {
		System.out.println("Application test in Firefox Browser");
	}
}