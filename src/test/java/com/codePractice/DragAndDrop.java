package com.codePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Browser/chromedriver");
		
		//to launch browser
		driver = new ChromeDriver();
		
		//to get specific url
		driver.get("https://www.facebook.com/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//synchronization - sometimes our automation scripts faster than application, then we need to synchronization
		//implicitly wait - for whole application
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@name='sex'])[3]")).isSelected();

	}

}
