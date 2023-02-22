package com.e2eTests.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.e2e.lumaProject.Base;

public class CartObjects extends Base {

	// **FindBy**//    
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[12]/div[1]/a[1]/span[1]/span[1]/img[1]")
	public static WebElement productToAddToCart;
	@FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[12]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]")
	public static WebElement addCartHiddenButton;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	public static WebElement sizeOption;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")
	public static WebElement colorOption;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]")
	public static WebElement productAddCartButton;
	@FindBy(xpath = "//header/div[2]/div[1]/a[1]")
	public static WebElement cartIconButton;
	@FindBy(xpath = "//a[contains(text(),'Nadia Elements Shell')]")
	public static WebElement productAlreadyAddedAssert;
	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
	public static WebElement itemInCart; 
	@FindBy(xpath = "//div[@for = 'super_attribute[143]']")
	public static WebElement sizeErrorMessage;
	@FindBy(xpath = "//div[@for = 'super_attribute[143]']")
	public static WebElement colorErrorMessage;
	@FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[7]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]")
	public static WebElement addCartHiddenButtonForFailed;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[7]/div[1]/a[1]/span[1]/span[1]/img[1]")
	public static WebElement productToAddToCartFailedCase;
	@FindBy(xpath = "//button[@id='product-addtocart-button']")
	public static WebElement addCartConfirmButton;
	@FindBy(xpath = "//header/div[2]/a[1]/img[1]")
	public static WebElement homeLogoButton;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[4]/div[1]/a[1]/span[1]/span[1]/img[1]")
	public static WebElement product;
	@FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[4]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]")
	public static WebElement addCartHiddenProduct;
	@FindBy(xpath = "//div[@id='option-label-size-143-item-172']")
	public static WebElement sizeProduct;
	@FindBy(xpath = "//div[@id='option-label-color-93-item-57']")
	public static WebElement colorProduct;
	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[2]/a[1]")
	public static WebElement deleteButton;
	@FindBy(xpath = "//body/div[4]/aside[2]/div[2]/footer[1]/button[2]")
	public static WebElement confirmDelete;
	@FindBy(xpath = "//strong[@class = 'subtitle empty']")
	public static WebElement confirmDeleteMessage;
	
	
	
	// **Methods**//
	public void selctProduct() {
		Actions action = new Actions(driver);
		action.moveToElement(productToAddToCart).perform();
		action.click(addCartHiddenButton).perform();
	}

	public void productSizeColor() {
		sizeOption.click();
		colorOption.click();
	}

	public void clickOnAddCartButton() {
		productAddCartButton.click();
	}

	public void productAlreadyAddedAssert() throws InterruptedException {
		Thread.sleep(3000);
		cartIconButton.click();
		String cartItem = itemInCart.getText();
		int expectedValue = 1;
		int actualValue = Integer.parseInt(cartItem);
		Assert.assertEquals(actualValue, expectedValue);
	}

	
	
	public void selectProductFailedcase() {
		Actions action = new Actions(driver);
		action.moveToElement(productToAddToCartFailedCase).perform();
		action.click(addCartHiddenButtonForFailed).perform();
	}
	
	public void clickAddToCartFailedCase() {
		addCartConfirmButton.click();
	}

	public void failedAddProduct() {
		Assert.assertTrue(sizeErrorMessage.isDisplayed());
		Assert.assertTrue(colorErrorMessage.isDisplayed());
	}

	public void selectProductClickAddToCart() {
			Actions action = new Actions(driver);
			action.moveToElement(product).perform();
			action.click(addCartHiddenProduct).perform();
		}
	public void shooseProductColorSize() {
		sizeProduct.click();
		colorProduct.click();
	}
	public void clickOnHomeLogo() {
		homeLogoButton.click();
	}
	public void addTowProductAssert() throws InterruptedException {
		Thread.sleep(3000);
		cartIconButton.click();
		String cartItem = itemInCart.getText();
		int expectedValue = 2;
		int actualValue = Integer.parseInt(cartItem);
		Assert.assertEquals(actualValue, expectedValue);
		
	}
	
	public void clickOnCartIcon() {
		cartIconButton.click();
	}
	public void deleteProduct() {
		deleteButton.click();
		confirmDelete.click();
		
	}
	public void deleteProductAssert() {
		String corfirmDeleteMessage = confirmDeleteMessage.getText();
		Assert.assertEquals(corfirmDeleteMessage, "You have no items in your shopping cart.");
	}
	
	
	
	
	
	
	
	
	
	
}
