package com.codePractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleLocators {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Browser/chromedriver");
		driver = new ChromeDriver();;
		driver.get("https://www.yahoo.com/");
		
		
		
		
		Thread.sleep(3000);

		
		List<WebElement> headers =  driver.findElements(By.xpath("//ul[@id='header-nav-bar']//li")); //relative xpath parent to child 
		
		
		java.util.Iterator<WebElement> i = headers.iterator();
		
		while(i.hasNext()) {
			WebElement row = i.next();
			System.out.println(row.getText());
		}
	}
		
}
