package com.e2eTests.pageObjects;



import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2e.lumaProject.Base;

public class SignUpPageObject extends Base {

	final static String FIRST_NAME_FIELD = "//input[@id = 'firstname']";
	final static String LAST_NAME_FIELD = "//input[@id = 'lastname']";
	final static String Email_FIELD = "//input[@id = 'email_address']";
	final static String PASSWORD_FIELD = "//input[@id = 'password']";
	final static String CONFIRM_PASSWORD_FIELD = "//input[@id = 'password-confirmation']";
	final static String SIGNUP_NEWSLETTER_CHECK_BUTTON = "//input[@id = 'is_subscribed']";
	final static String CREAT_AN_ACCOUNT_BUTTON = "//button[@title = 'Create an Account']";
	final static String SIGNUP_SUCCESS_ASSERT = "//span[contains(text(),'My Account')]";
	final static String SUCCESS_SIGHUP_MESSAG_ASSERT = "//div[contains(text(),'Thank you for registering with Fake Online Clothin')]";
	final static String FAILED_SIGHUP_WRONG_EMAIL_ASSERT = "//div[@id='email_address-error']";
	final static String WRONG_CONFIRM_PW_ASSERT = "//div[@id='password-confirmation-error']";
	final static String USED_EMAIL_MESSAGE_ASSERT = "//div[@data-bind = 'html: $parent.prepareMessageForHtml(message.text)']";
	final static String UNDER_EIGHT_PW_ASSERT = "//div[@id='password-error']";
	
	final static String FIRST_NAME_EMPTY_ASSERT = "//div[@id='firstname-error']";
	final  static String LAST_NAME_EMPTY_ASSERT = "//div[@id='lastname-error']";
	final static String EMAIL_EMPTY_ASSERT = "//div[@id='email_address-error']";
	final static String PASSWORD_EMPTY_ASSERT = "//div[@id='password-error']";
	final static String CONFIRM_PW_EMPTY_ASSERT = "//div[@id='password-confirmation-error']";
	
	// **FindBy**//
	@FindBy(how = How.XPATH, using = FIRST_NAME_FIELD)
	public static WebElement firstNameField;
	@FindBy(how = How.XPATH, using = LAST_NAME_FIELD)
	public static WebElement lastNameField;
	@FindBy(how = How.XPATH, using = Email_FIELD)
	public static WebElement emailField;
	@FindBy(how = How.XPATH, using = PASSWORD_FIELD)
	public static WebElement passwordField;
	@FindBy(how = How.XPATH, using = CONFIRM_PASSWORD_FIELD)
	public static WebElement confirmPasswordField;
	@FindBy(how = How.XPATH, using = SIGNUP_NEWSLETTER_CHECK_BUTTON)
	public static WebElement signupNewsletterChekButton;
	@FindBy(how = How.XPATH, using = CREAT_AN_ACCOUNT_BUTTON)
	public static WebElement creatAnAccountButton;
	@FindBy(how = How.XPATH, using = SIGNUP_SUCCESS_ASSERT)
	public static WebElement signupSuccessAssert;
	@FindBy(how = How.XPATH, using = SUCCESS_SIGHUP_MESSAG_ASSERT)
	public static WebElement succesSignupMessagAssert;
	@FindBy(how = How.XPATH, using = FAILED_SIGHUP_WRONG_EMAIL_ASSERT)
	public static WebElement failedSignupWrongeEmailMessagAssert;
	@FindBy(how = How.XPATH, using = WRONG_CONFIRM_PW_ASSERT)
	public static WebElement wrongConfirmPwAssert;
	@FindBy(how = How.XPATH, using = USED_EMAIL_MESSAGE_ASSERT)
	public static WebElement usedEmailMessageAssert;
	@FindBy(how = How.XPATH, using = UNDER_EIGHT_PW_ASSERT)
	public static WebElement underEightPwAssert;
	
	@FindBy(how = How.XPATH, using = FIRST_NAME_EMPTY_ASSERT)
	public static WebElement firstNameEmptyAssert;
	@FindBy(how = How.XPATH, using = LAST_NAME_EMPTY_ASSERT)
	public static WebElement lastNameEmptyAssert;
	@FindBy(how = How.XPATH, using = EMAIL_EMPTY_ASSERT)
	public static WebElement emailEmptyAssert;
	@FindBy(how = How.XPATH, using = PASSWORD_EMPTY_ASSERT)
	public static WebElement passwordEmptyAssert;
	@FindBy(how = How.XPATH, using = CONFIRM_PW_EMPTY_ASSERT)
	public static WebElement confirmPwEmptyAssert;
	
	// **Methods**//
	public void enterFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	public void enterEmailAdress(String email) {
		emailField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordField.sendKeys(confirmPassword);
	}

	public void clickCreatAnAccount() {
		creatAnAccountButton.click();
	}

	public void SignupSuccessAssert() {
		Assert.assertTrue("SignUp Faild !",signupSuccessAssert.isDisplayed());
	}

	public void signupSuccesMessagAssert() {
		String signupSuccesMessag = succesSignupMessagAssert.getText();
		Assert.assertEquals("SignUp Succes Message is Not Displayed !",signupSuccesMessag, "Thank you for registering with Fake Online Clothing Store.");
	}
	public void enterInvalidEmailadress(String email) {
		emailField.sendKeys(email);
	}
	
	
	public void signupFailedWrongEmailMessagAssert() {
		String wrongEmail = failedSignupWrongeEmailMessagAssert.getText();
		Assert.assertEquals("The error message for the wrong email is not displayed !",wrongEmail, "Please enter a valid email address (Ex: johndoe@domain.com).");
	}
	public void enterWrongConfirmPw(String confirmPassword ) {
		confirmPasswordField.sendKeys(confirmPassword);
	}
	
	
	public void wrongConfirmPwAssert() {
		String wrongConfirmPw  = wrongConfirmPwAssert.getText();
		Assert.assertEquals("Wrong Confirm Password Error messag is Not Displayed !",wrongConfirmPw, "Please enter the same value again.");
	}
	public void usedEmailMessageAssert() {
		Assert.assertNotNull("Used email Error Messag is Not Displayed !",usedEmailMessageAssert);
	}
	public void underEightPwAssert() {
		String pwUnderEight = underEightPwAssert.getText();
		Assert.assertEquals(pwUnderEight, "Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored.");
	}
	public void firstNameEmtyAssert() {
		String fnEmpty = firstNameEmptyAssert.getText();
		Assert.assertEquals(fnEmpty, "This is a required field.");
	}
	public void lastNameEmptyAssert() {
		String lnEmpty = lastNameEmptyAssert.getText();
		Assert.assertEquals(lnEmpty, "This is a required field.");
	}
	public void emailEmptyAssert() {
		String emailempty = emailEmptyAssert.getText();
		Assert.assertEquals(emailempty, "This is a required field.");
	}
	public void passwordEmptyAssert() {
		String emptyPw = passwordEmptyAssert.getText();
		Assert.assertEquals(emptyPw, "This is a required field.");
	}
	public void confirmEmptyPwAssert() {
		String emptyConfirmPw = confirmPwEmptyAssert.getText();
		Assert.assertEquals(emptyConfirmPw, "This is a required field.");
	}
	public void checkNwesletterButton() {
		signupNewsletterChekButton.click();
	}
}
