package Adda.testNg.stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import Adda.testNg.common.Base;
import Adda.testNg.pageobjectmodel.signInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSteps extends Base {
	
	signInPage sp;
	
	@Given("^Open the window and Landing Page$")
	public void open_the_window_and_Landing_Page() throws Throwable {
		initializeBrowser();
		navigateToSide();
		
		sp = PageFactory.initElements(driver, signInPage.class);
	    
	}

	@When("^Enter user name$")
	public void enter_user_name() throws Throwable {
	   
	    sp.getUserName();
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
	   
	    sp.getPassword();
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
	   
	    sp.getLogInButton();
	}

	@Then("^logIn successfull and take title$")
	public void login_successfull_and_take_title() throws Throwable {
		
	}

	@Then("^close the window$")
	public void close_the_window() throws Throwable {
	   
	    
	}
	
}
