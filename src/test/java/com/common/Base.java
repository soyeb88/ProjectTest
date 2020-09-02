package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	//abstract method unimplemented - no curley braces//temporary rename 
	//driver - instance variable or class level variable //instantiation

	public WebDriver driver;
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Browser/chromedriver");
		
		//to launch browser
		driver = new ChromeDriver();
		
		//to get specific url
		driver.get("https://www.amazon.com/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//synchronization - sometimes our automation scripts faster than application, then we need to synchronization
		//implicitly wait - for whole application
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}
	
}
