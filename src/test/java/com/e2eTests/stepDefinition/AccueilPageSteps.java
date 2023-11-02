package com.e2eTests.stepDefinition;



import org.openqa.selenium.support.PageFactory;

import com.e2e.lumaProject.Base;
import com.e2eTests.pageObjects.AccueilPageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccueilPageSteps extends Base {

	static AccueilPageObjects accueilPageObjects = new AccueilPageObjects();
	
	
	
	// **check WHATS NEW link**//
	@Given("I am on the Accueil page")
	public void i_am_on_the_accueil_page() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		lunchBrowser();
		driver.get(props.getProperty("url"));
		
	}

	@When("I click on whats new link")
	public void i_click_on_whats_new_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnWhatsNewButton();
	}

	@Then("I should be redirected to whats new page")
	public void i_should_be_redirected_to_whats_new_page() {
		accueilPageObjects.WhatsNewPageAssert();
	}

	// **check WOMEN link//
	@Given("I click on women link")
	public void I_click_on_women_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects = new AccueilPageObjects();
		accueilPageObjects.clickOnWomenBtton();
	}

	@When("I should be redirected to women page")
	public void I_should_be_redirected_to_women_page() {
		accueilPageObjects.womenPageAssert();
	}

	// **check MEN link**//
	@When("I click on men link")
	public void I_click_on_men_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnMenButton();
	}

	@Then("I should be redirected to men page")
	public void I_should_be_redirected_to_men_page() {
		accueilPageObjects.menPageAssert();
	}

	// **check GEAR link**//
	@When("I click on Gear link")
	public void I_click_on_Gear_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnGearButton();
	}

	@Then("I should be redirected to Gear page")
	public void I_should_be_redirected_to_Gear_page() {
		accueilPageObjects.gearPageAssert();
	}

	// **check TRAINING link**//
	@When("I click on Training link")
	public void I_click_on_Training_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnTrainingBtton();
	}

	@Then("I should be redirected to Training page")
	public void I_should_be_redirected_to_Training_page() {
		accueilPageObjects.trainingPageAssert();
	}

	// **check SALE link**//
	@When("I click on Sale link")
	public void I_click_on_Sale_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnSaleButton();
	}

	@Then("I should be redirected to Sale page")
	public void I_should_be_redirected_to_Sale_page() {
		accueilPageObjects.salePageAssert();
	}

	// **check SIGN IN link**//
	@When("I click on Sign In link")
	public void I_click_on_Sign_In_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnSignInButton();
	}

	@Then("I should be redirected to Sign In page")
	public void I_should_be_redirected_to_Sign_In_page() {
		accueilPageObjects.signInPageAssert();
	}

	// **check CREATE AN ACCOUNT link**//
	@When("I click on Create an account link")
	public void I_click_on_Create_an_account_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnCreatAnAccountButton();
	}

	@Then("I should be redirected to Create an accont page")
	public void I_should_be_redirected_to_Create_an_accont_page() {
		accueilPageObjects.creatAnAccountPageAssert();
	}

	// **check CADET ICON link**//
	@When("I click on Cadet icon link")
	public void I_click_on_Cadet_icon_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnCadetIconButton();
	}

	@Then("cadet content must be displayed")
	public void cadet_content_must_be_displayed() {
		accueilPageObjects.cadetContentDisplay();
	}
	//**check SHOP YOGA NOW link**//
	@When("I click on Shop Yoga Now link")
	public void I_click_on_Shop_Yoga_Now_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnShopingNowButton();
	}
	@Then("I should be redirected to New Yuma Yoga Collection page")
	public void I_should_be_redirected_to_New_Yuma_Yoga_Collection_page() {
		accueilPageObjects.newYogaCollectionPageAssert();
	}
	//**check TWENTY PERCENT OFF link**//
	@When("I click on Twenty Percent Off link")
	public void I_click_on_Twenty_Percent_Off_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnTwentyPercentOffLink();
	}
	@Then("I should be redirected to Pants Shop page")
	public void I_should_be_redirected_to_Pants_Shop_page() {
		accueilPageObjects.pantShoopingPageAssert();
	}
	//**check SHOP TEES link**//
	@When("I click on Shop Tees link")
	public void  I_click_on_Shop_Tees_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnTeesLink();
	}
	@Then("I should be redirected to Tees Shop page")
	public void I_should_be_redirected_to_Tees_Shop_page() {
		accueilPageObjects.teesShopPageAssert();
	}
	//**check SHOP ERIN RECOMMENDS link**//
	@When("I click on Shop Erin Recommends link")
	public void I_click_on_Shop_Erin_Recommends_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnErinRecommendsLink();
	}
	@Then("I should be redirected to Erin Recommends Shop page")
	public void I_should_be_redirected_to_Erin_Recommends_Shop_page() {
		accueilPageObjects.erinCommendsShopPageAssert();
	}
	//**check SHOP PERFORMANCE link**//
	@When("I click on Shop Performance link")
	public void I_click_on_Shop_Performance_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnPerformanceLink();
	}
	@Then("I should be redirected to Performance Fabrics page")
	public void I_should_be_redirected_to_Performance_Fabrics_page() {
		accueilPageObjects.performanceFabricsPageAssert();
	}
	//**check SHOP ECO-FRIENDLY link
	@When("I click on Shop EcoFriendly link")
	public void I_click_on_Shop_EcoFriendly_link() {
		PageFactory.initElements(driver, AccueilPageObjects.class);
		accueilPageObjects.clickOnEcoFriendlyLink();
	}
	@Then("I should be redirected to Eco Friendly page")
	public void I_should_be_redirected_to_Eco_Friendly_page() {
		accueilPageObjects.ecoFriendlyPageAssert();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}