package com.e2eTests.stepDefinition;

import org.openqa.selenium.support.PageFactory;

import com.e2e.lumaProject.Base;

import com.e2eTests.pageObjects.WomenOpbejcts;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WomenSteps extends Base {

	 WomenOpbejcts womenOpbejcts;

	public WomenSteps() {
		PageFactory.initElements(driver, WomenOpbejcts.class);
		this.womenOpbejcts = new WomenOpbejcts();
	}

	// **check Jackets links in womens menu**//
	@When("I click on the link Women Jakets through the hidden menu")
	public void i_click_on_the_link_women_jakets_through_the_hidden_menu() {
		// PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnHiddenJakets();
	}

	@Then("I should be redirected to Jackets page")
	public void i_should_be_redirected_to_jackets_page() {
		womenOpbejcts.jacketsPageAssert();
	}

	// **check Hoodies and Sweatshirts links in womens menu**//
	@When("I click on the link Women Hoodies and Sweatshirts through the hidden menu")
	public void I_click_on_the_link_Women_Hoodies_and_Sweatshirts_through_the_hidden_menu() {
		// PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnHiddenhoodiesSweatshirts();
	}

	@Then("I should be redirected to Hoodies and Sweatshirts page")
	public void I_should_be_redirected_to_Hoodies_and_Sweatshirts_page() {
		womenOpbejcts.hoodiesSweatshirtsAssert();
	}

	// **check Tees links in womens menu**//
	@When("I click on the link Tees through the hidden menu")
	public void I_click_on_the_link_Tees_through_the_hidden_menu() {
		// PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnHiddenTees();
	}

	@Then("I should be redirected to Tees page")
	public void I_should_be_redirected_to_Tees_page() {
		womenOpbejcts.teesAssert();
	}

	// **check Bras and Tanks links in womens menu**//
	@When("I click on the link Bras and Tanks through the hidden menu")
	public void I_click_on_the_link_Bras_and_Tanks_through_the_hidden_menu() {
		// PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnHiddenbrasTanks();
	}

	@Then("I should be redirected to Bras and Tanks page")
	public void I_should_be_redirected_to_Bras_and_Tanks_page() {
		womenOpbejcts.brasTanksAssert();
	}

	// **check Pants links in womens menu**//
	@When("I click on the link Pants through the hidden menu")
	public void I_click_on_the_link_Pants_through_the_hidden_menu() {
		// PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnHiddenPants();
	}

	@Then("I should be redirected to Pants page")
	public void I_should_be_redirected_to_Pants_page() {
		womenOpbejcts.pantsAssert();
	}

	// **check Shorts links in womens menu**//
	@When("I click on the link Shorts through the hidden menu")
	public void I_click_on_the_link_Shorts_through_the_hidden_menu() {
		// PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnHiddenShorts();
	}

	@Then("I should be redirected to Shorts page")
	public void I_should_be_redirected_to_Shorts_page() {
		womenOpbejcts.shortsAssert();

	}

	// **check Top link in Women page**//
	@When("I click on top button")
	public void I_click_on_top_button() {
		PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnTopButton();
	}

	@Then("I should be redirected to Top page")
	public void I_should_be_redirected_to_Top_page() {
		womenOpbejcts.topAssert();
	}

	// **check Bottoms link in Women page**//
	@When("I click on Bottoms button")
	public void I_click_on_Bottoms_button() {
		PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnBottomsButton();
	}

	@Then("I should be redirected to Bottoms page")
	public void I_should_be_redirected_to_Bottoms_page() {
		womenOpbejcts.bottomsAssert();
	}

	// **check Hoodies and SweatShirts in Women page**//
	@When("I click on Hoodies and SweatShirts button")
	public void I_click_on_Hoodies_and_SweatShirts_button() {
		// PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnHoodiesSweatshirts();
	}

	@Then("I should be redirected to Hoodies and SweatShirts page")
	public void I_should_be_redirected_to_Hoodies_and_SweatShirts_page() {
		womenOpbejcts.hoodiesSweatshirtsAssert();
	}

	// **check Jackets in Women page**//
	@When("I click on Jackets button")
	public void I_click_on_Jackets_button() {
		// PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnJacketButton();
	}

	// **check Tees in Women page**//
	@When("I click on Tees button")
	public void I_click_on_Tees_button() {
		// PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnTeesButton();
	}

	// **check Bras and Tanks in Women page**//
	@When("I click on Bras and Tanks button")
	public void I_click_on_Bras_and_Tanks_button() {
		// PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnBrasTanksButton();
	}

	// **check Pants in Women page**//
	@When("I click on Pants button")
	public void I_click_on_Pants_button() {
		// PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnPantsButton();
	}

	// **check Shorts in Women page**//
	@When("I click on Shorts button")
	public void I_click_on_Shorts_button() {
		// PageFactory.initElements(driver, WomenOpbejcts.class);
		womenOpbejcts.clickOnShortsButton();
	}

}
