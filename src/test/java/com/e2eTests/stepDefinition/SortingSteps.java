package com.e2eTests.stepDefinition;

import org.openqa.selenium.support.PageFactory;

import com.e2e.lumaProject.Base;
import com.e2eTests.pageObjects.SortingObjects;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortingSteps extends Base {

	static SortingObjects sortingObjects = new SortingObjects();

	// **Sorting with price range**//
	@When("I click on Price dropdown menu and select the price range")
	public void i_click_on_price_dropdown_menu_and_select_the_price_range() {
		PageFactory.initElements(driver, SortingObjects.class);
		sortingObjects.selectPriceRange();
	}

	@Then("The result of the search must respect the price range")
	public void the_result_of_the_search_must_respect_the_price_range() {
		sortingObjects.priceRangeResult();
	}

	// *Sorting with Size**//
	@When("I click on Size dropdown menu and select the Size")
	public void I_click_on_Size_dropdown_menu_and_select_the_Size() {
		PageFactory.initElements(driver, SortingObjects.class);
		sortingObjects.selecMenSize();
	}

	@Then("The result of the search must respect the Size")
	public void The_result_of_the_search_must_respect_the_Size() {
		sortingObjects.SizeResult();
	}

	// **Sorting with Color**//
	@When("I click on Color dropdown menu and select the Color")
	public void I_click_on_Color_dropdown_menu_and_select_the_Color() {
		PageFactory.initElements(driver, SortingObjects.class);
		sortingObjects.selectBrasColor();
	}

	@Then("The result of the search must respect the Color selected")
	public void The_result_of_the_search_must_respect_the_Color_selected() throws InterruptedException {
		Thread.sleep(2000);
		sortingObjects.colorBrasResult();
	}

	// **Sorting by price organization,least expensive to the most expensive**//
	@When("I select the price option from the dropdown menu")
	public void I_select_the_price_option_from_the_dropdown_menu() {
		PageFactory.initElements(driver, SortingObjects.class);
		sortingObjects.selectSortedByPrice();
	}

	@Then("The search result must be displayed from the least expensive to the most expensive")
	public void The_search_result_must_be_displayed_from_the_least_expensive_to_the_most_expensive() {
		sortingObjects.priceOrganizationResultAssert();
	}

	// **Sorting by Product Name organization**//
	@When("I select product name from the dropdown menu")
	public void I_select_product_name_from_the_dropdown_menu() {
		PageFactory.initElements(driver, SortingObjects.class);
		sortingObjects.selectSortedByProductName();
	}

	@Then("the result should be displayed in alphabetical order")
	public void the_result_should_be_displayed_in_alphabetical_order() {
		sortingObjects.priceOrganizationAlphaResultAssert();
	}

	// **Sorting by price organization,most expensive to least expensive**//
	@When("I click on Sort By arrow")
	public void I_click_on_Sort_By_arrow() {
		PageFactory.initElements(driver, SortingObjects.class);
		sortingObjects.clickOnSortByArrow();
	}

	@Then("The search result must be displayed from most expensive to least expensive")
	public void The_search_result_must_be_displayed_from_most_expensive_to_least_expensive() {
		sortingObjects.priceOrganizationArrowResultAssert();
	}

	// **Sorting by product name reverse organization**//
	@Then("the result should be displayed in reverse alphabetical order")
	public void the_result_should_be_displayed_in_reverse_alphabetical_order() {
		PageFactory.initElements(driver, SortingObjects.class);
		sortingObjects.productNameOrganizationReverseResultAssert();
	}

	// **Change the display from Grid to List**//
	@When("I click on List button")
	public void I_click_on_List_button() {
		PageFactory.initElements(driver, SortingObjects.class);
		sortingObjects.clickOnListButton();
	}

	@Then("Products should be displayed in list form")
	public void Products_should_be_displayed_in_list_form() {
		sortingObjects.listDisplayeAssert();
	}
	//**Add a Review**//
	@When("I click on a product")
	public void I_click_on_a_product() {
		PageFactory.initElements(driver, SortingObjects.class);
		sortingObjects.selectProduct();
	}
	@When("I click on Add Your Review button")
	public void I_click_on_Add_Your_Review_button() {
		sortingObjects.clickOnAddYourReview();
	}
	@When("I fill a Nickname {string} summary {string} and review {string}")
	public void I_fill_a_Nickname_summary_and_review(String nickName, String summary, String review) {
		sortingObjects.fillAllReviewfields(nickName, summary, review);
	}
	@When("I select Rating and i click on Submit Review button")
	public void I_select_Rating_and_i_click_on_Submit_Review_button() {
		sortingObjects.addRatingAndClickSubmit();
	}
	@Then("The Review should be added")
	public void The_Review_should_be_added() {
		sortingObjects.addReviewAssert();
	}
	
	
	
	
	
	
	
	
	
}
