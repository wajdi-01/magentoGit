package com.e2eTests.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.e2e.lumaProject.Base;

public class MenOpbjects extends Base {
	
	
	//**FIndBy**//
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]/span[2]")
	public static WebElement menOptionButton;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[2]")
	public static WebElement topsOption;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	public static WebElement jacketsOptionMen;
	
	@FindBy(xpath = "//strong[contains(text(),'Jackets')]")  
	public static WebElement jacketsPageAssert;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")
	public static WebElement hoodiesSweatshirts; 
	@FindBy(xpath = "//strong[contains(text(),'Hoodies & Sweatshirts')]")
	public static WebElement hoodiesSweatshirtsAssert;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[3]/a[1]/span[1]" )
	public static WebElement teesOption;
	@FindBy(xpath = "//strong[contains(text(),'Tees')]")
	public static WebElement teesOptionAssert;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]")
	public static WebElement tanksOption;
	@FindBy(xpath = "//strong[contains(text(),'Tanks')]")
	public static WebElement tanksAssert;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")
	public static WebElement pantsOption;
	@FindBy(xpath = "//strong[contains(text(),'Pants')]")
	public static WebElement pantsOptionAssert;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[2]")
	public static WebElement BottomsOption;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]" )
	public static WebElement shortsOption;
	@FindBy(xpath = "//strong[contains(text(),'Shorts')]")
	public static WebElement shortsAssert;
	@FindBy(xpath = "//a[contains(text(),'Tops')]")
	public static WebElement topButton;
	@FindBy(xpath = "//strong[contains(text(),'Tops')]") 
	public static WebElement TopAssert;
	@FindBy(xpath = "//a[contains(text(),'Bottoms')]")
	public static WebElement buttomsButton;
	@FindBy(xpath = "//strong[contains(text(),'Bottoms')]")
	public static WebElement buttomsAssert;
	@FindBy(xpath = "//a[contains(text(),'Hoodies & Sweatshirts')]")
	public static WebElement hoodiesSweatshirtsButton;
	@FindBy(xpath = "//a[contains(text(),'Jackets')]")
	public static WebElement JacketButton;
	@FindBy(xpath = "//a[contains(text(),'Tees')]")
	public static WebElement tessButton;
	@FindBy(xpath = "//a[contains(text(),'Tanks')]")
	public static WebElement tanksButton;
	@FindBy(xpath = "//a[contains(text(),'Pants')]")
	public static WebElement pantsButton;
	@FindBy(xpath = "//a[contains(text(),'Shorts')]")
	public static WebElement shortsButton;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]/span[2]")
	public static WebElement menButton;
	
	//**Methods**//
		public void clickOnHidenJackets() {
			Actions action = new Actions(driver);
			action.moveToElement(menOptionButton).perform();
			action.moveToElement(topsOption).perform();
			action.moveToElement(jacketsOptionMen).click().perform();
			
		}
		public void jacketsPageAssert() {
			Assert.assertTrue("Jackts page is not Displayed !",jacketsPageAssert.isDisplayed());
		}
		public void clickOnHidenhoodiesSweatshirts() {
			Actions action = new Actions(driver);
			action.moveToElement(menOptionButton).perform();
			action.moveToElement(topsOption).perform();
			action.moveToElement(hoodiesSweatshirts).click().perform();
		}
		public void hoodiesSweatshirtsAssert() {
			Assert.assertTrue("Hoodies and SweatShirts page is not Displayed !",hoodiesSweatshirtsAssert.isDisplayed());
		}
		public void clickOnHidenTees() {
			Actions action = new Actions(driver);
			action.moveToElement(menOptionButton).perform();
			action.moveToElement(topsOption).perform();
			action.moveToElement(teesOption).click().perform();
		}
		public void teesAssert() {
			Assert.assertTrue("Tees page is not Displayed !",teesOptionAssert.isDisplayed());
		}
		public void clickOnHidenTenanks() {
			Actions action = new Actions(driver);
			action.moveToElement(menOptionButton).perform();
			action.moveToElement(topsOption).perform();
			action.moveToElement(tanksOption).click().perform();
		}
		
		public void tanksAssert() {
			Assert.assertTrue("Bras page is not Displayed !",tanksAssert.isDisplayed());
		}
		public void clickOnHidenPants() {
			Actions action = new Actions(driver);
			action.moveToElement(menOptionButton).perform();
			action.moveToElement(BottomsOption).perform();
			action.moveToElement(pantsOption).click().perform();
		}
		public void pantsAssert() {
			Assert.assertTrue(" Pants page is not Displayed !",pantsOptionAssert.isDisplayed());
		}
		public void clickOnHidenShorts() {
			Actions action = new Actions(driver);
			action.moveToElement(menOptionButton).perform();
			action.moveToElement(BottomsOption).perform();
			action.moveToElement(shortsOption).click().perform();
		}
		public void shortsAssert() {
			Assert.assertTrue(shortsAssert.isDisplayed());
		}
		public void clickOnTopButton() {
			topButton.click();
		}
		public void topAssert() {
			Assert.assertTrue(TopAssert.isDisplayed());
		}
		public void clickOnBottomsButton() {
			buttomsButton.click();
		}
		public void bottomsAssert() {
			Assert.assertTrue(buttomsAssert.isDisplayed());
		}
		public void clickOnHoodiesSweatshirts() {
			hoodiesSweatshirtsButton.click();
		}
		public void clickOnJacketButton() {
			JacketButton.click();
		}
		public void clickOnTeesButton() {
			tessButton.click();
		}
		public void clickOnBrasTanksButton() {
			tanksButton.click();
		}
		public void clickOnPantsButton() {
			pantsButton.click();
		}
		public void clickOnShortsButton() {
			shortsButton.click();
		}
		public void clickOnMenButton() {
			menButton.click();
		}

}
