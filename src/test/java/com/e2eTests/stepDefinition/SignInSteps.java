package com.e2eTests.stepDefinition;

import org.openqa.selenium.support.PageFactory;

import com.e2e.lumaProject.Base;
import com.e2eTests.pageObjects.SignInObjects;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps extends Base {
	
	static SignInObjects signInObjects = new SignInObjects();

	//**Successful sign in**//
	@When("I enter my valid email {string} and password {string}")
	public void i_enter_my_valid_email_and_password(String validEmail, String validPass ) {
		PageFactory.initElements(driver, SignInObjects.class);
		signInObjects.enterValidEmail(validEmail);
		signInObjects.enterValidPassord(validPass);
	}

	@When("I click the Sign In button")
	public void i_click_the_sign_in_button() {
		signInObjects.clickSignInButton();
	}

	@Then("I should be redirected to my profile page")
	public void i_should_be_redirected_to_my_profile_page() {
		signInObjects.succesSignInAssert();
	}
	//**Sign in with invalid credentials**//
	@When("I enter {string} and {string}")
	public void I_enter_and(String invaEmail, String InvaPass) {
		PageFactory.initElements(driver, SignInObjects.class);
		signInObjects.enterInvalidEmail(invaEmail);
		signInObjects.enterInvaPassword(InvaPass);
	}
	@Then("Singn In failed")
	public void Singn_In_failed() {
		signInObjects.failedSignInAssert();
	}
	//**Sign in with empty fields**//
	@When("I leave email {string} and password {string} fields empty")
	public void I_leave_email_and_password_fields_empty(String emptyEmail, String EmptyPass) {
		PageFactory.initElements(driver, SignInObjects.class);
		signInObjects.leaveFieldsEmpty(emptyEmail, EmptyPass);
	}
	
	@Then("login failed and error messag should be displayed")
	public void login_failed_and_error_messag_should_be_displayed() {
		PageFactory.initElements(driver, SignInObjects.class);
		signInObjects.emptyFieldsAssert();
	}
	
	
	
	
	
	
	
	
	
	
}
