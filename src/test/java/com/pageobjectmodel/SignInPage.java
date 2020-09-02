package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignInPage {
	
	public WebDriver driver;
	
	public SignInPage(WebDriver driver) { //initialize instance variable
		this.driver = driver;
		PageFactory.initElements(driver, this); //selenium interface 
	}
	
	@FindBy(id="nav-link-accountList")
	public WebElement from; //Selenium interfaces - PageFactory, WebElement, WebDriver
	@FindBy(xpath="//span[@class='nav-action-inner']")
	public WebElement to;  //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getSignInPage() {
		Actions ac = new Actions(driver);
		ac.moveToElement(from).moveToElement(to).click().build().perform();
	}
	
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement username; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getUserName() {
		//username.sendKeys("soyeb88@gmail.com");
		username.sendKeys("soyeb8@gmail.com");
		
	}
	
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continu; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getContinue() {
		continu.click();
		
	}
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getPassword() {
		//password.sendKeys("Dhaka_866");
		//password.sendKeys("Dhaka_86");
	}
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement signin; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getSignIn() {
		//signin.click();
	}
	
	//div[@id='auth-error-message-box']//div[@class='a-box-inner a-alert-container']
	
	@FindBy(xpath="//div[@id='auth-error-message-box']")
	public WebElement errmsg; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void getErrMsg() {
		String message = errmsg.getText();		
		System.out.println(message);
	}
	
	@FindBy(xpath="//Select[@id='searchDropdownBox']")
	public WebElement all; //Selenium interfaces - PageFactory, WebElement, WebDriver
	
	public void gettAll() {
		//Select sel = new Select(all);
		//sel.selectByVisibleText("Alexa Skills");
		
		//all.click();
	}
	
}
