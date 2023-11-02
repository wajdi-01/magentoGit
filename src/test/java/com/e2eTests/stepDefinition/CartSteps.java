package com.e2eTests.stepDefinition;

import org.openqa.selenium.support.PageFactory;

import com.e2e.lumaProject.Base;
import com.e2eTests.pageObjects.CartObjects;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps extends Base {

	CartObjects cartObjects;
	
	public CartSteps() {
		PageFactory.initElements(driver, CartObjects.class);
		this.cartObjects =new CartObjects();
	}

	// **Add a single product to the cart**//
	@When("I place the mouse on the product to add and i click on Add to Cart button")
	public void I_place_the_mouse_on_the_product_to_add_and_i_click_on_Add_to_Cart_button() {
		//PageFactory.initElements(driver, CartObjects.class);
		cartObjects.selctProduct();
	}

	@When("I choose the size, the color and the quantity")
	public void i_choose_the_size_the_color_and_the_quantity() {
		cartObjects.productSizeColor();
	}

	@When("I click on Add to Cart")
	public void i_click_on_add_to_cart() {
		cartObjects.clickOnAddCartButton();
	}

	@Then("the product should be added to the cart")
	public void the_product_should_be_added_to_the_cart() throws InterruptedException {
		cartObjects.productAlreadyAddedAssert();
	}

	// **Add product to cart without selecting size and color**//
	@When("I place the mouse on the product to add")
	public void I_place_the_mouse_on_the_product_to_add() {
		//PageFactory.initElements(driver, CartObjects.class);
		cartObjects.selectProductFailedcase();
	}
	
	@When("I click on Add to Cart button")
	public void I_click_on_Add_to_Cart_button() {
		cartObjects.clickAddToCartFailedCase();
	}

	@Then("Add to cart failed and error message should be displayed")
	public void Add_to_cart_failed_and_error_message_should_be_displayed() {
		cartObjects.failedAddProduct();
	}
	//** Add multiple products to cart**//
	@When("I navigate to the home page")
	public void I_navigate_to_the_home_page() {
		//PageFactory.initElements(driver, CartObjects.class);
		cartObjects.clickOnHomeLogo();
	}
	@When("I place the mouse on other product to add and i click on Add to Cart button")
	public void I_place_the_mouse_on_other_product_to_add_and_i_click_on_Add_to_Cart_button() {
		cartObjects.selectProductClickAddToCart();
	}  
	@Then("the tow products should be added to the cart") 
		public void the_tow_products_should_be_added_to_the_cart() throws InterruptedException {
		cartObjects.addTowProductAssert();
	}
	//**Delete a product from the cart**//
	@When("I click on the cart icon")
	public void I_click_on_the_cart_icon() throws InterruptedException {
		//PageFactory.initElements(driver, CartObjects.class);
		Thread.sleep(3000);
		cartObjects.clickOnCartIcon();
	}
	
	@When("I delete the product already added")
	public void I_delete_the_product_already_added()  {
		cartObjects.deleteProduct();
	}
	@When("The product should be deleted")
	public void The_product_should_be_deleted() {
		cartObjects.deleteProductAssert();
	}
	//**Review and modification cart**//
	@When("I click on View and Edit Cart button")
	public void I_click_on_View_and_Edit_Cart_button() {
		//PageFactory.initElements(driver, CartObjects.class);
		cartObjects.clickOnViewEditCartButton();
	}
	@When("I click on Edit item parametres icon")
	public void I_click_on_Edit_item_parametres_icon() {
		cartObjects.clickOnEditIconButton();
	}
	@When("I modify the quantity of the product")
	public void I_modify_the_quantity_of_the_product() {
		cartObjects.modifProductQuantity();
	}
	@When("I click on Updat cart button")
	public void I_click_on_Updat_cart_button() {
		cartObjects.clickOnUpdateCart();
	}
	@Then("cart should be modified")
	public void cart_should_be_modified() {
		cartObjects.modifCartAssert();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}