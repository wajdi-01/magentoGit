package com.e2eTests.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2e.lumaProject.Base;

public class SignInObjects extends Base {

	final static String EMAIL_FIELD = "//input[@id = 'email']";
	final static String PASSWORD_FIELD = "//input[@id = 'pass']";
	final static String SIGN_IN_BUTTON = "//button[@id = 'send2']";
	final static String SUCCES_SIGN_IN_ASSERT = "//span[@class = 'logged-in']";
	final static String FAILED_SIGN_IN_ASSERT = "//div[contains(text(),'The account sign-in was incorrect or your account ')]";
	final static String EMPTY_EMAIL_FILED_ASSERT = "//div[@id='email-error']";
	final static String EMPTY_PASS_FIELD_ASSERT= "//div[@id='pass-error']";
	
	
	
	// **FindBy**//
	@FindBy(how = How.XPATH, using = EMAIL_FIELD)
	public static WebElement emailField;
	@FindBy(how = How.XPATH, using = PASSWORD_FIELD)
	public static WebElement passwordField;
	@FindBy(how = How.XPATH, using = SIGN_IN_BUTTON)
	public static WebElement signUpButton;
	@FindBy(how = How.XPATH, using = SUCCES_SIGN_IN_ASSERT)
	public static WebElement succesSignUpAssert;
	@FindBy(how = How.XPATH, using = FAILED_SIGN_IN_ASSERT)
	public static WebElement failedSignInAssert;
	@FindBy(how = How.XPATH, using = EMPTY_EMAIL_FILED_ASSERT)
	public static WebElement emptyEmailFieldAssert;
	@FindBy(how = How.XPATH, using = EMPTY_PASS_FIELD_ASSERT)
	public static WebElement emptyPassFieldAssert;

	// **Methods**//
	public void enterValidEmail(String validEmail) {
		emailField.sendKeys(validEmail);
	}

	public void enterValidPassord(String validPass) {
		passwordField.sendKeys(validPass);
	}

	public void clickSignInButton() {
		signUpButton.click();
	}

	public void enterInvalidEmail(String invaEmail) {
		emailField.sendKeys(invaEmail);
	}

	public void enterInvaPassword(String invaPass) {
		passwordField.sendKeys(invaPass);
	}

	public void succesSignInAssert() {
		Assert.assertTrue("Sign in Failed !", succesSignUpAssert.isDisplayed());
	}

	public void failedSignInAssert() {
		Assert.assertNotNull("Failed error Messag is Not Displayed !", failedSignInAssert);
	}

		public void emptyFieldsAssert() {
			Assert.assertNotNull("Empty Eamil Filed error is not Displayed !",emptyEmailFieldAssert);
			Assert.assertNotNull("Empty Password Filed error is not Displayed !",emptyPassFieldAssert);
		}
		public void leaveFieldsEmpty(String emptyEmail, String EmptyPass) {
			emailField.sendKeys(emptyEmail);
			passwordField.sendKeys(EmptyPass);
		}
		
}
