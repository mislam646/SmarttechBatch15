package com.java.smarttech;



public class OpenBrowser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
