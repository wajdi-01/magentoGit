package com.e2eTests.stepDefinition;

import org.openqa.selenium.support.PageFactory;

import com.e2e.lumaProject.Base;
import com.e2eTests.pageObjects.WhatsNewObjects;

import io.cucumber.java.en.Then;


public class WhatsNewSteps extends Base {
	
	final WhatsNewObjects whatsNewObjects = new WhatsNewObjects();
	
	//**Verify New in Womens category**/
	@Then("I click on each womens category one by one and I should be directed to the right page")
	public void I_click_on_each_womens_category_one_by_one_and_I_should_be_directed_to_the_right_page() {
	    PageFactory.initElements(driver, WhatsNewObjects.class);
	    whatsNewObjects.clickOnEachWomensCategory();
	}
	//**Verify New in Mens category**//
	@Then("I click on each mens category one by one and I should be directed to the right page")
	public void I_click_on_each_mens_category_one_by_one_and_I_should_be_directed_to_the_right_page() {
		PageFactory.initElements(driver, WhatsNewObjects.class);
		whatsNewObjects.clickOnEachMensCategory();

	}
}
