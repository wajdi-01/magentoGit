package com.e2eTests.stepDefinition;

import org.openqa.selenium.support.PageFactory;

import com.e2e.lumaProject.Base;
import com.e2eTests.pageObjects.GearObjects;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GearSteps extends Base {
	
	static GearObjects gearObjects = new GearObjects(); 
	
	//**check Bags link**//
	@When("I click on Bags button")
	public void i_click_on_bags_button() {
		PageFactory.initElements(driver, GearObjects.class);
		gearObjects.clickOnBags();
	    
	}

	@Then("I should be redirected to Bags page")
	public void i_should_be_redirected_to_bags_page() {
		gearObjects.bagsPageAssert();
	}
	//**check Fitness Equipment link**//
	@When("I click on Fitness Equipment button")
	public void i_click_on_fitness_equipment_button() {
		PageFactory.initElements(driver, GearObjects.class);
		gearObjects.clickOnFitnessEquipmentLink();
	}

	@Then("I should be redirected to Fitness Equipment page")
	public void i_should_be_redirected_to_fitness_equipment_page() {
		gearObjects.fitnessEquipmentPageAssert();
	}
	//**check Watches link**//
	@When("I click on Watches button")
	public void i_click_on_watches_button() {
		PageFactory.initElements(driver, GearObjects.class);
		gearObjects.clickOnWatchesLink();
	}

	@Then("I should be redirected to Watches page")
	public void i_should_be_redirected_to_watches_page() {
		gearObjects.watchesPageAssert();
	}
	//**check Bags links in hidden menu**//
	@When("I click on Bags link through the hidden menu")
	public void i_click_on_bags_link_through_the_hidden_menu() {
		PageFactory.initElements(driver, GearObjects.class);
		gearObjects.clickOnBagsHiddenOption();
	}
	//**check Fitness Equipment links in hidden menu**//
	@When("I click on Fitness Equipment through the hidden menu")
	public void i_click_on_fitness_equipment_through_the_hidden_menu() {
		PageFactory.initElements(driver, GearObjects.class);
		gearObjects.clickOnFitnessEquipmentHiddenOption();
	}
	//**check Watches links in hidden menu**//
	@When("I click on Watches through the hidden menu")
	public void i_click_on_watches_through_the_hidden_menu() {
		PageFactory.initElements(driver, GearObjects.class);
		gearObjects.clickOnWatchesHiddenOption();
	}
	
	
	
	
	

}
