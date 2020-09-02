package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.SignInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSteps extends Base{

	SignInPage sp;
	
	@Given("^Go to home page$")
	public void go_to_home_page() throws Throwable {
	    getDriver();
	    sp = PageFactory.initElements(driver, SignInPage.class);
	    
	}

	@When("^Click on the sign in button$")
	public void click_on_the_sign_in_button() throws Throwable {
	    sp.getSignInPage();
	    
	    sp.gettAll();
	    
	}

	@When("^Enter username$")
	public void enter_username() throws Throwable {
	    
	    sp.getUserName();
	    sp.getContinue();
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
	    
	    sp.getPassword();
	}

	@When("^Click on submit button$")
	public void click_on_submit_button() throws Throwable {
	    
	   sp.getSignIn();
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    sp.getErrMsg();
		
		String s = driver.getTitle();
		
		//Assert.assertEquals(s, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		
		Assert.assertEquals(s, "Amazon.com: nline Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	    
	}

	
}
