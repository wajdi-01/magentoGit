package com.e2eTests.stepDefinition;



import org.openqa.selenium.support.PageFactory;

import com.e2e.lumaProject.Base;
import com.e2eTests.pageObjects.SignUpPageObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps extends Base {
	
	static SignUpPageObject signUpPageObject = new SignUpPageObject();
	
	//**Create a Pass account
	@When("the user enters a First Name {string}")
	public void the_user_enters_a_first_name(String firstName  ) {
	    PageFactory.initElements(driver, SignUpPageObject.class);
	    signUpPageObject.enterFirstName(firstName);
	}

	@When("the user enters a Last Name {string}")
	public void the_user_enters_a_last_name(String lastName) {
		signUpPageObject.enterLastName(lastName);
	}

	@When("the user enters an email adress {string}")
	public void the_user_enters_an_email_adress(String email) {
		signUpPageObject.enterEmailAdress(email);
	}

	@When("the user enters a password {string}")
	public void the_user_enters_a_password(String password) {
		signUpPageObject.enterPassword(password);
	}

	@When("the user enters a confirm password {string}")
	public void the_user_enters_a_confirm_password(String confirmPassword) {
		signUpPageObject.enterConfirmPassword(confirmPassword);
	}

	@When("the user click on creat an account button")
	public void the_user_click_on_creat_an_account_button() {
		signUpPageObject.clickCreatAnAccount();
	}

	@Then("create account should be succes and success messag should be displayed")
	public void create_account_should_be_succes_and_success_messag_should_be_displayed() {
		signUpPageObject.SignupSuccessAssert();
		signUpPageObject.signupSuccesMessagAssert();
	}
	
	//**Create an account with an invalid email address**//
	@When("the user enters an  invalid email adress {string}")
	public void the_user_enters_an_invalid_email_adress(String email) {
		PageFactory.initElements(driver, SignUpPageObject.class);
		signUpPageObject.enterInvalidEmailadress(email);
	}
	@Then("create account should be failed and email error mail error messag should be displayed")
	public void create_account_should_be_failed_and_email_error_mail_error_messag_should_be_displayed() {
		signUpPageObject.signupFailedWrongEmailMessagAssert();
	}
	
	//**Create an account with incorrect confirm password**//
	@When("the user enters the wrong confirmation password {string}")
	public void And_the_user_enters_the_wrong_confirmation_password(String confirmPassword) {
		PageFactory.initElements(driver, SignUpPageObject.class);
		signUpPageObject.enterWrongConfirmPw(confirmPassword);
	}
	@Then("create account should be failed password error messag should be displayed")
	public void create_account_should_be_failed_password_error_messag_should_be_displayed() {
		signUpPageObject.wrongConfirmPwAssert();
	}
	//**Create an account with used email**//
	@Then("create account should be failed and used email adress should be displayed")
	public void create_account_should_be_failed_and_used_email_adress_should_be_displayed() {
		PageFactory.initElements(driver, SignUpPageObject.class);
		signUpPageObject.usedEmailMessageAssert();
	}
	//**Create an account with correct password form but under eight character**//
	@Then("error password messag should be displayed")
	public void error_password_messag_should_be_displayed() {
		PageFactory.initElements(driver, SignUpPageObject.class);
		signUpPageObject.underEightPwAssert();
	}
	//**Create an account with empty all empty filed**//
	@Then("create account should be failed and error message in all fields should be displayed")
	public void create_account_should_be_failed_and_error_message_in_all_fields_should_be_displayed() {
		PageFactory.initElements(driver, SignUpPageObject.class);
		signUpPageObject.firstNameEmtyAssert();
		signUpPageObject.lastNameEmptyAssert();
		signUpPageObject.emailEmptyAssert();
		signUpPageObject.passwordEmptyAssert();
		signUpPageObject.confirmEmptyPwAssert();
	}
	//**Create an Account whit signUp for Newsletter**//
	@When("click on signUp for newsletter")
	public void click_on_signUp_for_newsletter() {
		PageFactory.initElements(driver, SignUpPageObject.class);
		signUpPageObject.checkNwesletterButton();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
