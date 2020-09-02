package com.codePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopUp {
	public static void main(String[] args) throws InterruptedException {
		//Buck tracking tools
		
		//more focus on Cucumber 
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Browser/chromedriver");
		
		driver = new ChromeDriver();;
		driver.get("https://nppes.cms.hhs.gov/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(text(),'ACCEPT')]")).click();
		
		Thread.sleep(30000);
		driver.switchTo().alert().dismiss();

		
		driver.switchTo().parentFrame().close();
	}
}
