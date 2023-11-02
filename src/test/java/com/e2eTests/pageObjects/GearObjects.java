package com.e2eTests.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.e2e.lumaProject.Base;

public class GearObjects extends Base{
	
	
	//**FindBy**//
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/a[1]/span[2]")
	public static WebElement gearButton;
	@FindBy(xpath = "//body/div[1]/main[1]/div[4]/div[2]/div[1]/div[2]/dl[1]/dd[1]/ol[1]/li[1]/a[1]")
	public static WebElement bagsButton;
	@FindBy(xpath = "//strong[contains(text(),'Bags')]")
	public static WebElement bagsPageAssert;
	@FindBy(xpath = "//body/div[1]/main[1]/div[4]/div[2]/div[1]/div[2]/dl[1]/dd[1]/ol[1]/li[2]/a[1]")
	public static WebElement fitnessEquipmentButton;
	@FindBy(xpath = "//strong[contains(text(),'Fitness Equipment')]")
	public static WebElement fitnessEquipmentPageAssert;
	@FindBy(xpath = "//body/div[1]/main[1]/div[4]/div[2]/div[1]/div[2]/dl[1]/dd[1]/ol[1]/li[3]/a[1]")
	public static WebElement watchesButton;
	@FindBy(xpath = "//strong[contains(text(),'Watches')]")
	public static WebElement watchesPageAssert;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")
	public static WebElement bagsHiddenOption;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]/span[1]")
	public static WebElement fitnessEquipmentHiddenOption;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")
	public static WebElement watchesHiddenOption ;
	
	
	//**Methods**//
	public void clickOnGearLink() {
		gearButton.click();
	}
	public void clickOnBags() {
		bagsButton.click();
	}
	public void bagsPageAssert() {
		Assert.assertTrue(bagsPageAssert.isDisplayed());
	}
	public void clickOnFitnessEquipmentLink() {
		fitnessEquipmentButton.click();
	}
	public void fitnessEquipmentPageAssert() {
		Assert.assertTrue(fitnessEquipmentPageAssert.isDisplayed());
	}
	public void clickOnWatchesLink() {
		watchesButton.click();
	}
	public void watchesPageAssert() {
		Assert.assertTrue(watchesPageAssert.isDisplayed());
	}
	public void clickOnBagsHiddenOption() {
		Actions action = new Actions(driver);
		action.moveToElement(gearButton).perform();
		action.moveToElement(bagsHiddenOption).click().perform();
	}

	public void clickOnFitnessEquipmentHiddenOption() {
		Actions action = new Actions(driver);
		action.moveToElement(gearButton).perform();
		action.moveToElement(fitnessEquipmentHiddenOption).click().perform();
	}
	public void clickOnWatchesHiddenOption() {
		Actions action = new Actions(driver);
		action.moveToElement(gearButton).perform();
		action.moveToElement(watchesHiddenOption).perform();
		watchesHiddenOption.click();
	}

















}
