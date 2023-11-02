package com.e2eTests.pageObjects;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.e2e.lumaProject.Base;

public class WishListPage extends Base {

	// **FindBy**//

	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/ol[1]/li[6]/div[1]/a[1]/span[1]/span[1]/img[1]")
	public static WebElement productToAddToWishList;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/ol[1]/li[6]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]")
	public static WebElement wishListIconButton;
	@FindBy(xpath = "//body/div[2]/main[1]/div[1]/div[2]")
	public static WebElement addToWishListSuccesMessage;
	@FindBy(xpath = "//span[contains(text(),'Push It Messenger Bag')]")
	public static WebElement productInWishListAssert;
	@FindBy(xpath = "//a[@title = 'Remove This Item']")
	public static WebElement removeIconButton;
	@FindBy(xpath = "//div[contains(text(),'Push It Messenger Bag has been removed from your W')]")
	public static WebElement removedProductFromListAssert;
	@FindBy(xpath = "//button[@title = 'Add All to Cart']")
	public static WebElement addAllToCartButton;
	@FindBy(xpath = "//div[contains(text(),'1 product(s) have been added to shopping cart: \"Pu')]")
	public static WebElement productAddToTheCArtMessageAssert;
	@FindBy(xpath = "//span[contains(text(),'You have no items in your wish list.')]")
	public static WebElement noItemsinYourWiwhListMessageAssert;
	@FindBy(xpath = "//button[@class = 'action switch']")
	public static WebElement accountDropDownButton;
	@FindBy(xpath = "//li[@class = 'link wishlist']")
	public static WebElement myWishListOption;
	@FindBy(xpath = "//h1[@class = 'page-title']")
	public static WebElement myWishListPagePageAssert;
	@FindBy(xpath = "//button[@name = 'save_and_share']")
	public static WebElement shareWishListButton; 
	@FindBy(xpath = "//textarea[@name = 'emails']")
	public static WebElement emailField;
	@FindBy(xpath = "//textarea[@name = 'message']")
	public static WebElement messageField;
	@FindBy(xpath = "//button[@title = 'Share Wish List']")
	public static WebElement shareWishListLastButton;
	@FindBy(xpath = "//div[@data-ui-id = 'message-success']")
	public static WebElement shareWiShListConfirmMessageAssert;
	
	
	// **Methods**//
	public void putTheMouseOnTheProduct() {
		Actions action = new Actions(driver);
		action.moveToElement(productToAddToWishList).perform();
	}

	public void clickOnAddProductToWishListButton() {
		wishListIconButton.click();
	}

	public void productAddToWishListAssert() {
		String assertMessage = addToWishListSuccesMessage.getText();
		assertThat("The product addition message is Not dipslayed!",assertMessage, containsString("Push It Messenger Bag has been added to your Wish List. Click "));
		Assert.assertTrue("The product added is Not displayed!",productInWishListAssert.isDisplayed());
		
	}
	public void clickOnRemoveButton() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", removeIconButton);
	}
	public void removedProductFromWishListAssert() {
		String assertRemovedMessage = removedProductFromListAssert.getText();
		assertThat("The product confirmation deletion message is not deleted!",assertRemovedMessage, containsString("Push It Messenger Bag has been removed from your Wish List."));
		Assert.assertFalse("The product added in the wish list is always displayed",productInWishListAssert.isDisplayed());
	}
	public void clickOnAddAllToCart() {
		addAllToCartButton.click();
	}
	public void productDisappearFromWishList() {
		String addToCart = productAddToTheCArtMessageAssert.getText();
		System.out.println(addToCart);
		assertThat(addToCart,containsString("1 product(s) have been added to shopping cart: \"Push It Messenger Bag\"."));
		String noItemsMessage = noItemsinYourWiwhListMessageAssert.getText();
		assertThat(noItemsMessage,containsString("You have no items in your wish list."));
	}
	public void clickOnAccountDropdownMenu() {
		accountDropDownButton.click();
	}
	public void clickOnMyWishListOption() {
		myWishListOption.click();
	}
	public void myWishListPageAssert() {
		Assert.assertTrue("Wish List Page is Not displayed !",myWishListPagePageAssert.isDisplayed());
	}
	public void clickOnShareWishListButton() {
		shareWishListButton.click();
	}
	public void fillEamailAndMessage(String email, String message) {
		emailField.sendKeys(email);
		messageField.sendKeys(message);
	}
	public void clickOnShareWishListLastButton() {
		shareWishListLastButton.click();
	}
	public void confirmSharingWishListMessagAssert() {
		Assert.assertTrue("The confirm sharing Wish List message is Not displayed ! ",shareWiShListConfirmMessageAssert.isDisplayed());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
