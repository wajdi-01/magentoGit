package com.e2eTests.pageObjects;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.e2e.lumaProject.Base;

public class CheckoutObjects extends Base {
public static Properties props = new Properties();	
	
	
	//**FindBy**//
	@FindBy(xpath = "")
	public static WebElement X;
	@FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
	public static WebElement proceedToCheckoutButton;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
	public static WebElement emailAdress;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[1]/div[1]/input[1]")
	public static WebElement firstNameField;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[2]/div[1]/input[1]")
	public static WebElement lastNameField;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[3]/div[1]/input[1]")
	public static WebElement companyField;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/input[1]")
	public static WebElement streetAdressField;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[4]/div[1]/input[1]")
	public static WebElement cityField;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[5]/div[1]/select[1]") 
	public static WebElement stateDropDown;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[5]/div[1]/select[1]/option[13]")
	public static WebElement stateChoice;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[7]/div[1]/input[1]")
	public static WebElement zipCodeField;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[9]/div[1]/input[1]")
	public static WebElement phoneNumberField;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	public static WebElement shippingMethodTabelRate;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[3]/div[1]/button[1]/span[1]")
	public static WebElement nextButton;
	@FindBy(xpath = "//span[contains(text(),'Place Order')]")
	public static WebElement palceOrderButton;
	@FindBy(xpath = "//span[contains(text(),'Thank you for your purchase!')]")
	public static WebElement checkoutSuccessMessageAssert;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")
	public static WebElement shippingMethodFixed;
	@FindBy(xpath = "//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public static WebElement firstNameEmptyError;
	@FindBy(xpath = "//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[2]/div[1]/div[1]/span[1]")
	public static WebElement lastNameEmptyError;
	@FindBy(xpath = "//span[contains(text(),'The shipping method is missing. Select the shippin')]")
	public static WebElement unselectedShippingMethodsMessage;
	
	//**Methods**//
	public void  clickOnProceedToCheckout() {
		proceedToCheckoutButton.click();
	}
	public void fillAllFieldsValid() {
		emailAdress.sendKeys("emailTest@gmail.com");
		firstNameField.sendKeys("NameTest");
		lastNameField.sendKeys("LastNameTest");
		companyField.sendKeys("CompanyTest");
		streetAdressField.sendKeys("7 street Test Test");
		cityField.sendKeys("Los Angeles");
		stateDropDown.click();
		stateChoice.click();
		zipCodeField.sendKeys("22000");
		phoneNumberField.sendKeys("0102030405");
		}
	public void tabelRateShippingMethodsNext() {
		shippingMethodTabelRate.click();
		nextButton.click();
	}
	 public void clickOnPlaceOrder() {
		 palceOrderButton.click();
	 }
	public void successfulChecoutAssert() {
		Assert.assertTrue(checkoutSuccessMessageAssert.isDisplayed());
		
	}
	public void fixedMethodsNext() {
		shippingMethodFixed.click();
		nextButton.click();
	}
	public void leaveAllFieldsEmpty() {
		emailAdress.sendKeys("emailTest@gmail.com");
		firstNameField.sendKeys("");
		lastNameField.sendKeys("");
		companyField.sendKeys("");
		streetAdressField.sendKeys("");
		cityField.sendKeys("");
		stateDropDown.click();
		stateChoice.click();
		zipCodeField.sendKeys("");
		phoneNumberField.sendKeys("");
	}
	public void failedCheckoutEmptyNext() {
		Assert.assertTrue(firstNameEmptyError.isDisplayed());
		Assert.assertTrue(lastNameEmptyError.isDisplayed());
	}
	public void clickOnNextButton() {
		nextButton.click();
	}
	public void unselectedShippingMethodsMessage() {
		Assert.assertTrue(unselectedShippingMethodsMessage.isDisplayed());
	}
	public void closeAndRelaunchBrowser() {
		driver.quit();
		driver.get("urlCheckOut");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
