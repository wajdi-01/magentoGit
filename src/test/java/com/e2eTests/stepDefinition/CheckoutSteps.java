package com.e2eTests.stepDefinition;

import org.openqa.selenium.support.PageFactory;

import com.e2e.lumaProject.Base;
import com.e2eTests.pageObjects.CheckoutObjects;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps extends Base {
	
	CheckoutObjects checkoutObjects;
	
	public CheckoutSteps() {
		PageFactory.initElements(driver, CheckoutObjects.class);
		this.checkoutObjects = new CheckoutObjects();
	}
	
	
	//**Successful Checkout,Table Rate Shipping Methods**//
	@When("I click on Proceed to Cheackout button")
	public void i_click_on_proceed_to_cheackout_button() {
	   //PageFactory.initElements(driver, CheckoutObjects.class);
	   checkoutObjects.clickOnProceedToCheckout();
	}

	@When("fill all fields with valid information")
	public void fill_all_fields_with_valid_information() {
		checkoutObjects.fillAllFieldsValid();
	}

	@When("select Tabel Rate shipping methods and click next button")
	public void select_tabel_rate_shipping_methods_and_click_next_button() {
		checkoutObjects.tabelRateShippingMethodsNext();
	}

	@When("I click on Place Order button")
	public void i_click_on_place_order_button() throws InterruptedException {
		Thread.sleep(5000);
		checkoutObjects.clickOnPlaceOrder();
	}

	@Then("the order should be placed successfully")
	public void the_order_should_be_placed_successfully() {
		checkoutObjects.successfulChecoutAssert();
	}
	//**Successful Checkout,Fixed Shipping Methods**//
	@Then("select Fixed shipping methods and click next button")
	public void select_Fixed_shipping_methods_and_click_next_button() {
		//PageFactory.initElements(driver, CheckoutObjects.class);
		checkoutObjects.fixedMethodsNext();
	}
	//**Failed Checkout,empty informations**//
	@When("I leave all the chomps empty")
	public void I_leave_all_the_chomps_empty() {
		//PageFactory.initElements(driver, CheckoutObjects.class);
		checkoutObjects.leaveAllFieldsEmpty();
	}
	@Then("the order should be failed")
	public void the_order_should_be_failed() {
		checkoutObjects.failedCheckoutEmptyNext();
	}
	//**Failed checkout, no shipping method selected**//
	@When("Click next button")
	public void Click_next_button() {
		//PageFactory.initElements(driver, CheckoutObjects.class);
		checkoutObjects.clickOnNextButton();
	}
	@Then("An error message should be displayed")
	public void An_error_message_should_be_displayed() {
		checkoutObjects.unselectedShippingMethodsMessage();
	}
	//**Checkout after closing the browser and re-launch it**//
	@When("close browser and relaunch it")
	public void close_browser_and_relaunch_it() {
		//PageFactory.initElements(driver, CheckoutObjects.class);
		
	}
	
	
}
