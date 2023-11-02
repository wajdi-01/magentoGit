package com.e2eTests.stepDefinition;


import org.openqa.selenium.support.PageFactory;

import com.e2e.lumaProject.Base;
import com.e2eTests.pageObjects.WishListPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListSteps extends Base {

	final WishListPage wishListPage = new WishListPage();
	//private static WishListPage wishListPage;
	
	//@BeforeClass
	//public static void setUp() {
		//wishListPage = PageFactory.initElements(driver, WishListPage.class);
	//}

	// **Add a product in my Wish List**//
	@Given("I put the mouse on the product to add in my Wish List")
	public void I_put_the_mouse_on_the_product_to_add_in_my_Wish_List() {
		PageFactory.initElements(driver, WishListPage.class);
		wishListPage.putTheMouseOnTheProduct();
	}

	@When("I click on the add to my Wish List button")
	public void I_click_on_the_add_to_my_Wish_List_button() {
		wishListPage.clickOnAddProductToWishListButton();
	}

	@Then("The product should be add to my Wish List")
	public void The_product_should_be_add_to_my_Wish_List() {
		wishListPage.productAddToWishListAssert();
	}

	// **Remove a product from the wish list**//
	@When("I click on Remove This item icon button")
	public void I_click_on_Revove_This_item_icon_button() {
		PageFactory.initElements(driver, WishListPage.class);
		wishListPage.clickOnRemoveButton();
	}

	@Then("The Product should be removed from the Wish List")
	public void The_Product_should_be_reloved_from_the_Wish_List() {
		wishListPage.removedProductFromWishListAssert();
	}

	// **Add product to the cart from my Wish List**//
	@When("I click on Add All to cart")
	public void I_click_on_Add_All_to_cart() {
		PageFactory.initElements(driver, WishListPage.class);
		wishListPage.clickOnAddAllToCart();
	}

	@When("All the products of the wish list should disappear")
	public void All_the_products_of_the_wish_list_should_disappear() {
		wishListPage.productDisappearFromWishList();
	}

	@Then("All the product must be in the cart")
	public void All_the_product_must_be_in_the_cart() {
		wishListPage.productDisappearFromWishList();
	}

	// **View my Wish List**//
	@When("I click on the account drop down menu")
	public void I_click_on_the_account_drop_down_menu() {
		PageFactory.initElements(driver, WishListPage.class);
		wishListPage.clickOnAccountDropdownMenu();
	}

	@When("I click on Wish List option")
	public void I_click_on_Wish_List_option() {
		wishListPage.clickOnMyWishListOption();
	}

	@Then("I should see a list of all the products in my wish list")
	public void I_should_see_a_list_of_all_the_products_in_my_wish_list() {
		wishListPage.myWishListPageAssert();
	}

	// **Share my wish list with others**//
	@When("I click on Share Wish List button")
	public void I_click_on_Share_Wish_List_button() {
		PageFactory.initElements(driver, WishListPage.class);
		wishListPage.clickOnShareWishListButton();
	}

	@When("I fill in the recipient email {string} address and a message {string}")
	public void I_fill_in_the_recipient_email_address_and_a_message(String email, String message) {
		wishListPage.fillEamailAndMessage(email, message);
	}

	@When("I click on share Wish List button")
	public void I_click_on_share_Wish_List_button() {
		wishListPage.clickOnShareWishListLastButton();
	}

	@Then("The Wish List should be shared")
	public void The_Wish_List_should_be_shared() {
		wishListPage.confirmSharingWishListMessagAssert();
	}

	// **Access to the Reorder page**//
	@When("I click on My Orders button")
	public void I_click_on_My_Orders_button() {
		PageFactory.initElements(driver, WishListPage.class);
		
	}
	@Then("The reorder page should be displayed")
	public void The_reorder_page_should_be_displayed() {
		
	}
	
	
	
	
	
	
	
	

}
