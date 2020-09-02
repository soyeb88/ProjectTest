package com.codePractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Browser/chromedriver");
		
		//to launch browser
		driver = new ChromeDriver();
		
		//to get specific url
		driver.get("https://jqueryui.com/droppable/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//synchronization - sometimes our automation scripts faster than application, then we need to synchronization
		//implicitly wait - for whole application
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Drag and drop 
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		
		Actions a = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
		
		WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));		
		
		a.dragAndDrop(from, to).build().perform();
		Screenshot.screenshot(driver, "dragAndDrop");
		driver.switchTo().parentFrame();
		
		
		
		
		
		//stale element referance exception- Not in right frame or not in right winodw
		
		
		//to resolve Synchronization we can emplicitly wait for entire application and explicitly wait is specific function
		//Assertion error fail because of validation 
		
		//what is the difference between validation and verification
		
		//out of memory exception we have to 
		 

	}
}
