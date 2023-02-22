package com.e2eTests.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.e2e.lumaProject.Base;

public class AccueilPageObjects extends Base {
	
	

	final static String WHATS_NEW_BUTTOM = "//span[contains(text(),\"What's New\")]";
	final static String WHATS_NEW_PAGE_ASSERT = "//strong[contains(text(),\"What's New\")]";
	final static String WOMEN_BUTTON = "//span[contains(text(),'Women')]";
	final static String WOMEN_PAGE_ASSERT = "//strong[contains(text(), 'Women')]";
	final static String MEN_BUTTON = "//span[contains(text(),'Men')]";
	final static String MEN_PAGE_ASSERT = "//strong[contains(text(),'Men')]";
	final static String GEAR_BUTTON = "//span[contains(text(),'Gear')]";
	final static String GEAR_PAGE_ASSERT = "//strong[contains(text(),'Gear')]";
	final static String TRAINING_BUTTON = "//span[contains(text(),'Training')]";
	final static String TRAINING_PAGE_ASSERT = "//strong[contains(text(), 'Training')]";
	final static String SALE_BUTTON = "//span[contains(text(),'Sale')]";
	final static String SALE_PAGE_ASSERT = "//strong[contains(text(),'Sale')]";
	final static String SIGN_IN_BUTTON = "//a[contains(text(), 'Sign In')]";
	final static String SIGN_IN_PAGE_ASSERT = "//span[contains(text(),'Customer Login')]";
	final static String CREAT_AN_ACCOUNT_BUTTON = "//a[contains(text(), 'Create an Account')]";
	final static String CREAT_AN_ACCOUNT_PAGE_ASSERT = "//span[contains(text(),'Create New Customer Account')]";
	final static String CADET_ICON_BUTTON = "/html[1]/body[1]/div[2]/header[1]/div[2]/div[1]/a[1]";
	final static String CADET_CONTENT_DISPLAY = "//strong[contains(text(),'You have no items in your shopping cart.')]";
	final static String SHOPING_NOW_BUTTON = "//span[contains(text(),'Shop New Yoga')]";
	final static String NEW_YOGA_COLLLECTION_PAGE_ASSERT = "//strong[contains(text(),'New Luma Yoga Collection')]";
	final static String TWENTY_PERCENT_OFF_LINK = "//strong[contains(text(),'20% OFF')]";
	final static String PANTS_SHOP_PAGE = "//strong[contains(text(),'Pants')]";
	final static String TEES_LINK = "//span[contains(text(),'Shop Tees')]";
	final static String TEES_SHOP_PAGE_ASSERT = "//strong[contains(text(),'Tees')]";
	final static String SHOP_ERIN_RECOMMENDS_LINK = "//span[contains(text(),'Shop Erin Recommends')]";
	final static String ERIN_RECOMMENDS_SHOP_PAGE = "//strong[contains(text(),'Erin Recommends')]";
	final static String SHOP_PERFORMANCE_LINK = "//span[contains(text(),'Shop Performance')]";
	final static String PERFORMANCE_FABRICS_PAGE_ASSERT = "//strong[contains(text(),'Performance Fabrics')]";
	final static String ECO_FRIENDLY_LINK = "//span[contains(text(),'Shop Eco-Friendly')]";
	final static String ECO_FRIENDLY_PAGE_ASSERT = "//strong[contains(text(),'Eco Friendly')]";

	// **FindBy**//
	@FindBy(how = How.XPATH, using = WHATS_NEW_BUTTOM)
	public static WebElement whatsNewButton;
	@FindBy(how = How.XPATH, using = WHATS_NEW_PAGE_ASSERT)
	public static WebElement whatsNewPageAssert;
	@FindBy(how = How.XPATH, using = WOMEN_BUTTON)
	public static WebElement womenPageButton;
	@FindBy(how = How.XPATH, using = WOMEN_PAGE_ASSERT)
	public static WebElement womenPageAssert;
	@FindBy(how = How.XPATH, using = MEN_BUTTON)
	public static WebElement menPageButton;
	@FindBy(how = How.XPATH, using = MEN_PAGE_ASSERT)
	public static WebElement menPageAssert;
	@FindBy(how = How.XPATH, using = GEAR_BUTTON)
	public static WebElement gearPageButton;
	@FindBy(how = How.XPATH, using = GEAR_PAGE_ASSERT)
	public static WebElement gearPageAssert;
	@FindBy(how = How.XPATH, using = TRAINING_BUTTON)
	public static WebElement trainingPageButton;
	@FindBy(how = How.XPATH, using = TRAINING_PAGE_ASSERT)
	public static WebElement trainingPageAssert;
	@FindBy(how = How.XPATH, using = SALE_BUTTON)
	public static WebElement saleButton;
	@FindBy(how = How.XPATH, using = SALE_PAGE_ASSERT)
	public static WebElement salePageAssert;
	@FindBy(how = How.XPATH, using = SIGN_IN_BUTTON)
	public static WebElement signInButton;
	@FindBy(how = How.XPATH, using = SIGN_IN_PAGE_ASSERT)
	public static WebElement signInPageAssert;
	@FindBy(how = How.XPATH, using = CREAT_AN_ACCOUNT_BUTTON)
	public static WebElement creatAnAccountButton;
	@FindBy(how = How.XPATH, using = CREAT_AN_ACCOUNT_PAGE_ASSERT)
	public static WebElement creatAnAccountPageAssert;
	@FindBy(how = How.XPATH, using = CADET_ICON_BUTTON)
	public static WebElement cadetIcontButton;
	@FindBy(how = How.XPATH, using = CADET_CONTENT_DISPLAY)
	public static WebElement casetContentDisplayAssert;
	@FindBy(how = How.XPATH, using = SHOPING_NOW_BUTTON)
	public static WebElement shopingNowButton;
	@FindBy(how = How.XPATH, using = NEW_YOGA_COLLLECTION_PAGE_ASSERT)
	public static WebElement newYogaCollectionPageAssert;
	@FindBy(how = How.XPATH, using = TWENTY_PERCENT_OFF_LINK)
	public static WebElement twintyPercentOffLink;
	@FindBy(how = How.XPATH, using = PANTS_SHOP_PAGE)
	public static WebElement pantsShopPageAssert;
	@FindBy(how = How.XPATH, using = TEES_LINK)
	public static WebElement teesLink;
	@FindBy(how = How.XPATH, using = TEES_SHOP_PAGE_ASSERT)
	public static WebElement teesPageAssert;
	@FindBy(how = How.XPATH, using = SHOP_ERIN_RECOMMENDS_LINK)
	public static WebElement shopErinCommendsLink;
	@FindBy(how = How.XPATH, using = ERIN_RECOMMENDS_SHOP_PAGE)
	public static WebElement erinCommendsShopPageAssert;
	@FindBy(how = How.XPATH, using = SHOP_PERFORMANCE_LINK)
	public static WebElement shopPerformanceLink;
	@FindBy(how = How.XPATH, using = PERFORMANCE_FABRICS_PAGE_ASSERT)
	public static WebElement performanceFabricsPageAssert;
	@FindBy(how = How.XPATH, using = ECO_FRIENDLY_LINK)
	public static WebElement ecoFriendlylink;
	@FindBy(how = How.XPATH, using = ECO_FRIENDLY_PAGE_ASSERT)
	public static WebElement ecoFriendlyPageAssert;
	
	
	// **Methods**//

	public void clickOnWhatsNewButton() {
		whatsNewButton.click();
	}

	public void WhatsNewPageAssert() {
		Assert.assertTrue("What's New page is Not displayed !", whatsNewPageAssert.isDisplayed());
	}

	public void clickOnWomenBtton() {
		womenPageButton.click();
	}

	public void womenPageAssert() {
		Assert.assertTrue(" Women page is Not displayed !", womenPageAssert.isDisplayed());
	}

	public void clickOnMenButton() {
		menPageButton.click();
	}

	public void menPageAssert() {
		Assert.assertTrue(" Men page is Not displayed !", menPageAssert.isDisplayed());
	}

	public void clickOnGearButton() {
		gearPageButton.click();
	}

	public void gearPageAssert() {
		Assert.assertTrue(" Gear page is Not displayed !", gearPageAssert.isDisplayed());
	}

	public void clickOnTrainingBtton() {
		trainingPageButton.click();
	}

	public void trainingPageAssert() {
		Assert.assertTrue(" Training page is Not displayed !", trainingPageAssert.isDisplayed());
	}

	public void clickOnSaleButton() {
		saleButton.click();
	}

	public void salePageAssert() {
		Assert.assertTrue("Sale page is Not displayed !", salePageAssert.isDisplayed());
	}

	public void clickOnSignInButton() {
		signInButton.click();
	}

	public void signInPageAssert() {
		Assert.assertTrue("SignIn page is Not displayed !", signInPageAssert.isDisplayed());
	}

	public void clickOnCreatAnAccountButton() {
		creatAnAccountButton.click();
	}

	public void creatAnAccountPageAssert() {
		Assert.assertTrue(" Creat An Account page is Not displayed !", creatAnAccountPageAssert.isDisplayed());
	}

	public void clickOnCadetIconButton() {
		cadetIcontButton.click();
	}

	public void cadetContentDisplay() {
		Assert.assertTrue("Cadet message is Not displayed !", casetContentDisplayAssert.isDisplayed());
	}

	public void clickOnShopingNowButton() {
		shopingNowButton.click();
	}

	public void newYogaCollectionPageAssert() {
		Assert.assertTrue(" New Yoga Collection page is Not displayed !",newYogaCollectionPageAssert.isDisplayed());
	}

	public void clickOnTwentyPercentOffLink() {
		twintyPercentOffLink.click();
	}

	public void pantShoopingPageAssert() {
		Assert.assertTrue(" Shopping Now page is Not displayed !",pantsShopPageAssert.isDisplayed());
	}

	public void clickOnTeesLink() {
		teesLink.click();
	}

	public void teesShopPageAssert() {
		Assert.assertTrue("Tees page is Not displayed !",teesPageAssert.isDisplayed());
	}
	public void clickOnErinRecommendsLink() {
		shopErinCommendsLink.click();
	}
	public void erinCommendsShopPageAssert() {
		Assert.assertTrue("Erin Recommends page is Not displayed !",erinCommendsShopPageAssert.isDisplayed());
	}
	public void clickOnPerformanceLink() {
		shopPerformanceLink.click();
	}
	public void performanceFabricsPageAssert() {
		Assert.assertTrue("Performance Fabrics page is Not displayed !",performanceFabricsPageAssert.isDisplayed());
	}
	public void clickOnEcoFriendlyLink() {
		ecoFriendlylink.click();
	}
	public void ecoFriendlyPageAssert() {
		Assert.assertTrue("Eco Friendly page is Not displayed !",ecoFriendlyPageAssert.isDisplayed());
	}
	
	
	
	
	
	
}
