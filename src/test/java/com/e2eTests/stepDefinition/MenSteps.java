package com.e2eTests.stepDefinition;

import org.openqa.selenium.support.PageFactory;

import com.e2e.lumaProject.Base;
import com.e2eTests.pageObjects.MenOpbjects;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenSteps extends Base {

	final MenOpbjects menOpbjects = new MenOpbjects();

	// **check Jackets links in Men menu**//
	@When("I click on the link Men Jakets through the hidden menu")
	public void I_click_on_the_link_Men_Jakets_through_the_hidden_menu() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnHidenJackets();
	}

	@Then("I should be redirected to Men Jackets page")
	public void i_should_be_redirected_to_men_jackets_page() {
		menOpbjects.jacketsPageAssert();
	}

	// **check Hoodies and Sweatshirts links in Men menu**//
	@When("I click on the link Men Hoodies and Sweatshirts through the hidden menu")
	public void I_click_on_the_link_Men_Hoodies_and_Sweatshirts_through_the_hidden_menu() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnHidenhoodiesSweatshirts();
	}

	@Then("I should be redirected to Men Hoodies and Sweatshirts page")
	public void I_should_be_redirected_to_Men_Hoodies_and_Sweatshirts_page() {
		menOpbjects.hoodiesSweatshirtsAssert();
	}

	// **check Tees links in Men menu**//
	@When("I click on the link Men Tees through the hidden menu")
	public void I_click_on_the_link_Men_Tees_through_the_hidden_menu() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnHidenTees();
	}

	@Then("I should be redirected to Men Tees page")
	public void I_should_be_redirected_to_Men_Tees_page() {
		menOpbjects.teesAssert();
	}

	// **check Tanks links in Men menu**//
	@When("I click on the link Men Tanks through the hidden menu")
	public void I_click_on_the_link_Men_Tanks_through_the_hidden_menu() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnHidenTenanks();
	}

	@Then("I should be redirected Men Tanks page")
	public void I_should_be_redirected_Men_Tanks_page() {
		menOpbjects.tanksAssert();
	}

	// **check Pants links in Men menu**//
	@When("I click on the link Men Pants through the hidden menu")
	public void I_click_on_the_link_Men_Pants_through_the_hidden_menu() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnHidenPants();
	}

	@Then("I should be redirected to Men Pants page")
	public void I_should_be_redirected_to_Men_Pants_page() {
		menOpbjects.pantsAssert();
	}

	// **check Shorts links in Men menu**//
	@When("I click on the link Men Shorts through the hidden menu")
	public void I_click_on_the_link_Men_Shorts_through_the_hidden_menu() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnHidenShorts();
	}

	@Then("I should be redirected to Men Shorts page")
	public void I_should_be_redirected_to_Men_Shorts_page() {
		menOpbjects.shortsAssert();

	}

	// **check Top link in Men page**//
	@When("I click on Men link")
	public void I_click_on_Men_link() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnMenButton();
	}

	@When("I click on Men top button")
	public void I_click_on_Men_top_button() {
		menOpbjects.clickOnTopButton();
	}

	@Then("I should be redirected to Men Top page")
	public void I_should_be_redirected_to_Men_Top_page() {
		menOpbjects.topAssert();
	}

	// **check Bottoms link in Men page**//
	@When("I click on Men  Bottoms button")
	public void I_should_be_redirected_to_Men_Bottoms_page() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnBottomsButton();
	}

	@Then("I should be redirected to Men Bottoms page")
	public void I_should_be_redirected_to_Bottoms_page() {
		menOpbjects.bottomsAssert();
	}

	// **check Hoodies and SweatShirts in Men page**//
	@When("I click on Men Hoodies and SweatShirts button")
	public void I_click_on_Men_Hoodies_and_SweatShirts_button() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnHoodiesSweatshirts();
	}

	@Then("I should be redirected to Men Hoodies and SweatShirts page")
	public void I_should_be_redirected_to_Men_Hoodies_and_SweatShirts_page() {
		menOpbjects.hoodiesSweatshirtsAssert();
	}

	// **check Jackets in Men page**//
	@When("I click on Men Jackets button")
	public void I_click_on_Men_Jackets_button() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnJacketButton();
	}

	// **check Tees in Men page**//
	@When("I click on Men Tees button")
	public void I_click_on_Men_Tees_button() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnTeesButton();
	}

	// **check Tanks in Men page**//
	@When("I click on Men Tanks button")
	public void I_click_on_Men_Tanks_button() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnBrasTanksButton();
	}

	// **check Pants in Men page**//
	@When("I click on Men Pants button")
	public void I_click_on_Men_Pants_button() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnPantsButton();
	}

	// **check Shorts in Men page**//
	@When("I click on Men Shorts button")
	public void I_click_on_Men_Shorts_button() {
		PageFactory.initElements(driver, MenOpbjects.class);
		menOpbjects.clickOnShortsButton();
	}

}
