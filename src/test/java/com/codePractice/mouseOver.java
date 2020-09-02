package com.codePractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		
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
		
		WebElement from = driver.findElement(By.id("nav-link-accountList"));
		WebElement to = driver.findElement(By.xpath("//span[contains(text(),'Your Fanshop')]"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(from).moveToElement(to).click().build().perform();
		
		
		Screenshot.screenshot(driver, "amazonSmile");
		
		driver.navigate().refresh(); //what is the difference between navigate and get methods
		
	}
}
