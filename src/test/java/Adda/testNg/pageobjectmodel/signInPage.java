package Adda.testNg.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPage {
	
	public WebDriver driver;
	
	public signInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='log_email']")
	public WebElement username;
	
	public void getUserName() {
		username.sendKeys("soyeb88@gmail.com");
	}
	
	@FindBy(xpath="//input[@name='log_password']")
	public WebElement password;
	
	public void getPassword() {
		password.sendKeys("Dhaka_22");
	}
	
	@FindBy(xpath="//input[@name='login_button']")
	public WebElement loginButton;
	
	public void getLogInButton() {
		loginButton.click();
	}
	
}
