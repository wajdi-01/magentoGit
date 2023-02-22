package com.e2eTests.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2e.lumaProject.Base;

public class WhatsNewObjects extends Base {
	
	
	final static String HOODIES_AND_SWEAT_LINK = "//body/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]";
	final static String HOODIES_SWEAT_ASSERT = "//strong[contains(text(),'Hoodies & Sweatshirts')]"; 
	final static String JACKET_LINK = "//body/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]";
	final static String JAKET_ASSERT = "//strong[contains(text(),'Jackets')]";
	final static String BARS_TANKS_LINK = "//a[contains(text(),'Bras & Tanks')]";
	final static String BRAS_TANKS_ASSERT = "//strong[contains(text(),'Bras & Tanks')]";
	final static String PANTS_LINK = "//body/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]";
	final static String PANTS_ASSERT = "//strong[contains(text(),'Pants')]";
	final static String SHORTS_LINK = "//body/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]";
	final static String SHORT_ASSERT = "//strong[contains(text(),'Shorts')]";
	
	final static String HOODIES_AND_SWEAT_MEN = "//body/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[2]/li[1]/a[1]";
	final static String JACKET_MENS = "//body/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[2]/li[2]/a[1]";
	final static String TANKS_MENS = "//body/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[2]/li[4]/a[1]";
	final static String PANTS_MENS = "//body/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[2]/li[5]/a[1]";
	final static String SHORTS_MENS = "//body/div[2]/main[1]/div[4]/div[2]/div[1]/div[1]/ul[2]/li[6]/a[1]";
	
	
	//**FindBy**//
	@FindBy(how = How.XPATH, using = HOODIES_AND_SWEAT_LINK)
	public static WebElement hoodiesSweatLink;
	@FindBy(how = How.XPATH, using = HOODIES_SWEAT_ASSERT)
	public static WebElement hoodiesSweatLinkAssert;
	@FindBy(how = How.XPATH, using = JACKET_LINK)
	public static WebElement jacketLink;
	@FindBy(how = How.XPATH, using = JAKET_ASSERT)
	public static WebElement jacketAssert;
	@FindBy(how = How.XPATH, using = BARS_TANKS_LINK)
	public static WebElement brasTanksLink;
	@FindBy(how = How.XPATH, using = BRAS_TANKS_ASSERT)
	public static WebElement brasTanksAssert;
	@FindBy(how = How.XPATH, using = PANTS_LINK)
	public static WebElement pantsLink;
	@FindBy(how = How.XPATH, using = PANTS_ASSERT)
	public static WebElement pantsLinksAssert;
	@FindBy(how = How.XPATH, using = SHORTS_LINK)
	public static WebElement shortLink;
	@FindBy(how = How.XPATH, using = SHORT_ASSERT)
	public static WebElement shortLinkAssert;
	
	@FindBy(how = How.XPATH, using = HOODIES_AND_SWEAT_MEN)
	public static WebElement hoodiesSweatMen;
	@FindBy(how = How.XPATH, using = JACKET_MENS)
	public static WebElement jacketMens;
	@FindBy(how = How.XPATH, using = TANKS_MENS)
	public static WebElement tanksMens;
	@FindBy(how = How.XPATH, using = PANTS_MENS)
	public static WebElement pantsMens;
	@FindBy(how = How.XPATH, using = SHORTS_MENS)
	public static WebElement shortsMens;
	
	
	//**Methods**//
	
	public void clickOnEachWomensCategory() {
		hoodiesSweatLink.click();
		Assert.assertTrue(hoodiesSweatLinkAssert.isDisplayed());
		driver.navigate().back();
		
		jacketLink.click();
		Assert.assertTrue(jacketAssert.isDisplayed());
		driver.navigate().back();
		
		brasTanksLink.click();
		Assert.assertTrue(brasTanksAssert.isDisplayed());
		driver.navigate().back();
		
		pantsLink.click();
		Assert.assertTrue(pantsLinksAssert.isDisplayed());
		driver.navigate().back();
		
		shortLink.click();
		Assert.assertTrue(shortLinkAssert.isDisplayed());
		}
	
	public void clickOnEachMensCategory() {
		hoodiesSweatMen.click();
		Assert.assertTrue(hoodiesSweatLinkAssert.isDisplayed());
		driver.navigate().back();
		
		jacketLink.click();
		Assert.assertTrue(jacketAssert.isDisplayed());
		driver.navigate().back();
		
		
	}
	
}
